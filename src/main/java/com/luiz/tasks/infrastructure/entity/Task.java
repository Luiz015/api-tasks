package com.luiz.tasks.infrastructure.entity;

import java.time.LocalDateTime;

import com.luiz.tasks.business.enums.StatusTask;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private StatusTask status = StatusTask.PENDENTE;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private LocalDateTime dataConclusao;
    private LocalDateTime dataAtualizacao;

}
