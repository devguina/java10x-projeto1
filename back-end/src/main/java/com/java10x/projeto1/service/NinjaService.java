package com.java10x.projeto1.service;

import com.java10x.projeto1.entity.Ninja;
import com.java10x.projeto1.repository.NinjaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    public Ninja save(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public Optional<Ninja> findById(UUID id){
        return ninjaRepository.findById(id);
    }

    public List<Ninja> findAll(){
        return ninjaRepository.findAll();
    }

    public Optional<Ninja> update(UUID id, Ninja ninja){
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()){
            Ninja updatedNinja = optionalNinja.get();
            updatedNinja.setNome(ninja.getNome());
            updatedNinja.setCla(ninja.getCla());
            updatedNinja.setPowerAtk(ninja.getPowerAtk());
            updatedNinja.setPowerDfs(ninja.getPowerDfs());
            updatedNinja.setPowerDfs(ninja.getPowerDfs());
            updatedNinja.setCargo(ninja.getCargo());
            updatedNinja.setRank(ninja.getRank());
            updatedNinja.setTitulo(ninja.getTitulo());
            updatedNinja.setAldeia(ninja.getAldeia());
            updatedNinja.setMissao(ninja.getMissao());
            return Optional.of(updatedNinja);
        }
        return Optional.empty();
    }

    public void delete (UUID id){
        ninjaRepository.deleteById(id);
    }

    public List<Ninja> findNinjaByAldeiaId(UUID id){
        return ninjaRepository.findByAldeiaId(id);
    }
}
