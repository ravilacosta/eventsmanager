package com.senai.eventsmanager.service;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.dto.InscricaoCreateDTO;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.entity.Inscricoes;
import com.senai.eventsmanager.entity.Usuario;
import com.senai.eventsmanager.repository.EventoRepository;
import com.senai.eventsmanager.repository.InscricaoRepository;
import com.senai.eventsmanager.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    public InscricaoCreateDTO findById(UUID id) {
        //retorna uma entidade inscricao
        Inscricoes inscricao = inscricaoRepository.findById(id).orElseThrow();
        // metodo para converter uma inscricao entity em inscricao create dto
        InscricaoCreateDTO inscricaoCreateDTO = converToDTO(inscricao);
        return inscricaoCreateDTO;
      }
        //metodo para salvar evento
        public InscricaoCreateDTO save (InscricaoCreateDTO inscricaoDTO){
            System.out.println("evento:"+inscricaoDTO.getEvento().getId());
            System.out.println("usuario:"+inscricaoDTO.getUsuario().getId());
            System.out.println("Datahora:"+inscricaoDTO.getDataHora());
            System.out.println("Status:"+inscricaoDTO.getStatusPagamento());
            Inscricoes inscricao = converToEntity(inscricaoDTO);
            inscricao = inscricaoRepository.save(inscricao);
            return converToDTO(inscricao);
        }
        // metodo para atualizar inscricao

        public InscricaoCreateDTO update (UUID id, InscricaoCreateDTO inscricaoDTO){
            Inscricoes inscricao = converToEntity(inscricaoDTO);
            inscricao.setId(id);
            inscricao = inscricaoRepository.save(inscricao);
            return converToDTO(inscricao);
        }

        //metodo para listar as inscricoes
        public List<InscricaoCreateDTO> findyAll () {
            List<Inscricoes> inscricoes = inscricaoRepository.findAll();
            // criar uma lista de inscricao createDTO
            List<InscricaoCreateDTO> inscricaoCreateDTOS = new ArrayList<>();
            // para cada inscricao na lista de eventos, converter para DTO e add na
            for (Inscricoes inscricao : inscricoes) {
                inscricaoCreateDTOS.add(converToDTO(inscricao));
            }
            return inscricaoCreateDTOS;
        }
        //metodo para deletar uma inscricao
        public void Delete (UUID id){
            inscricaoRepository.deleteById(id);
        }

        public InscricaoCreateDTO converToDTO (Inscricoes inscricoes){
            InscricaoCreateDTO inscricaoCreateDTO = new InscricaoCreateDTO();
            inscricaoCreateDTO.setEvento(inscricoes.getEvento());
            inscricaoCreateDTO.setUsuario(inscricoes.getUsuario());
            inscricaoCreateDTO.setDataHora(inscricoes.getDataHora());
            inscricaoCreateDTO.setStatusPagamento(inscricoes.getStatusPagamento());

         return inscricaoCreateDTO;
        }
        public Inscricoes converToEntity (InscricaoCreateDTO inscricaoCreateDTO) {
            Inscricoes inscricoes = new Inscricoes();
            inscricoes.setEvento(inscricaoCreateDTO.getEvento());
            inscricoes.setUsuario(inscricaoCreateDTO.getUsuario());
            inscricoes.setDataHora(inscricaoCreateDTO.getDataHora());
            inscricoes.setStatusPagamento(inscricaoCreateDTO.getStatusPagamento());
            return inscricoes;

        }

    }
