package com.senai.backend.gerenciamento_lab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Laboratorio;
import com.senai.backend.gerenciamento_lab.repositories.LaboratorioRepository;

@Service
public class LaboratorioService {
  

    @Autowired
    private LaboratorioRepository laboratorioRepository;
    
    public Laboratorio cadastrar(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);

    }

    public Laboratorio recuperarPorId(Integer id) {
        return laboratorioRepository.findById(id).get();
    
    }

    public List<Laboratorio> listarTodos() {
        return laboratorioRepository.findAll();
    }

    public Laboratorio atualizar(Integer id, Laboratorio laboratorio) {
        Laboratorio merc = laboratorioRepository.findById(id).get();
        if(merc != null) {
            laboratorio.setId(merc.getId());
            return laboratorioRepository.save(laboratorio);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
         Laboratorio merc = laboratorioRepository.findById(id).get();
        if(merc != null) {
            laboratorioRepository.deleteById(id);
            return true;
        }
        return false;
    }   
}
