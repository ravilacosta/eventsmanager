package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.Evento;

import com.senai.eventsmanager.entity.InscricaoStatusEnum;
import com.senai.eventsmanager.entity.Usuario;

import java.time.LocalDateTime;

public class InscricaoCreateDTO {

    private Evento evento;
    private Usuario usuario;
    private InscricaoStatusEnum statusPagamento;
    private LocalDateTime dataHora;

    public InscricaoCreateDTO() {
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setStatusPagamento(InscricaoStatusEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public InscricaoStatusEnum getStatusPagamento() {
        return this.statusPagamento;
    }
}
