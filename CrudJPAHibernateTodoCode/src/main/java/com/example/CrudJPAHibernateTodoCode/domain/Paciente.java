package com.example.CrudJPAHibernateTodoCode.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor // Constructor sin argumentos generado por Lombok
@AllArgsConstructor // Constructor con todos los argumentos generado por Lombok
@Getter @Setter

public class Paciente {
    private Long idPaciente;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String telefono;


}