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

    @PostMapping("/")
    public Paciente create(@RequestBody Paciente paciente) {
        var  patientCreated = this.repository.save(paciente);
        return patientCreated;
    }
    @GetMapping("/allpatients")
    public ResponseEntity getAllPacientes(){
        var allpatients = this.repository.findAll();
        return ResponseEntity.ok(allpatients);
    }
}
