package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/evento") //http:localhost:8080/api/v1/evento
public class EventoController {
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
       return service.update(id, eventoCreateDTO);
    }
    //deletar um evento pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") UUID id) {
        service.deleteBy(id);
    }

}
