package br.edu.ifpi.capar.war.team.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
public class Treinador implements Serializable{
    
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String nascimento;// é do tipo data
    private Character sexo;
    @OneToOne
    private List<Time> listTime;

    public Treinador() {
    }

    public Treinador(long id, String nome, String nascimento, Character sexo, List<Time> listTime) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.listTime = listTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public List<Time> getListTime() {
        return listTime;
    }

    public void setListTime(List<Time> listTime) {
        this.listTime = listTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Treinador other = (Treinador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Treinador{" + "id=" + id + ", nome=" + nome + 
                ", nascimento=" + nascimento + ", sexo=" + sexo + 
                ", listTime=" + listTime + '}';
    }
}
