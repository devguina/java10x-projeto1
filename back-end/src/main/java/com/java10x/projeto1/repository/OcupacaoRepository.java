package com.java10x.projeto1.repository;

import com.java10x.projeto1.entity.Ocupacao;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Entity
public interface OcupacaoRepository extends JpaRepository<Ocupacao, UUID> {
}
