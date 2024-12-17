package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record MissaoRequest(@NotBlank String nome,
                            @NotBlank String descricao,
                            @NotBlank String rank) {
}
