/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * Classe persistida no banco para guardar um jogador
 *
 * @author Patrick Rodrigues
 * @author Denylson Melo
 * @author Augustin
 */
@Entity
@SequenceGenerator(name = "jogador_sequence", initialValue = 1, allocationSize = 1, sequenceName = "jogagor_sequence_id")
public class Jogador implements Serializable {

    @Id @GeneratedValue(generator = "jogador_sequence")
    private long id;
    //apelido do jogador
    private String nickName;
    private String nome;
    private LocalDateTime nascimento;//@TODO é do tipo data
    private Character sexo;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;

    /**
     * Construtor padrão da classe Jogador
     */
    public Jogador() {
    }

    /**
     * Construtor completo da classe Jogador
     * 
     * @param nickName Apelido escolhido pelo jogador
     * @param nome
     * @param nascimento
     * @param sexo
     * @param time 
     */
    public Jogador(String nickName, String nome, LocalDateTime nascimento, Character sexo, Time time) {
        this.nickName = nickName;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.time = time;
    }

    /**
     * Metodo que retorna o apelido do jogador
     * 
     * @return Apelido do jogador
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nickName=" + nickName + 
                ", nome=" + nome + ", nascimento=" + nascimento + 
                ", sexo=" + sexo + ", time=" + time + '}';
    }
    
}
