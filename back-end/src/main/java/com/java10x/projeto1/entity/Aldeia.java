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
@Table(name = "tb_aldeia")
public class Aldeia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "nome", unique = true)
    private String nome;

    @Column(nullable = false, name = "hokake_atual", unique = true)
    private String hokakeAtual;
}
