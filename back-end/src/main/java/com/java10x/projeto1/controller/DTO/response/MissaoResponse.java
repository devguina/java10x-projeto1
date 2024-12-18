package com.java10x.projeto1.controller.DTO.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

@Builder
public record MissaoResponse( UUID id,
                             String nome,
                             String descricao,
                             String rank) {
}
