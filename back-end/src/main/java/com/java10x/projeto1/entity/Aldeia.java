package com.java10x.projeto1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
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

    @Column(nullable = false, name = "kage_atual", unique = true)
    private String kageAtual;

// -- relationships

    @OneToMany(mappedBy = "aldeia" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ninja> ninjas = new ArrayList<>();


}
