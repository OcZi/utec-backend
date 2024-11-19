package com.github.utec.utecbackend.programa.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProgramaCreateDto {
    private String nombre;
    private String ubicacion;
    private LocalDate tiempo;
}
