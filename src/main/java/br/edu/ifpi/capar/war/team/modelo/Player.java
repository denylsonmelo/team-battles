/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

/**
 *
 * @author Denylson Melo
 */
public class Player {
    
    private final Long id;
    private String nome;
    private String nickname;
    private String nacionalidade;
    private String sexo;

    public Player(Long id, String nome, String nickname, String nacionalidade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
