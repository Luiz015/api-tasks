package com.luiz.tasks.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.tasks.business.enums.StatusTask;
import com.luiz.tasks.infrastructure.entity.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findByTitulo(String titulo);

    List<Task> findByStatus(StatusTask status);
}
