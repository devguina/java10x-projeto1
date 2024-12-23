package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.UUID;

public record NinjaRequest(@NotBlank(message = "Ninja precisa ter um nome.") String nome,
                           @NotNull(message = "Ninja precisa ter uma idade")
                           @PositiveOrZero(message = "Número negativo não pode ser inserido") Integer idade,
                           String cla,
                           @NotBlank(message = "Ninja precisa ter um poder de Ataque.")
                           @PositiveOrZero(message = "Número negativo não pode ser inserido") String powerAtk,
                           @NotBlank(message = "Ninja precisa ter um poder de Defesa.") String powerDfs,
                           @NotBlank (message = "Ninja precisa ter um poder de Ninjutsu.") String powerNinjutsu,
                           int rank,
                           int cargo,
                           int titulo,
                           UUID missaoId,
                           UUID aldeiaId) {
}
