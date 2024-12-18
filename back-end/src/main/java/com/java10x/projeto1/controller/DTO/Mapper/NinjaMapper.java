package com.java10x.projeto1.controller.DTO.Mapper;

import com.java10x.projeto1.controller.DTO.request.NinjaRequest;
import com.java10x.projeto1.controller.DTO.response.AldeiaResponse;
import com.java10x.projeto1.controller.DTO.response.MissaoResponse;
import com.java10x.projeto1.controller.DTO.response.NinjaResponse;
import com.java10x.projeto1.entity.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class NinjaMapper {

    public static Ninja toNinja(NinjaRequest request) {
        return Ninja
                .builder()
                .nome(request.nome())
                .idade(request.idade() != null ? request.idade() : 0)
                .cla(request.cla())
                .powerAtk(request.powerAtk())
                .powerDfs(request.powerDfs())
                .powerNinjutsu(request.powerNinjutsu())
                .cargo(NinjaCargo.fromCodigo(request.cargo()))
                .titulo(NinjaTitulo.fromCodigo(request.titulo()))
                .rank(NinjaRank.fromCodigo(request.rank()))
                .aldeia(request.aldeiaId() != null ?
                        Aldeia
                                .builder()
                                .id(request.aldeiaId())
                                .build() : null)
                .missao(request.missaoId() != null ?
                        Missao
                                .builder()
                                .id(request.missaoId())
                                .build() : null)
                .build();
    }

    public static NinjaResponse toNinjaResponse(Ninja ninja) {
        return NinjaResponse
                .builder()
                .id(ninja.getId())
                .nome(ninja.getNome())
                .idade(ninja.getIdade() != null ? ninja.getIdade() : 0)
                .cla(ninja.getCla())
                .powerAtk(ninja.getPowerAtk())
                .powerDfs(ninja.getPowerDfs())
                .powerNinjutsu(ninja.getPowerNinjutsu())
                .cargo(ninja.getCargo().getCodigo())
                .titulo(ninja.getTitulo().getCodigo())
                .rank(ninja.getRank().getCodigo())
                .missaoResponse(ninja.getMissao() != null ?
                        MissaoResponse
                                .builder()
                                .id(ninja.getMissao().getId())
                                .nome(ninja.getMissao().getNome())
                                .descricao(ninja.getMissao().getDescricao())
                                .build() : null)
                .aldeiaResponse(ninja.getAldeia() != null ?
                        AldeiaResponse
                                .builder()
                                .id(ninja.getAldeia().getId())
                                .nome(ninja.getAldeia().getNome())
                                .kageAtual(ninja.getAldeia().getKageAtual())
                                .build() : null)
                .build();
    }
}
