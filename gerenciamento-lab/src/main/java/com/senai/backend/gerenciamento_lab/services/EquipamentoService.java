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
    
    public Equipamento cadastrar(Equipamento equipmaneto) {
        return EquipamentoRepository.save(equipmaneto);

    }

    public Equipamento recuperarPorId(Integer id) {
        return EquipamentoRepository.findById(id).get();
    
    }

    public List<Equipamento> listarTodos() {
        return EquipamentoRepository.findAll();
    }

    public Equipamento atualizar(Integer id, Equipamento equipmaneto) {
        Equipamento merc = EquipamentoRepository.findById(id).get();
        if(merc != null) {
            equipmaneto.setId(merc.getId());
            return EquipamentoRepository.save(equipmaneto);
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
