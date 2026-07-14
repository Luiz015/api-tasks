package com.luiz.tasks.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.tasks.infraestructure.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
