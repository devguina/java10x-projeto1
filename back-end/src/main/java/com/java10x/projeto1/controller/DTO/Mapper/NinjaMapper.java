package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.NinjaRequest;
import com.java10x.projeto1.controller.DTO.response.AldeiaResponse;
import com.java10x.projeto1.controller.DTO.response.NinjaResponse;
import com.java10x.projeto1.entity.Aldeia;
import com.java10x.projeto1.entity.Ninja;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@UtilityClass
public class NinjaMapper {

    public static Ninja toNinja(NinjaRequest request){
        return Ninja
                .builder()
                .nome(request.nome())
                .cla(request.cla())
                .powerAtk(request.powerAtk())
                .powerDfs(request.powerDfs())
                .powerNinjutsu(request.powerNinjutsu())
                .aldeia(Aldeia.builder().id(request.aldeiaId()).build())
                .build();
    }

    public static NinjaResponse toNinjaResponse(Ninja ninja){
        return NinjaResponse
                .builder()
                .id(ninja.getId())
                .nome(ninja.getNome())
                .cla(ninja.getCla())
                .powerAtk(ninja.getPowerAtk())
                .powerDfs(ninja.getPowerDfs())
                .powerNinjutsu(ninja.getPowerNinjutsu())
                .aldeiaId(ninja.getAldeia().getId())
                .build();
    }
}
