package com.java10x.projeto1.repository;

import com.java10x.projeto1.entity.Missao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, UUID> {
}
