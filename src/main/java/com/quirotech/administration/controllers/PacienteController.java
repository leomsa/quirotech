package com.quirotech.administration.controllers;

import com.quirotech.administration.entities.Paciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {


    @PostMapping("/")
    public void create(@RequestBody Paciente paciente) {
        System.out.println(paciente.cpf);
        System.out.println(paciente.nome);
        System.out.println(paciente.dataNascimento);
        System.out.println(paciente.sexo);
        System.out.println(paciente.senha);
        System.out.println(paciente.pais);
    }
}
