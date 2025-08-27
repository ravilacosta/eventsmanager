package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.InscricaoCreateDTO;
import com.senai.eventsmanager.dto.UsuarioCreateDTO;
import com.senai.eventsmanager.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/inscricao")

public class InscricaoController {
    // pegar uma inscriçao pelo id
    @Autowired
 InscricaoService service;

    @GetMapping("/{id}")
    public InscricaoCreateDTO findById(@PathVariable("id") UUID id) {
        return service.findById(id);
    }
    // pegar todos as inscriçoes
    @GetMapping
    List<InscricaoCreateDTO> findAll(){
        return service.findyAll();
    }
    //salavar uma inscriçao
    @PostMapping
    public InscricaoCreateDTO save (@RequestBody InscricaoCreateDTO inscricaoCreateDTO){
        return service.save(inscricaoCreateDTO);
    }
    //atulizar uma inscriçao
    @PutMapping("/{id}")
    public InscricaoCreateDTO update(@PathVariable ("id") UUID id,
                                   @RequestBody InscricaoCreateDTO inscricaoCreateDTO) {
        return service.update(id,inscricaoCreateDTO);
    }
    //deletar uma inscriçao pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") UUID id) {
        service.Delete(id);
    }

}
