package com.senai.backend.gerenciamento_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.gerenciamento_lab.models.Laboratorio;

@Repository

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Integer>{
    
}