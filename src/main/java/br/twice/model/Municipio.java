package br.twice.model;

import jakarta.persistence.Entity;

@Entity
public class Municipio extends DefaultEntity {

    private String nome;
    //private Estado estado;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    /*public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }*/
    
}

//estado é o acesso para regiao, de região não se chega a estado. estado -> regiao (estado possui regiao)

/*municipio é o acesso para estado. municipio -> estado (municipio possui estado). pode ser o oposto depedendo
da implementação, mas esta é a mais simples. não há necessidade de complexidade se não for pedido*/

/*enum é constante. enum = muitos para 1*/
