package com.senai.backend.gerenciamento_lab.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="laboratorio")
public class Laboratorio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer Id;

    @Column(name="nome")
    private String nome;

    @Column(name="localizacao")
    private String localizacao;

    @ManyToMany
    @JoinTable(
        name="funcionario_equipamento",
        joinColumns=@JoinColumn(name="id_laboratorio", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="id_equipamento", referencedColumnName="id")
    )
    private List<Equipamento> equipamento;
}