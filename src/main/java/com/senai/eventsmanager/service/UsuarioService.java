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

    public UsuarioCreateDTO findById(UUID id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        return convertToDTO(usuario);
    }

    // metodo para salvar usuario
    public UsuarioCreateDTO save(UsuarioCreateDTO usuarioDTO){
        Usuario usuario = convertToEntity(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return convertToDTO(usuario);
    }
    // metodo para atualizar usuario
    public UsuarioCreateDTO update (UUID id, UsuarioCreateDTO usuarioDTO) {
        Usuario usuario = convertToEntity(usuarioDTO);
        usuario.setId(id);
        usuario = usuarioRepository.save(usuario);
        return convertToDTO(usuario);
    }
    //metodo para listar usuario
    public List<UsuarioCreateDTO> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        // criar uma lista de usuario DTO
        List<UsuarioCreateDTO> usuarioCreateDTOs = new ArrayList<>();
        // para cada usuario na lista de eventos  converter para DTO e add na
        for (Usuario usuario : usuarios) {
            usuarioCreateDTOs.add(convertToDTO(usuario));
        }
        return usuarioCreateDTOs;
    }

            // metodo para deletar
            public void delete (UUID id){
                usuarioRepository.deleteById(id);
            }
            private UsuarioCreateDTO convertToDTO (Usuario usuario) {
                UsuarioCreateDTO dto = new UsuarioCreateDTO();
                dto.setNome(usuario.getNome());
                dto.setEmail(usuario.getEmail());
                dto.setSenha(usuario.getSenha());
                dto.setCpf(usuario.getCpf());
                dto.setTelefone(usuario.getTelefone());
                dto.setDataNascimento(usuario.getDataNascimento());
                dto.setTipoUsuario(usuario.getTipoUsuario());
                return dto;
            }

                private Usuario convertToEntity (UsuarioCreateDTO dto){
                    Usuario usuario = new Usuario();
                    usuario.setNome(dto.getNome());
                    usuario.setEmail(dto.getEmail());
                    usuario.setSenha(dto.getSenha());
                    usuario.setCpf(dto.getCpf());
                    usuario.setTelefone(dto.getTelefone());
                    usuario.setTipoUsuario(dto.getTipoUsuario());
                    usuario.setDataNascimento(dto.getDataNascimento());
                    return usuario;


                }
            }
