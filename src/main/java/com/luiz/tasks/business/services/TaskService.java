package com.luiz.tasks.business.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


import org.springframework.stereotype.Service;

import com.luiz.tasks.business.enums.StatusTask;
import com.luiz.tasks.infrastructure.entity.Task;
import com.luiz.tasks.infrastructure.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    private final TaskRepository taskRepository;

    public Task salvarTask(Task task){
        Task tarefa = taskRepository.findByTitulo(task.getTitulo());

        if (Objects.nonNull(tarefa)) {
            throw new RuntimeException("Essa tarefa já existe");
        }
        return taskRepository.save(task);
    }

    public void deletarTask( String titulo){
        Task tarefa = taskRepository.findByTitulo(titulo);

        if(Objects.isNull(tarefa)){
            throw new RuntimeException("Essa tarefa não existe");
        }

        taskRepository.delete(tarefa);
    }

    public Task buscarTaskTitulo(String titulo){
        Task tarefa = taskRepository.findByTitulo(titulo);

        if(Objects.isNull(tarefa)){
            throw new RuntimeException("Essa tarefa não existe");
        }

        return tarefa;
    }

    public List<Task> buscarTaskStatus(StatusTask status){
        return taskRepository.findByStatus(status);
    }

    public Task atualizarTask(String titulo, Task task){
        Task tarefa = taskRepository.findByTitulo(titulo);

        if(Objects.isNull(tarefa)){
            throw new RuntimeException("Essa tarefa não existe");
        }

        tarefa.setTitulo(task.getTitulo());
        tarefa.setDataAtualizacao(LocalDateTime.now());
        tarefa.setDescricao(task.getDescricao());
        tarefa.setStatus(task.getStatus());
        tarefa.setDataConclusao(task.getDataConclusao());
        if (tarefa.getStatus() == StatusTask.CONCLUIDA) {
            tarefa.setDataConclusao(LocalDateTime.now());
        }

        return taskRepository.save(tarefa);
    }
}
