package com.quirotech.administration.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Paciente implements Serializable {

    @Id
    private String cpf;

    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String senha;
    private String pais;
    //private List<Contato> contatos;
}
