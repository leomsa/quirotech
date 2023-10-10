package com.quirotech.administration.controllers;

import com.quirotech.administration.entities.Paciente;
import com.quirotech.administration.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping("/criar")
    public Paciente create(@RequestBody Paciente paciente) {
        var  criarPaciente = this.repository.save(paciente);
        return criarPaciente;
    }
    @GetMapping("/todosPacientes")
    public ResponseEntity getAllPacientes(){
        var todosPacientes = this.repository.findAll();
        return ResponseEntity.ok(todosPacientes);
    }
}
