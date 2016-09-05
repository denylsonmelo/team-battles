/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

import br.edu.ifpi.capar.war.team.generico.EntidadeGenerica;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Agustin
 */
@Entity
public class Jogador extends EntidadeGenerica {

    private String nickName;
    private String nome;
    private LocalDateTime nascimento;//@TODO é do tipo data
    private String sexo;

    public Jogador() {
        super(1);
    }

    @Override
    public String toString() {
        return "Jogador{" + "nickName=" + nickName + ", nome=" + nome + ", nascimento=" + nascimento + ", sexo=" + sexo + '}';
    }
    
    public Jogador(String nickName, String nome, LocalDateTime nascimento, String sexo, long id) {
        super(id);
        this.nickName = nickName;
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
