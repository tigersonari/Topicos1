package br.twice.dto;

import br.twice.model.Estado;
import br.twice.model.Regiao;

public record  EstadoResponseDTO (Long id, String nome, String sigla, Regiao regiao) {
    
    public static EstadoResponseDTO valueOf(Estado estado){

        if (estado == null)
        return null;
        return new EstadoResponseDTO(estado.getId(), estado.getNome(), estado.getSigla(), estado.getRegiao());
        }
    }

    /*public static EstadoResponseDTO valueOf(Estado estado){
        if (estado == null) {
            return null;
        }
        return new EstadoResponseDTO(estado.getId(), estado.getNome(), estado.getSigla(), estado.getRegiao());
    } */



//estudar expressões lambda

/*PESQUISAR valueOf e static  */

/*o dto serve pra transferir dados de um lugar para outro. 
é um objeto que serve para transferir dados entre camadas. retorna o que quero que venha e o que volte*/

/*response deve ser o mais simples possivel, pois sua função é receber e enviar info apenas. 
o dto não tem todas as informações, apenas as necessárias.*/