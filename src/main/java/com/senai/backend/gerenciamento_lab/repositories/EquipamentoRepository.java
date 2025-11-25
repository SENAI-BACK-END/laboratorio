package com.senai.backend.gerenciamento_lab.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.gerenciamento_lab.models.Equipamento;


@Repository

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>{
    
}