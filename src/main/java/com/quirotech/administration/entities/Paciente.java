package com.quirotech.administration.entities;


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
    public String cpf;

    public String nome;
    public LocalDate dataNascimento;
    public String sexo;
    public String senha;
    public String pais;
    //private List<Contato> contatos;
}
