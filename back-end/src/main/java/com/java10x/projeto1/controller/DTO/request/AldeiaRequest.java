package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record AldeiaRequest(@NotBlank (message = "Nome da Aldeia é obrigatório.") String nome,
                            @NotBlank (message = "Nome do Kage atual é obrigatório.")String kageAtual) {
}
