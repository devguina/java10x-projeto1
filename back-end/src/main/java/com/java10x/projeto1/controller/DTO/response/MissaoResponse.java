package com.java10x.projeto1.controller.DTO.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

@Builder
public record MissaoResponse(@NotNull UUID id,
                             @NotBlank String nome,
                             @NotBlank String descricao,
                             @NotBlank String rank) {
}
