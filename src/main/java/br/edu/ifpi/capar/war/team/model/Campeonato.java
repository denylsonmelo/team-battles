package br.edu.ifpi.capar.war.team.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Patrick Rodrigues
 */

@Entity
public class Campeonato implements Serializable{
    
    @Id @GeneratedValue
    private long idCampeonato;
    private String nome;
    @ManyToOne
    private Jogo jogo;
    @ManyToMany
    private List<Time> listTime;
    @OneToMany
    private List<Partida> listPartidas; 
    private String local;
    private String data; //o tipo de data ta errado

    public Campeonato() {
    }

    public Campeonato(long idCampeonato, String nome, Jogo jogo, List<Time> listTime, List<Partida> listPartidas, String local, String data) {
        this.idCampeonato = idCampeonato;
        this.nome = nome;
        this.jogo = jogo;
        this.listTime = listTime;
        this.listPartidas = listPartidas;
        this.local = local;
        this.data = data;
    }

    public long getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(long idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public List<Time> getListTime() {
        return listTime;
    }

    public void setListTime(List<Time> listTime) {
        this.listTime = listTime;
    }

    public List<Partida> getListPartidas() {
        return listPartidas;
    }

    public void setListPartidas(List<Partida> listPartidas) {
        this.listPartidas = listPartidas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (this.idCampeonato ^ (this.idCampeonato >>> 32));
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
        final Campeonato other = (Campeonato) obj;
        if (this.idCampeonato != other.idCampeonato) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Campeonato{" + "idCampeonato=" + idCampeonato + 
                ", nome=" + nome + ", jogo=" + jogo + 
                ", listTime=" + listTime + ", listPartidas=" + listPartidas + 
                ", local=" + local + ", data=" + data + '}';
    }

    
}
