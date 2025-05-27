package com.javeriana.parcial.parcial.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContratoDTO {

    private long id;
    private String identificado;
    private double valor;
    private String nombre_contratante;
    private String documento_contratante;
    private String nombre_contratista;
    private String documento_contratista;
    private LocalDate fecha_inicial;
    private LocalDate fecha_final;

    private Long id_entidad;
    
}
