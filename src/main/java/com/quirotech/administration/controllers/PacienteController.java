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
    @GetMapping
    public ResponseEntity getAllPacientes(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }
    @PostMapping("/")
    public void create(@RequestBody Paciente paciente) {
        System.out.println(paciente.getCpf());
        System.out.println(paciente.getNome());
        System.out.println(paciente.getDataNascimento());
        System.out.println(paciente.getSexo());
        System.out.println(paciente.getSenha());
        System.out.println(paciente.getPais());
    }
}
