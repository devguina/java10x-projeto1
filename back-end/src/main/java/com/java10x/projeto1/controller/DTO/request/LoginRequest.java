package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(@NotBlank(message = "Campo e-mail não pode estar vazio") String email,
                           @NotBlank(message = "Campo senha não pode estar vazio") String password) {
}
