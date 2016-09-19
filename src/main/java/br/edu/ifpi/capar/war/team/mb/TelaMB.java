package br.edu.ifpi.capar.war.team.mb;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;


/**
 *
 * @author Denylson Melo
 */
@ManagedBean(name = "mbTela")
public class TelaMB {

    private String nome;
    private String nomeVindoDaTela;

    public String getNomeVindoDaTela() {
        return nomeVindoDaTela;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerAlgumaCoisa(){
        System.out.println(nome);
        nomeVindoDaTela = nome;
        nome = new String();
    }
}
