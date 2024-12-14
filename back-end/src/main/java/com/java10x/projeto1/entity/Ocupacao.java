package com.java10x.projeto1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_ocupacao")
public class Ocupacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @Column(nullable = false, length = 500, name = "descricao")
    private String descricao;

}
