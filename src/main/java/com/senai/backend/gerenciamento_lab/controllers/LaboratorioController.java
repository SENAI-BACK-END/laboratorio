package com.senai.backend.gerenciamento_lab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.gerenciamento_lab.models.Laboratorio;
import com.senai.backend.gerenciamento_lab.services.LaboratorioService;

@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {

    @Autowired
    private LaboratorioService laboratorioService;

    @PostMapping("/cadastrar")
    public Laboratorio cadastrar (@RequestBody Laboratorio laboratorio) {
        return laboratorioService.cadastrar(laboratorio);
    }

    @GetMapping("/recuperar-po-id/{id}")
    public Laboratorio recuperarPorId(@PathVariable Integer id) {
        return laboratorioService.recuperarPorId(id);
    }
    @GetMapping("/listar-todos")
    public List<Laboratorio> listarTodos(){
        return laboratorioService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Laboratorio atualizar(@PathVariable Integer id, @RequestBody Laboratorio laboratorio) {
        return laboratorioService.atualizar(id, laboratorio);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarPorId(@PathVariable Integer id) {
        if (laboratorioService.removerPorId(id)) {
            return "Laboratorio removido com sucesso";
        }
        return "Falha ao remover o Laboratorio";
    }

     @GetMapping("/contar")
    public Long contar(){
        return laboratorioService.contar();
    }
}