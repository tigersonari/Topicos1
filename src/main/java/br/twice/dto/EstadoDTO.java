package br.twice.dto;

public record  EstadoDTO (String nome, String sigla, int idRegiao) {
    


}



/*a aplicação vai pegar o json e mandar para o dto, que vai mandar para o service, que vai mandar para o repository,
que vai mandar para o banco de dados.*/

/*diferença entre int e integer: int é um tipo primitivo (não são objetos, são valores), integer é um objeto. int é mais rápido, integer é mais lento.
 int não é um objeto, é apenas um valor. integer é um objeto e pode ser nulo. objetos são gerados a partir de classes*/

/*colocar o dto como classe, para que quando não for passado um valor, ele seja nulo. se for passado um valor,
 ele não será nulo.*/

//"final" na classe é que ela não pode ser extendida, ou MODIFICADA. ou seja não pode ter herança

//dto foi feito nesse projeto como uma constante, imutável

//constante deixa o sistema mais rápido, pois não precisa ficar buscando o valor

/*record não é um dto, é uma representação de uma classe imutável. ao usar o record, não é necessário criar os metódos get e set,
pois ele faz isso automaticamente, e é assim que se sabe que está usando um record. sua classe e atributos são final por padrão.*/
