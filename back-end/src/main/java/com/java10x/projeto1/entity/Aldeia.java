package com.java10x.projeto1.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.stylesheets.LinkStyle;

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

    @Column(nullable = false, name = "hokake_atual", unique = true)
    private String hokakeAtual;

    // -- relacionamento -> classe pai (aldeia) classe filha (ninja)
    // uma aldeia pode ter vários ninjas mas um ninja só pode ter uma aldeia
    // aldeia não depende de ninjas para existir por isso ela é a classe pai

    @OneToMany(mappedBy = "aldeia" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ninja> ninjas = new ArrayList<>();


}
