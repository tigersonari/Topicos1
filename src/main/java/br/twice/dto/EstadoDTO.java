package br.twice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record  EstadoDTO(
    @NotBlank(message = "O nome deve ser informado") 
    @Size(min = 4, max = 60, message = "O nome deve ter entre 3 e 60 caracteres")
    String nome,

    @Size(min = 2, max = 2, message = "A sigla deve ter 2 caracteres")
    @NotNull(message = "A sigla deve ser informada")
    String sigla,

    @Min(value = 1, message = "O valor mínimo para região deve ser 1")
    int idRegiao
    ) {
}



/* - @Pattern
 * - regex - expressão regular, padrão de validação (ex: [0-11]{3} - dois números para cpf)
 * - consulta lógica para saber se já existe um registro no banco de dados
 * - @Unique - não pode ter mais de um registro com o mesmo valor (ex: cpf, cnpj, e-mail)
 * - validações serão obrigatórias no trabalho (api e/ou banco de dados. @Unique, por exemplo, é no banco de dados). Validações
 * também podem ser feitas no front-end, mas não são obrigatórias. é interessante algumas em front-end para informações do front-end,
 * pois não precisa fazer uma requisição para o back-end. mas não é obrigatório. o back-end deve validar tudo, pois é a regra de negócio.
 * - fazer consulta lógica no banco de dados para saber se já existe um registro com o mesmo valor para não gerar estresse no banco de dados.
 */



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
