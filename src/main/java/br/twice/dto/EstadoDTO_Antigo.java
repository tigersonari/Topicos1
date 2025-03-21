/*package br.twice.dto;

public class EstadoDTO_Antigo {
    
    private final long idRegiao;
    private final String nome;
    private final String sigla;

//"final" na classe é que ela não pode ser extendida, ou MODIFICADA. ou seja não pode ter herança
//dto foi feito nesse projeto como uma constante, imutável
//constante deixa o sistema mais rápido, pois não precisa ficar buscando o valor
/*record não é um dto, é uma representação de uma classe imutável. ao usar o record, não é necessário criar os metódos get e set,
pois ele faz isso automaticamente, e é assim que se sabe que está usando um record. sua classe e atributos são final por padrão.

    public EstadoDTO_Antigo(long idRegiao, String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.idRegiao = idRegiao;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    public long getIdRegiao(){
        return idRegiao;
    }


}*/
