package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record MissaoRequest(@NotBlank(message = "Nome da missão precisa ser preenchido.") String nome,
                            @NotBlank(message = "Missão precisa ter uma descrição.") String descricao,
                            @NotBlank String rank) {
}
