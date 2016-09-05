/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
public class Partida implements Serializable {

    @Id
    @GeneratedValue
    private long idPartida;
    @ManyToOne
    private Campeonato campeonato;
    @OneToMany
    private List<Time> listTime;
    private Timestamp duracaoPartida;
    private String localPartida;

    public Partida() {
    }

    public Partida(long idPartida, Campeonato campeonato, List<Time> listTime, Timestamp duracaoPartida, String localPartida) {
        this.idPartida = idPartida;
        this.campeonato = campeonato;
        this.listTime = listTime;
        this.duracaoPartida = duracaoPartida;
        this.localPartida = localPartida;
    }

    public long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(long idPartida) {
        this.idPartida = idPartida;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public List<Time> getListTime() {
        return listTime;
    }

    public void setListTime(List<Time> listTime) {
        this.listTime = listTime;
    }

    public Timestamp getDuracaoPartida() {
        return duracaoPartida;
    }

    public void setDuracaoPartida(Timestamp duracaoPartida) {
        this.duracaoPartida = duracaoPartida;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.idPartida ^ (this.idPartida >>> 32));
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
        final Partida other = (Partida) obj;
        if (this.idPartida != other.idPartida) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Partida{" + "idPartida=" + idPartida + 
                ", campeonato=" + campeonato + ", listTime=" + listTime + 
                ", duracaoPartida=" + duracaoPartida + ", localPartida=" + localPartida + '}';
    }
}
