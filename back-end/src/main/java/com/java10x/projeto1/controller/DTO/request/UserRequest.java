package com.java10x.projeto1.controller.DTO.request;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(@NotBlank(message = "nickname não inserido.") String nickname,
                          @NotBlank(message = "password não inserido.") String password,
                          @NotBlank(message = "email não inserido.") String email) {
}
