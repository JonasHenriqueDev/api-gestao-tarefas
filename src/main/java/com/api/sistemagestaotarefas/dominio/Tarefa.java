package com.api.sistemagestaotarefas.dominio;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(columnDefinition = "BOOLEAN")
    private Boolean concluida;

}
