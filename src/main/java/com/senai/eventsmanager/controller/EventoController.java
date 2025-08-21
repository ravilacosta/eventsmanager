package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.dto.InscricaoCreateDTO;

import com.senai.eventsmanager.service.EventoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController // para dizer para o spring é um controller( get, post, put)
@RequestMapping("/api/v1/evento") //http:localhost:8080/api/v1/evento  // request esta acessando essa porta
public class EventoController {
    EventoService service;

    static class EventoControllerService {

    }
    //pegar um evento pelo seu id

    @GetMapping("/{id}")
    public EventoCreateDTO findById(@PathVariable ("id") UUID id) {

        return service.findById(id);
    }
    //pegar todos os eventos
    @GetMapping
    public List<EventoCreateDTO> findAll() {
        return service.findAll();
    }
    //salvar um evento
    @PostMapping
    public EventoCreateDTO save (@RequestBody EventoCreateDTO eventoCreateDTO) {
        return service.save(eventoCreateDTO);
    }
    //atulizar um evento
    @PutMapping("{/id}")
    public  EventoCreateDTO update(@PathVariable ("id") UUID id,
                                   @RequestBody EventoCreateDTO eventoCreateDTO) {
       return service.update(id);
    }
    //deletar um evento pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") UUID id) {
        service.deleteBy(id);
    }

}
