package com.example.CrudJPAHibernateTodoCode.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id_turno;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    private String tratamiento;
    private String nombreCompletoPaciente; //Lo obtendremos del microservicio pacientes


}
