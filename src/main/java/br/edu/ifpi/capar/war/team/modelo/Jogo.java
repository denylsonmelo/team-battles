/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpi.capar.war.team.modelo;

import br.edu.ifpi.capar.war.team.generico.EntidadeGenerica;
import java.time.LocalDateTime;
import javax.persistence.Entity;

/**
 *
 * @author Agustin
 */
@Entity
public class Jogo extends EntidadeGenerica{
    private long idJogo;
    private String nome;
    private String modalidade;

    public Jogo(long id) {
        super(id);
    }
    
    
}
