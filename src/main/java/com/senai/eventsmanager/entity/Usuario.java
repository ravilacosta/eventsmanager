package com.senai.eventsmanager.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "UUID")
 @Column(nullable = false,unique = true,updatable = false)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false,unique = true)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private UsuarioEnum tipoUsuario;
    @Column(nullable = false)
    private Date dataNascimento;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Usuario() {
    }

    public Usuario(UUID id, String nome, String email, String senha, String cpf, String telefone, UsuarioEnum tipoUsuario, Date dataNascimento, LocalDateTime createdAt, LocalDateTime updatedAt, List<Usuario> usuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.dataNascimento = dataNascimento;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UsuarioEnum getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(UsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }



    @OneToMany (mappedBy = "usuario")
    private List<Inscricoes> inscricoes;



}
