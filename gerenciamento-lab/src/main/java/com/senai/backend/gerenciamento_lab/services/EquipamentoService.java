package com.senai.backend.gerenciamento_lab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.repositories.EquipamentoRepository;

    
@Service
public class EquipamentoService {
  

    @Autowired
    private EquipamentoRepository EquipamentoRepository;
    
    public Equipamento cadastrar(Equipamento equipamento) {
        return EquipamentoRepository.save(equipamento);

    }

    public Equipamento recuperarPorId(Integer id) {
        return EquipamentoRepository.findById(id).get();
    
    }

    public List<Equipamento> listarTodos() {
        return EquipamentoRepository.findAll();
    }

    public Equipamento atualizar(Integer id, Equipamento equipamento) {
        Equipamento merc = EquipamentoRepository.findById(id).get();
        if(merc != null) {
            equipamento.setId(merc.getId());
            return EquipamentoRepository.save(equipamento);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
         Equipamento merc = EquipamentoRepository.findById(id).get();
        if(merc != null) {
            EquipamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }   
}
