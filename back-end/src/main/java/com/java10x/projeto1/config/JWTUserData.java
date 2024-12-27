package com.java10x.projeto1.config;

import lombok.Builder;

import java.util.UUID;

@Builder
public record JWTUserData(UUID id, String email) {
}
