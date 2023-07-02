package com.api.sistemagestaotarefas.repositorio;


import com.api.sistemagestaotarefas.dominio.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepositorio extends JpaRepository<Tarefa, Long> {

}
