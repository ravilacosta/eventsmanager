package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.EventoEnum;

import java.time.LocalDateTime;

public class EventoCreateDTO {

           private String  nome;
            private String descricao;
            private EventoEnum tipo;
            private String local;
            private LocalDateTime dataInicio;
            private LocalDateTime dataFinal;
            private String linkEvento;
            private String linkImagem;
            private double valor;
            //this.createdAt = createdAt;
            //this.updatedAt = updatedAt;


    public EventoCreateDTO() {
    }

    public EventoCreateDTO(String nome, String descricao, EventoEnum tipo, String local,
                           LocalDateTime dataInicio,
                           LocalDateTime dataFinal, String linkEvento, String linkImagem, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.linkEvento = linkEvento;
        this.linkImagem = linkImagem;
        this.valor = valor;
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

    public EventoEnum getTipo() {
        return tipo;
    }

    public void setTipo(EventoEnum tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public double getValor() { return valor;}

    public void setValor(double valor) {this.valor = valor;}
}
