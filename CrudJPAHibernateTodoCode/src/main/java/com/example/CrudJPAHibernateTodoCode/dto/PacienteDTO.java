package com.example.CrudJPAHibernateTodoCode.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor // Constructor sin argumentos generado por Lombok
@AllArgsConstructor // Constructor con todos los argumentos generado por Lombok
@Getter @Setter

public class PacienteDTO {
    private Long idPaciente;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String telefono;


}