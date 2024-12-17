package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.AldeiaRequest;
import com.java10x.projeto1.controller.DTO.response.AldeiaResponse;
import com.java10x.projeto1.entity.Aldeia;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AldeiaMapper {

    public static AldeiaResponse toAldeiaResponse(Aldeia aldeia){
        return AldeiaResponse
                .builder()
                .id(aldeia.getId())
                .nome(aldeia.getNome())
                .kageAtual(aldeia.getKageAtual())
                .build();
    }

    public static Aldeia toAldeia (AldeiaRequest request){
        return Aldeia
                .builder()
                .nome(request.nome())
                .kageAtual(request.kageAtual())
                .build();
    }
}
