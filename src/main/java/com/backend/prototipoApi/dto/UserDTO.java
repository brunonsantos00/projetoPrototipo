package com.backend.prototipoApi.dto;

import java.util.Date;

import com.backend.prototipoApi.entity.User;

public class UserDTO {
	
	
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Date dataCriacao;
    private Date dataAtualizacao;


    

    public UserDTO(User user) {
        this.id = user.getId();
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.senha = user.getSenha();
        this.dataCriacao = user.getDataCriacao();
        this.dataAtualizacao = user.getDataAtualizacao();
    }

    // getters e setters

   
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
