package com.example.CrudJPAHibernateTodoCode.controller;

import com.example.CrudJPAHibernateTodoCode.domain.Turno;
import com.example.CrudJPAHibernateTodoCode.dto.TurnoDTO;
import com.example.CrudJPAHibernateTodoCode.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class TurnoController {

    @Autowired
    private ITurnoService iTurnoService;

    @GetMapping("/turnos/get")
    public List<Turno> getTurnos() {
        return iTurnoService.getTurnos();
    }

    /*
        /turnos/crear
        Guarda de el turno luego de consultar el dni del paciente
        con el microservicio de pacientes.

     */
    @PostMapping("/turnos/crear")
    public String postTurno(@RequestBody TurnoDTO turno) {
        iTurnoService.saveTurno(turno.getFecha(), turno.getTratamiento(), turno.getDniPaciente());
        return "Turno creado correctamente";
    }

    /*
    * /turnos/post
    * Guarda de forma local, sin comunicarse con el microservicio de pacientes, para pruebas
    * */
    @PostMapping("/turnos/post")
    public String postTurnoLocal(@RequestBody Turno turno) {
        iTurnoService.saveTurnoLocalTest(turno.getFecha(), turno.getTratamiento(), turno.getNombreCompletoPaciente());
        return "Turno creado correctamente";
    }

    @DeleteMapping("/turnos/borrar/{id}")
    public String borrarTurno(@PathVariable Long id) {
        iTurnoService.deleteTurno(id);
        return "El turno se ha borrado correctamente";
    }


    @PutMapping("/turnos/editar/{id_original}")
    public Turno editarTurno(@PathVariable Long id_original,
                               @RequestBody Turno turnoEditar) {

        iTurnoService.updateTurno(id_original, turnoEditar);
        Turno turnoNuevo = iTurnoService.findTurno(id_original);

        return turnoNuevo;

    }

}
