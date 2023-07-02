package com.api.sistemagestaotarefas.controlador;

import com.api.sistemagestaotarefas.dominio.Tarefa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")


public class TarefaControlador {

    @GetMapping
    public List<Tarefa> listar() {
        
    }

}
