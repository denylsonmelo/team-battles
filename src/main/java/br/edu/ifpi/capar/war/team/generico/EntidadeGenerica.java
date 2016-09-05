/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.generico;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author Denylson Melo
 */
@MappedSuperclass
public class EntidadeGenerica implements Serializable{
    
    @Id
    private long id;
    private boolean deletado;
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

    @PrePersist
    public void setDataCriacao() {
        this.dataCriacao = LocalDateTime.now();
    }

    public LocalDateTime getDataModificao() {
        return dataModificao;
    }

    @PreUpdate
    public void setDataModificao() {
        this.dataModificao = LocalDateTime.now();
    }

    public boolean isDeletado() {
        return deletado;
    }

    public void setDeletado(boolean deletado) {
        this.deletado = deletado;
    }

    public EntidadeGenerica(long id) {
        this.id = id;
        this.deletado = false;
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
        final EntidadeGenerica other = (EntidadeGenerica) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
