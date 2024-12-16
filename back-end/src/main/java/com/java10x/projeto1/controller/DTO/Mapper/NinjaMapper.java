package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.NinjaRequest;
import com.java10x.projeto1.controller.DTO.response.NinjaResponse;
import com.java10x.projeto1.entity.Ninja;
import lombok.experimental.UtilityClass;

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
                .build();
    }
}
