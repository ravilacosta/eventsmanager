package com.senai.eventsmanager.service;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public EventoCreateDTO findById(UUID id) {
        //retorna uma entidade evento
        Evento evento = eventoRepository.findById(id).orElseThrow();
        // metodo para converter um evento entity em evento create dto
        EventoCreateDTO eventoCreateDTO = converToDTO(evento);
        return eventoCreateDTO;
    }
    //metodo para salvar evento
    public EventoCreateDTO save (EventoCreateDTO eventoDTO) {
        Evento evento = converToEntity(eventoDTO);
        evento = eventoRepository.save(evento);
     return converToDTO(evento);
    }

    //metodo para atualizar evento
    public EventoCreateDTO update (UUID id, EventoCreateDTO eventoDTO) {
        Evento evento = converToEntity(eventoDTO);
        evento.setId(id);
        evento = eventoRepository.save(evento);
        return converToDTO(evento);
    }
    //metodo para deletar um evento
    public  void delete (UUID id) {
        eventoRepository.deleteById(id);
    }
    // metodo para listar todo os eventos
    public List<EventoCreateDTO> findAll() {
        List<Evento> eventos = eventoRepository.findAll();
        //criar uma lista de evento createDTO
        List<EventoCreateDTO> eventoCreateDTOS = new ArrayList<>();
        // para cada evento na lista de eventos, converter para DTO e add na
        for (Evento evento : eventos) {
            eventoCreateDTOS.add(converToDTO(evento));

        }
        return eventoCreateDTOS;
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
