package com.quirotech.administration.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name="paciente")
@Entity(name="paciente")
public class Paciente implements Serializable {

    @Id
    public String cpf;

   private String nome;
   private LocalDate dataNascimento;
   private String sexo;
   private String senha;
   private String pais;
    //private List<Contato> contatos;
}
