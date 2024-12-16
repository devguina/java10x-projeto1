package com.java10x.projeto1.controller;

import com.java10x.projeto1.controller.DTO.Mapper.AldeiaMapper;
import com.java10x.projeto1.controller.DTO.request.AldeiaRequest;
import com.java10x.projeto1.controller.DTO.response.AldeiaResponse;
import com.java10x.projeto1.entity.Aldeia;
import com.java10x.projeto1.service.AldeiaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aldeia")
public class AldeiaController {

    private final AldeiaService aldeiaService;

    // -- create aldeia
    @PostMapping("/create")
    public ResponseEntity<AldeiaResponse> create(@RequestBody AldeiaRequest request){
        Aldeia saved = aldeiaService.save(AldeiaMapper.toAldeia(request));
        return ResponseEntity.ok(AldeiaMapper.toAldeiaResponse(saved));
    }

    // -- return all aldeias
    @GetMapping("/all")
    public ResponseEntity<List<AldeiaResponse>> findAll(){
        return ResponseEntity.ok(aldeiaService.findAll()
                .stream()
                .map(aldeia -> AldeiaMapper.toAldeiaResponse(aldeia))
                .toList()
        );
    }

    // -- return aldeia by id
    @GetMapping("/{id}")
    public ResponseEntity<AldeiaResponse> findById(@PathVariable UUID id){
        return aldeiaService.findById(id)
                .map(aldeia -> ResponseEntity.ok(AldeiaMapper.toAldeiaResponse(aldeia)))
                .orElse(ResponseEntity.notFound().build());
    }

    // -- update aldeia by id
    @PutMapping("/update/{id}")
    public ResponseEntity<AldeiaResponse> update (@PathVariable UUID id, @RequestBody AldeiaRequest request){
        return aldeiaService.update(id, AldeiaMapper.toAldeia(request))
                .map(aldeia -> ResponseEntity.ok(AldeiaMapper.toAldeiaResponse(aldeia)))
                .orElse(ResponseEntity.notFound().build());
    }

    // -- delete aldeia by id
    @DeleteMapping("/delete{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
         aldeiaService.delete(id);
         return ResponseEntity.noContent().build();
    }


}
