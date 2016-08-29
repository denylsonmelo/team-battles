/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

/**
 *
 * @author Agustin
 */
public class Jogador {
    private long idJogador;
    private String nickName;
    private Jogo jogo;
    private String nome;
    private String nascimento;// é do tipo data
    private String sexo;

    public Jogador() {
    }
    
    public Jogador(int idJogador, String nome, String nascimento, String sexo, String nickName) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.nickName = nickName;
    }

    public long getIdJogador() {
        return idJogador;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (this.idJogador ^ (this.idJogador >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.idJogador != other.idJogador) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}
