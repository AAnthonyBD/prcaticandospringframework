package com.anthonydelacruz.prcaticandospringframework.modelos;

import jakarta.persistence.GenerationType;

import javax.persistence.*;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;
    private String mensaje;
    private String curso;
    private String titulo;

    // Getters y Setters
}
