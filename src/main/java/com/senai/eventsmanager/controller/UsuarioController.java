package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.dto.UsuarioCreateDTO;
import com.senai.eventsmanager.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/usuario")

public class UsuarioController {
    @Autowired
    //pegar um usuario pelo seu id
UsuarioService service;
    @GetMapping("/{id}")
    public UsuarioCreateDTO findById(@PathVariable("id") UUID id) {
        return service.findById(id);}

        // pegar todos os usuarios
        @GetMapping List<UsuarioCreateDTO> findAll(){
        return service.findAll();
        }
     //salavar um usuario
    @PostMapping
    public UsuarioCreateDTO save (@RequestBody UsuarioCreateDTO usuarioCreateDTO){
        return service.save(usuarioCreateDTO);
    }
    //atulizar um usuario
    @PutMapping("/{id}")
    public UsuarioCreateDTO update(@PathVariable ("id") UUID id,
                                  @RequestBody UsuarioCreateDTO usuarioCreateDTO) {
        return service.update(id, usuarioCreateDTO);
    }
    //deletar um usuario pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") UUID id) {
        service.delete(id);
    }
}
