package com.java10x.projeto1.repository;

import com.java10x.projeto1.entity.Aldeia;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AldeiaRepository extends JpaRepository<Aldeia, UUID> {
}
