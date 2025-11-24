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

    public Laboratorio() {
    }

    public Laboratorio(Integer Id, List<Equipamento> equipamento, String localizacao, String nome) {
        this.Id = Id;
        this.equipamento = equipamento;
        this.localizacao = localizacao;
        this.nome = nome;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }
}