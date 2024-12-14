package com.java10x.projeto1.controller.DTO.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record NinjaResponse(UUID id,
                            String name,
                            String cla,
                            String powerAtk,
                            String powerDfs,
                            String powerNinjutsu) {
}
