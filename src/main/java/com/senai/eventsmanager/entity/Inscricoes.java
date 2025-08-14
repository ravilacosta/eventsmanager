package com.senai.eventsmanager.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "inscrições")

public class Inscricoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID")
    @Column( nullable = false, updatable = false)
    private UUID id;

    //Campos com chaves Estrangeiras
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name ="Usuario_id", nullable = false )
    private Usuario usuario;

    private InscricaoStatusEnum statusPagamento;
    private LocalDateTime dataHora;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Inscricoes() {
    }

    public Inscricoes(UUID id, Evento evento, Usuario usuario, InscricaoStatusEnum statusPagamento, LocalDateTime
            dataHora, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.evento = evento;
        this.usuario = usuario;
        this.statusPagamento = statusPagamento;
        this.dataHora = dataHora;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public InscricaoStatusEnum getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(InscricaoStatusEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
