package com.java10x.projeto1.controller;

import com.java10x.projeto1.controller.DTO.Mapper.NinjaMapper;
import com.java10x.projeto1.controller.DTO.request.NinjaRequest;
import com.java10x.projeto1.controller.DTO.response.NinjaResponse;
import com.java10x.projeto1.entity.Ninja;
import com.java10x.projeto1.service.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    // -- create ninja
    @PostMapping("/create")
    public ResponseEntity<NinjaResponse> createNinja(@RequestBody NinjaRequest ninjaRequest) {
        Ninja ninjaSaved = ninjaService.save(NinjaMapper.toNinja(ninjaRequest));
        return ResponseEntity.ok(NinjaMapper.toNinjaResponse(ninjaSaved));
    }

    // -- return ninja by id
    @GetMapping("/{id}")
    public ResponseEntity<NinjaResponse> findById(@PathVariable UUID id) {
        return ninjaService.findById(id)
                .map(ninja -> ResponseEntity.ok(NinjaMapper.toNinjaResponse(ninja)))
                .orElse(ResponseEntity.notFound().build());
    }

    // --return all ninjas
    @GetMapping("/all")
    public ResponseEntity<List<NinjaResponse>> findAll() {
        return ResponseEntity.ok(ninjaService.findAll()
                .stream()
                .map(ninja -> NinjaMapper.toNinjaResponse(ninja))
                .toList());
    }

    // -- update Ninja
    @PutMapping("/update/{id}")
    public ResponseEntity<NinjaResponse>update(@PathVariable UUID id, @RequestBody NinjaRequest ninjaRequest){
        return ninjaService.update(id, NinjaMapper.toNinja(ninjaRequest))
                .map(ninja -> ResponseEntity.ok(NinjaMapper.toNinjaResponse(ninja)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete (@PathVariable UUID id){
        ninjaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
