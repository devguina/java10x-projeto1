package com.java10x.projeto1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_ninja")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(name = "cla")
    private String cla;

    @Column(nullable = false, name = "power_atack")
    private String powerAtk;

    @Column(nullable = false, name = "power_defense")
    private String powerDfs;

    @Column(nullable = false, name = "power_ninjutsu")
    private String powerNinjutsu;
}
