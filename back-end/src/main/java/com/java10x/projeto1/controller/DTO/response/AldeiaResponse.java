package com.java10x.projeto1.controller.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record AldeiaResponse(UUID id,
                             String nome,
                             String hokakeAtual) {
}
