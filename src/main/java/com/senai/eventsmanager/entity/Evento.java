package com.senai.eventsmanager.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;


    @Entity // para dizer pro spring que isso é uma entidade
    @Table(name = "evento")
    public class Evento {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
        @Column(nullable = false, updatable = false)
        private UUID id;
        @Column(nullable = false)
        private String nome;
        private String descricao;
        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private EventoEnum tipo;
        @Column(nullable = false)
        private String local;
        @Column(nullable = false)
        private LocalDateTime dataInicio;
        @Column(nullable = false)
        private LocalDateTime dataFinal;
        private String linkEvento;
        private String linkImagem;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Evento() {
        }

        public Evento(UUID id, String nome, String descricao, EventoEnum tipo, String local, LocalDateTime dataInicio,
                      LocalDateTime dataFinal, String linkEvento, String linkImagem, LocalDateTime createdAt,
                      LocalDateTime updatedAt)
        {

            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.tipo = tipo;
            this.local = local;
            this.dataInicio = dataInicio;
            this.dataFinal = dataFinal;
            this.linkEvento = linkEvento;
            this.linkImagem = linkImagem;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

        public EventoEnum getTipo() {
            return tipo;
        }

        public void setTipo(EventoEnum tipo) {
            this.tipo = tipo;
        }

        public LocalDateTime getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(LocalDateTime dataInicio) {
            this.dataInicio = dataInicio;
        }

        public LocalDateTime getDataFinal() {
            return dataFinal;
        }

        public void setDataFinal(LocalDateTime dataFinal) {
            this.dataFinal = dataFinal;
        }

        public String getLinkEvento() {
            return linkEvento;
        }

        public void setLinkEvento(String linkEvento) {
            this.linkEvento = linkEvento;
        }

        public String getLinkImagem() {
            return linkImagem;
        }

        public void setLinkImagem(String linkImagem) {
            this.linkImagem = linkImagem;
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

        public List<Inscricoes> getInscricoes() {
            return inscricoes;
        }

        public void setInscricoes(List<Inscricoes> inscricoes) {
            this.inscricoes = inscricoes;
        }


        // Relacionamento com o Objeto Inscrição
        @OneToMany(mappedBy = "evento")
        private List<Inscricoes> inscricoes;

    }


