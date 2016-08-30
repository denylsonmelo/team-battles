/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

import br.edu.ifpi.capar.war.team.generico.Persitente;
import java.time.LocalDateTime;

/**
 *
 * @author Agustin
 */
public class Jogador extends Persitente {

    private String nickName;
    private Jogo jogo;
    private String nome;
    private LocalDateTime nascimento;//@TODO é do tipo data
    private String sexo;

    public Jogador(String nickName, Jogo jogo, String nome, LocalDateTime nascimento, String sexo, long id, LocalDateTime dataCriacao, LocalDateTime dataModificao) {
        super(id, dataCriacao, dataModificao);
        this.nickName = nickName;
        this.jogo = jogo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
