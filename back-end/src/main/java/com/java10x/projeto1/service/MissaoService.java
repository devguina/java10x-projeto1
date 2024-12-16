package com.java10x.projeto1.service;

import com.java10x.projeto1.entity.Missao;
import com.java10x.projeto1.repository.MissaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MissaoService {

    private final MissaoRepository missaoRepository;

    public Missao save (Missao missao){
        return missaoRepository.save(missao);
    }

    public Optional <Missao> findById(UUID id){
        return missaoRepository.findById(id);
    }

    public List<Missao> findAll(){
        return missaoRepository.findAll();
    }

    public Optional<Missao> update(UUID id, Missao missao){
        Optional<Missao> missaoOptional = missaoRepository.findById(id);
        if (missaoOptional.isPresent()){
            Missao updatedMissao = missaoOptional.get();
            updatedMissao.setNome(missao.getNome());
            updatedMissao.setRank(missao.getRank());
            updatedMissao.setDescricao(missao.getDescricao());

            return Optional.of(updatedMissao);
        }
        return Optional.empty();
    }

    public void delete(UUID id){
        missaoRepository.deleteById(id);
    }
}
