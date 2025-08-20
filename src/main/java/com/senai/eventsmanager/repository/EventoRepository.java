package com.senai.eventsmanager.repository;

import com.senai.eventsmanager.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {
// save, delete, update, findAll, findbyAll
}
