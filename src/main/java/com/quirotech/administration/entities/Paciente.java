package com.quirotech.administration.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "paciente")
@Entity(name = "paciente")
public class Paciente implements Serializable {

    @Id
    private String cpf;

    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String senha;//
    private String pais;

    @CreationTimestamp
    private LocalDateTime createdAt;
    //private List<Contato> contatos;
}
