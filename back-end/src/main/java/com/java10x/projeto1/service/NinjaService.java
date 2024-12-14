package com.java10x.projeto1.service;

import com.java10x.projeto1.entity.Ninja;
import com.java10x.projeto1.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }
    public Ninja save(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public Optional<Ninja> getById(UUID id){
        return ninjaRepository.findById(id);
    }

    public List<Ninja> getAllNinjas(){
        return ninjaRepository.findAll();
    }

    public void delete (UUID id){
        ninjaRepository.deleteById(id);
    }
}
