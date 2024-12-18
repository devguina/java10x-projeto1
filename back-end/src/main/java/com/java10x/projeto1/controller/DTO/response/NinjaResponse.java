package com.java10x.projeto1.controller.DTO.response;

import com.java10x.projeto1.entity.Aldeia;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

@Builder
public record NinjaResponse(UUID id,
                            String nome,
                            Integer idade,
                            String cla,
                            String powerAtk,
                            String powerDfs,
                            String powerNinjutsu,
                            int rank,
                            int cargo,
                            int titulo,
                            MissaoResponse missaoResponse,
                            AldeiaResponse aldeiaResponse) {
}
