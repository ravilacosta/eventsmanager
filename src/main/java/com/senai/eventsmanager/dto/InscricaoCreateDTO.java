package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.EventoEnum;
import com.senai.eventsmanager.entity.InscricaoStatusEnum;

import java.time.LocalDateTime;

public class InscricaoCreateDTO {

    private EventoEnum evento;
    private String usuario;
    private InscricaoStatusEnum statusPagamento;
    private LocalDateTime dataHora;

    public InscricaoCreateDTO() {
    }

    public LocalDateTime getDataHora() {
        return null;
    }

    public InscricaoStatusEnum getStatusPagamento() {
        return null;
    }
}
