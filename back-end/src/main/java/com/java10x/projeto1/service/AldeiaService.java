package com.java10x.projeto1.service;

import com.java10x.projeto1.entity.Aldeia;
import com.java10x.projeto1.repository.AldeiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AldeiaService {

    private final AldeiaRepository aldeiaRepository;

    public Aldeia save(Aldeia aldeia){
        return aldeiaRepository.save(aldeia);
    }

    public Optional<Aldeia> findById(UUID id){
        return aldeiaRepository.findById(id);
    }

    public List<Aldeia> findAll(){
        return aldeiaRepository.findAll();
    }

    public Optional<Aldeia> update(UUID id, Aldeia aldeia){
        Optional<Aldeia> optAldeia = aldeiaRepository.findById(id);
        if(optAldeia.isPresent()){
            Aldeia updatedAldeia = optAldeia.get();

            updatedAldeia.setNome(aldeia.getNome());
            updatedAldeia.setKageAtual(aldeia.getKageAtual());
            return Optional.of(updatedAldeia);
        }
        return Optional.empty();
    }

    public void delete(UUID id){
        aldeiaRepository.deleteById(id);
    }

}
