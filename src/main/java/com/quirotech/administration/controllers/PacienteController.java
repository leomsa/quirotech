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
//    @GetMapping
//    public ResponseEntity getAllPacientes(){
//        var allProducts = repository.findAll();
//        return ResponseEntity.ok(allProducts);
//    }
    @PostMapping("/")
    public Paciente create(@RequestBody Paciente paciente) {
        var  userCreated = this.repository.save(paciente);
        return userCreated;
    }
}
