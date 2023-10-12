package com.quirotech.administration.repositories;

import com.quirotech.administration.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
    //A interface recebe a entidade e o tipo da sua chave primária cpf -> String.//
    Paciente findPacienteByCpf(String cpf);
}