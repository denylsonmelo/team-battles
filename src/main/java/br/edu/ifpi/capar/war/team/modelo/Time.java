package br.edu.ifpi.capar.war.team.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 *
 * @author Patrick Rodrigues
 */

@Entity
public class Time implements Serializable{
    
    @Id @GeneratedValue
    private long idTime;
    private String nome;
    @OneToMany
    private List<Jogador> jogadores;
    @OneToOne
    private Jogo jogo;
    @OneToOne
    private Treinador treinador;

    public Time() {
    }

    public Time(long idTime, String nome, List<Jogador> jogadores, Jogo jogo, Treinador treinador) {
        this.idTime = idTime;
        this.nome = nome;
        this.jogadores = jogadores;
        this.jogo = jogo;
        this.treinador = treinador;
    }

    public long getIdTime() {
        return idTime;
    }

    public void setIdTime(long idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (this.idTime ^ (this.idTime >>> 32));
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
        final Time other = (Time) obj;
        if (this.idTime != other.idTime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Time{" + "idTime=" + idTime + ", nome=" + nome + ", jogadores=" + jogadores + ", jogo=" + jogo + ", treinador=" + treinador + '}';
    }
}
