package com.senai.eventsmanager.service;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.dto.UsuarioCreateDTO;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.entity.Usuario;
import com.senai.eventsmanager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public UsuarioCreateDTO findById(UUID id){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        // metodo para converter um usuario entity em usuario create dto
        UsuarioCreateDTO usuarioCreateDTO = converToDTO(usuario);
        return usuarioCreateDTO;
    }
    // metodo para salvar usuario
    public UsuarioCreateDTO save(UsuarioCreateDTO usuarioDTO){
        Usuario usuario = converTOEntity(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return converToDTO(usuario);
    }
    // metodo para atualizar usuario
    public UsuarioCreateDTO update (UUID id, UsuarioCreateDTO usuarioDTO) {
        Usuario usuario = converTOEntity(usuarioDTO);
        usuario.setId(id);
        usuario = usuarioRepository.save(usuario);
        return converTODTO(usuario);
    }
    //metodo para listar usuario
    public List<UsuarioCreateDTO> findAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        // criar uma lista de usuario DTO
        List<UsuarioCreateDTO> usuarioCreateDTOs = new ArrayList<>();
        // para cada usuario na lista de eventos  converter para DTO e add na
        for( Usuario usuario : usuarios){
            usuarioCreateDTOs.add(converToDTO(usuario));
        }
        // metodo para deletar
        public void delete(UUID id){
            usuarioRepository.deleteById(id);
        }
        return usuarioCreateDTOs;
    }
}