package com.quirotech.administration.controllers;

import com.quirotech.administration.entities.Paciente;
import com.quirotech.administration.repositories.PacienteRepository;
import org.aspectj.weaver.ast.Var;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping("/criar")
    public ResponseEntity create(@RequestBody Paciente paciente) {

        var registrarCPF = this.repository.findPacienteByCpf(paciente.getCpf());

        if (registrarCPF != null) {
            System.out.println("CPF já cadastrado");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CPF já cadastrado");
        }

        String senha = paciente.getSenha();
        String salt = BCrypt.gensalt(12);

        String hashedSenha = BCrypt.hashpw(senha, salt);
        paciente.setSenha(hashedSenha);

        var criarPaciente = this.repository.save(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(criarPaciente);
    }

    @GetMapping("/todosPacientes")
    public ResponseEntity getAllPacientes() {
        var todosPacientes = this.repository.findAll();
        return ResponseEntity.ok(todosPacientes);
    }
}
