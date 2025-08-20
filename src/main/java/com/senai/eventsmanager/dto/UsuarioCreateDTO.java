package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.UsuarioEnum;

import java.time.LocalDateTime;

public class UsuarioCreateDTO {

       private String nome;
        private String email;
       private String senha;
        private String cpf;
        private String telefone;
        private UsuarioEnum tipoUsuario;
        private LocalDateTime dataNascimento;

    public UsuarioCreateDTO() {
    }

    public UsuarioCreateDTO(String nome,
                            String email, String senha, String cpf, String telefone,
                            UsuarioEnum tipoUsuario, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.dataNascimento = dataNascimento;
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

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
