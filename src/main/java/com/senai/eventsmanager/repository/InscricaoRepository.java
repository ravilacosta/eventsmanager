package com.senai.eventsmanager.repository;

import com.senai.eventsmanager.entity.Inscricoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InscricaoRepository extends JpaRepository<Inscricoes, UUID> {
}
