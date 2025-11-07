package com.example.mqtt_test.service;

import com.example.mqtt_test.applicatio.dto.MensagemMqttDTO;
import com.example.mqtt_test.applicatio.dto.MensagenRestDTO;
import com.example.mqtt_test.repository.MensagemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MensagemService {
    private final MensagemRepository mensagemRepository;
    public MensagenRestDTO enviarMensagem(MensagenRestDTO mensagenRestDTO){
        return MensagemMqttDTO.builder()
                .nome(mensagenRestDTO.nome())
                .conteudo(mensagenRestDTO.conteudo())
                .build();

    }

}
