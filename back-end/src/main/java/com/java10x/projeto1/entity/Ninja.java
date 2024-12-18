package com.java10x.projeto1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_ninja")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @Column(nullable = false, name = "idade")
    private Integer idade;

    @Column(name = "cla")
    private String cla;

    @Column(nullable = false, name = "power_atack")
    private String powerAtk;

    @Column(nullable = false, name = "power_defense")
    private String powerDfs;

    @Column(nullable = false, name = "power_ninjutsu")
    private String powerNinjutsu;

    @Enumerated(EnumType.ORDINAL) // -- saved in the ENUM position
    @Column(name = "cargo")
    private NinjaCargo cargo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "rank")
    private NinjaRank rank;

    @Column(name = "titulo")
    private NinjaTitulo titulo;

    // -- relationships

    @ManyToOne
    @JoinColumn(name = "aldeia_id",nullable = true)
    private Aldeia aldeia;

    @ManyToOne
    @JoinColumn(name = "missao_id",nullable = true)
    private Missao missao;
}
