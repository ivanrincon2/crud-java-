package com.example.softuefi.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="equipos")
public class equiposModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String numeroSerie;
    @Column
    private String marca;
    @Column
    private String estado;
}
