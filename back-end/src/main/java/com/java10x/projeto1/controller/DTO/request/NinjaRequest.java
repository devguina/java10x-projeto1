package com.java10x.projeto1.controller.DTO.request;

import com.java10x.projeto1.entity.Aldeia;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record NinjaRequest (@NotBlank String nome,
                            @NotBlank Integer idade,
                            @NotBlank String cla,
                            @NotBlank String powerAtk,
                            @NotBlank String powerDfs,
                            @NotBlank String powerNinjutsu,
                            int rank,
                            int cargo,
                            int titulo,
                            UUID missaoId,
                            UUID aldeiaId)
{
}
