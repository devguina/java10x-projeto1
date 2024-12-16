package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.MissaoRequest;
import com.java10x.projeto1.controller.DTO.response.MissaoResponse;
import com.java10x.projeto1.entity.Missao;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MissaoMapper {

    public static Missao toMissao (MissaoRequest request){
        return Missao
                .builder()
                .nome(request.nome())
                .descricao(request.descricao())
                .rank(request.rank())
                .build();
    }

    public static MissaoResponse toMissaoResponse(Missao missao){
        return MissaoResponse
                .builder()
                .nome(missao.getNome())
                .descricao(missao.getDescricao())
                .rank(missao.getRank())
                .build();
    }
}
