package com.senai.eventsmanager.service;

import com.senai.eventsmanager.entity.Usuario;
import com.senai.eventsmanager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UsuarioEventoService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    //listar ususario
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }
    //buscar usuario
    public Usuario buscarPorId(UUID id){
        return usuarioRepository.findById(id).orElse(null);
    }
    //salvar usuario
    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    // Atualizar usuario
    public Usuario atualizar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    // deletar usuario
    public void deletar(UUID id){
        usuarioRepository.deleteById(id);
    }
}
