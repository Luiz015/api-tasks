package com.luiz.tasks.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.tasks.business.enums.StatusTask;
import com.luiz.tasks.business.services.TaskService;
import com.luiz.tasks.infrastructure.entity.Task;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    
    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> salvarTask(@RequestBody Task task){
        return ResponseEntity.accepted().body(taskService.salvarTask(task));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarTask(@RequestParam String titulo){
        taskService.deletarTask(titulo);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/titulo")
    public ResponseEntity<Task> buscarTaskTitulo(@RequestParam String titulo){
        return ResponseEntity.ok().body(taskService.buscarTaskTitulo(titulo));
    }

    @GetMapping("/status") 
    public ResponseEntity<List<Task>> buscarTaskStatus(@RequestParam StatusTask status){
        return ResponseEntity.ok().body(taskService.buscarTaskStatus(status));
    }

    @PutMapping
    public ResponseEntity<Task> atualizarTask(@RequestParam String titulo, @RequestBody Task task){
        return ResponseEntity.accepted().body(taskService.atualizarTask(titulo, task));
    }

}
