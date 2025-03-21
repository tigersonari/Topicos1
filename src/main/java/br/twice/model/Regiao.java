package br.twice.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public enum Regiao {

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    
    //conjunto de constantes, não é alterável
    CENTRO_OESTE(1, "Centro-Oeste"), 
    NORTE(2,"Norte"), 
    NORDESTE(3,"Nordeste"),
    SUDESTE(4,"Sudeste"),
    SUL(5,"Sul");

    private final int ID; //deve ser maiusculo por ser uma constante
    private final String NOME; //ps:e pesquisae sobre o final

    //ps: o enumerador é fixo e não pode possuir o estado 

    //construtor para alterar os valores das constantes, elas só poderão ser alteradas se houver esse construtor
    //todo construtor é PRIVATE
    private Regiao(int id, String nome){
        this.ID = id;
        this.NOME = nome;
    }

    public int getId(){
        return ID;
    }

    public String getNome(){
        return NOME;
    }
    
    // ps: pesquisar pq deve ser static e polimorfismo em java
    public static Regiao valueOf(Integer id){

           if (id == null)
               return null;

            for (Regiao r : Regiao.values()){
                if (r.getId() == id)
                    return r;
            }
            return null;

    }

}

//guardar numero é melhor que guardar string, pois é mais eficiente
//guardar string é mais legível, mas ocupa mais espaço
