package com.java10x.projeto1.repository;

import com.java10x.projeto1.entity.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, UUID> {

    List<Ninja> findByAldeiaId(UUID id);
}
