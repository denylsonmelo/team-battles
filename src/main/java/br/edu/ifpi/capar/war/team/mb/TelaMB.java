package br.edu.ifpi.capar.war.team.mb;

import java.io.Serializable;
import javax.enterprise.inject.Model;

/**
 *
 * @author Denylson Melo
 */
@Model
public class TelaMB implements Serializable{

    private String nome;
    private String nomeVindoDaTela;

    public TelaMB() {
        System.out.println("contruiu a classe nesse momento");
    }

    public String getNomeVindoDaTela() {
        return nomeVindoDaTela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerAlgumaCoisa() {
        System.out.println(nome);
        nomeVindoDaTela = nome;
    }
}
