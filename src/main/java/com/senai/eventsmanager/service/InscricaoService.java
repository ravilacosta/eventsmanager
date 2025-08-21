package com.senai.eventsmanager.service;

import com.senai.eventsmanager.entity.Inscricoes;
import com.senai.eventsmanager.entity.Usuario;
import com.senai.eventsmanager.repository.InscricaoRepository;
import com.senai.eventsmanager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    //listar inscricao
public List<Usuario> listarTodos(){
    return usuarioRepository.findAll();
}
//buscar inscriçao
    public Inscricoes buscarPorId(UUID id){
    return inscricaoRepository.findById(id).orElse(null);
    }
    //salvar inscriçao
    public Inscricoes salvar(Inscricoes inscricoes){
    return inscricaoRepository.save(inscricoes);
    }
    //deletar inscriçao
    public void deletar(UUID id){
        inscricaoRepository.deleteById(id);
    }


}
