package com.example.mqtt_test.applicatio.dto;

import lombok.Builder;

@Builder
public record MensagenRestDTO(
        String nome,
        String conteudo
) {
}
