package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(@NotBlank(message = "Username não inserido.") String username,
                          @NotBlank(message = "password não inserido.") String password,
                          @NotBlank(message = "email não inserido.") String email) {
}
