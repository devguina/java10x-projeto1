package com.java10x.projeto1.controller;

import com.java10x.projeto1.controller.DTO.Mapper.MissaoMapper;
import com.java10x.projeto1.controller.DTO.request.MissaoRequest;
import com.java10x.projeto1.controller.DTO.response.MissaoResponse;
import com.java10x.projeto1.entity.Missao;
import com.java10x.projeto1.service.MissaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/missao")
public class MissaoController {

    private final MissaoService missaoService;


    // -- create missao
    @PostMapping("/create")
    public ResponseEntity<MissaoResponse> create(@Valid @RequestBody MissaoRequest request){
        Missao missaoSaved = missaoService.save(MissaoMapper.toMissao(request));
        return ResponseEntity.ok(MissaoMapper.toMissaoResponse(missaoSaved));
    }

    // -- return all missoes;
    @GetMapping("/all")
    public ResponseEntity<List<MissaoResponse>> findAll(){
        return  ResponseEntity.ok(missaoService.findAll()
                .stream()
                .map(missao -> MissaoMapper.toMissaoResponse(missao))
                .toList());
    }

    // -- return missao by id
    @GetMapping("/{id}")
    public ResponseEntity<MissaoResponse> findById(@PathVariable UUID id){
        return missaoService.findById(id)
                .map(missao -> ResponseEntity.ok(MissaoMapper.toMissaoResponse(missao)))
                .orElse(ResponseEntity.notFound().build());
    }

    // -- update missao by id
    @PutMapping("/update/{id}")
    public ResponseEntity<MissaoResponse> update(@PathVariable UUID id, @Valid @RequestBody MissaoRequest request){
        return missaoService.update(id, MissaoMapper.toMissao(request))
                .map(missao -> ResponseEntity.ok(MissaoMapper.toMissaoResponse(missao)))
                .orElse(ResponseEntity.notFound().build());
    }

    // -- delete missao by id
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete (@PathVariable UUID id){
        Optional<Missao> opt = missaoService.findById(id);
        if(opt.isPresent()){
            missaoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
