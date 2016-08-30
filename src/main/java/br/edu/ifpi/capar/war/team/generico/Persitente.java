/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.generico;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Denylson Melo
 */
public class Persitente {
    
    private long id;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificao() {
        return dataModificao;
    }

    public void setDataModificao(LocalDateTime dataModificao) {
        this.dataModificao = dataModificao;
    }

    public Persitente(long id, LocalDateTime dataCriacao, LocalDateTime dataModificao) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataModificao = dataModificao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.dataCriacao);
        hash = 53 * hash + Objects.hashCode(this.dataModificao);
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
        final Persitente other = (Persitente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
