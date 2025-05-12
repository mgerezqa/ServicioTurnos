package com.example.CrudJPAHibernateTodoCode.service;


import com.example.CrudJPAHibernateTodoCode.domain.Paciente;
import com.example.CrudJPAHibernateTodoCode.domain.Turno;
import com.example.CrudJPAHibernateTodoCode.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class TurnoService implements ITurnoService {

    //
    @Autowired
    private TurnoRepository turnoRepository;

    @Autowired
    private RestTemplate apiConsumir; //misma denominación que @Bean

    @Override
    public List<Turno> getTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public void saveTurno(LocalDate fecha, String tratamiento,String dniPaciente) {

        //busco el paciente por dni en el servicio de pacientes
        Paciente pac = apiConsumir.getForObject("http://localhost:8080/paciente/traerPorDni/" + dniPaciente,
                Paciente.class);
        String nombreCompletoPaciente = pac.getNombre()+" "+pac.getApellido();

        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompletoPaciente);
        turnoRepository.save(turno);

    }

    @Override
    public void saveTurnoLocalTest(LocalDate fecha, String tratamiento, String nombreCompletoPaciente) {
        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompletoPaciente);
        turnoRepository.save(turno);
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    @Override
    public void updateTurno(Long id, Turno turno) {
        Turno turn = this.findTurno(id);
        turn.setFecha(turno.getFecha());
        turn.setTratamiento(turno.getTratamiento());
        turn.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());
        turnoRepository.save(turn);

    }




}
