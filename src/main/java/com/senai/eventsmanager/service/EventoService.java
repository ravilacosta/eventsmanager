package com.senai.eventsmanager.service;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class EventoService {
    @Autowired
    private EventoRepository repository;

    public EventoCreateDTO findById(UUID id) {
    //retorna uma entidade evento
     Evento evento = repository.findById(id).orElseThrow();
     // metodo para converter um evento entity em evento create dto
     EventoCreateDTO eventoDTO = converToDTO(evento);
     return eventoDTO;
    }
    public EventoCreateDTO converToDTO(Evento evento){
        EventoCreateDTO eventoCreateDTO = new EventoCreateDTO();
        eventoCreateDTO.setNome(evento.getNome());
        eventoCreateDTO.setDescricao(evento.getDescricao());
        eventoCreateDTO.setTipo(evento.getTipo());
        eventoCreateDTO.setLocal(evento.getLocal());
        eventoCreateDTO.setDataInicio(evento.getDataInicio());
        eventoCreateDTO.setDataFinal(evento.getDataFinal());
        eventoCreateDTO.setLinkEvento(evento.getLinkEvento());
        eventoCreateDTO.setLinkImagem(evento.getLinkImagem());
    return eventoCreateDTO;
    }
    public Evento converToEntity(EventoCreateDTO eventoCreateDTO){
        Evento evento = new Evento();
        evento.setNome(eventoCreateDTO.getNome());
        evento.setDescricao(eventoCreateDTO.getDescricao());
        evento.setTipo(eventoCreateDTO.getTipo());
        evento.setLocal(eventoCreateDTO.getLocal());
        evento.setDataInicio(eventoCreateDTO.getDataInicio());
        evento.setDataFinal(eventoCreateDTO.getDataFinal());
        evento.setLinkEvento(eventoCreateDTO.getLinkEvento());
        evento.setLinkImagem(eventoCreateDTO.getLinkImagem());
        return evento;
    }
}
