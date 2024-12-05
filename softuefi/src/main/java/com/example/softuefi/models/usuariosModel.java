package com.example.softuefi.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="usuarios")
public class usuariosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column(name="email", unique = true, nullable = false)
    private String email;
}
