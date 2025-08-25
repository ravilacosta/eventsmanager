package com.senai.eventsmanager.repository;

import com.senai.eventsmanager.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    List<Usuario> id(UUID id);

    List<Usuario> id(UUID id);

    UUID id(UUID id);
}
