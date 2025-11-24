package com.senai.backend.gerenciamento_lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="equipamento")
public class Equipamento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer Id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;
}