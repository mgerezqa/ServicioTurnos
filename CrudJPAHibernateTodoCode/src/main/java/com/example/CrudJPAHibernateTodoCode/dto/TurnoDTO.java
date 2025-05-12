package com.example.CrudJPAHibernateTodoCode.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


/*
* Es necesario para crear un turno en base a la plantilla del metodo crear
* la cual espera los parametros fecha,tratamiento y dniPaciente.
* Se utiliza como clase auxiliar para recibir un dato acorde a los parametros que esperamos.
* */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente; //Lo obtendremos del microservicio pacientes
}
