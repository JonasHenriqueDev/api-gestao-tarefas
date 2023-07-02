package com.api.sistemagestaotarefas.servico;

import com.api.sistemagestaotarefas.dominio.Tarefa;
import com.api.sistemagestaotarefas.repositorio.TarefaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServico {

    @Autowired
    private TarefaRepositorio tarefaRepositorio;

    public List<Tarefa> findAll() {
        return tarefaRepositorio.findAll();
    }

    public Tarefa findTarefaById(Long id) {
        return tarefaRepositorio.findById(id).get();
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepositorio.save(tarefa);
    }
}
