package com.example.mqtt_test.applicatio.dto;

import com.example.mqtt_test.applicatio.entity.Mensagem;
import lombok.Builder;

@Builder
public record MensagemMqttDTO(
        String nome,
        String conteudo
) {
    public static Mensagem toEntity(MensagemMqttDTO mensagemMqttDTO) {
        return Mensagem.builder()
                .nome(mensagemMqttDTO.nome())
                .conteudo(mensagemMqttDTO.conteudo())
                .build();
    }
}