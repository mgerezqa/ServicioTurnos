package com.example.CrudJPAHibernateTodoCode.service;


import com.example.CrudJPAHibernateTodoCode.domain.Turno;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ITurnoService {

    public List<Turno> getTurnos();
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);
    public void deleteTurno(Long id);
    public Turno findTurno(Long id);
    public void updateTurno(Long id, Turno turno);

    void saveTurnoLocalTest(LocalDate fecha, String tratamiento, String nombreCompletoPaciente);
}
