package com.api.sistemagestaotarefas.controlador;

import com.api.sistemagestaotarefas.dominio.Tarefa;
import com.api.sistemagestaotarefas.servico.TarefaServico;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")


public class TarefaControlador {

    @Autowired
    private TarefaServico tarefaServico;

    @GetMapping("/listar")
    public List<Tarefa> listar() {
        return tarefaServico.findAll();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Tarefa> buscaPorId(@PathVariable("id") Long id) {
        Tarefa entity = tarefaServico.findTarefaById(id);
        return ResponseEntity.ok(entity);
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa adicionar(@RequestBody Tarefa tarefa) {
        return tarefaServico.salvarTarefa(tarefa);
    }

    @PutMapping("/atualizar/{id}")
    public Tarefa atualizarPorId(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa tarefaAtual = tarefaServico.findTarefaById(id);
        BeanUtils.copyProperties(tarefa, tarefaAtual, "id");
        return tarefaServico.salvarTarefa(tarefaAtual);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable("id") Long id) {
        tarefaServico.deletarTarefaPorId(id);
    }

}
