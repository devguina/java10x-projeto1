package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record AldeiaRequest(@NotBlank String nome,
                            @NotBlank String kageAtual) {
}
