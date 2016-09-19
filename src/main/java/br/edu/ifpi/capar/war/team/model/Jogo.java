/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Agustin
 */
@Entity
public class Jogo implements Serializable{
   
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String modalidade;
    @OneToMany
    private List<Time> listTime;
    @OneToMany
    private List<Campeonato> listCampeonato;
    
    public Jogo() {
    }

    public Jogo(String nome, String modalidade, List<Time> listTime, List<Campeonato> listCampeonato) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.listTime = listTime;
        this.listCampeonato = listCampeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public List<Time> getListTime() {
        return listTime;
    }

    public void setListTime(List<Time> listTime) {
        this.listTime = listTime;
    }

    public List<Campeonato> getListCampeonato() {
        return listCampeonato;
    }

    public void setListCampeonato(List<Campeonato> listCampeonato) {
        this.listCampeonato = listCampeonato;
    }

    @Override
    public String toString() {
        return "Jogo{" + "nome=" + nome + ", modalidade=" + modalidade + 
                ", listTime=" + listTime + ", listCampeonato=" + listCampeonato + '}';
    }
}
