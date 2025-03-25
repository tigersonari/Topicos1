package br.twice.dto;

import br.twice.model.Municipio;

public record MunicipioResponseDTO(
    Long id,
    String nome,
    EstadoResponseDTO estado) {

    public static MunicipioResponseDTO valueOf(Municipio municipio) {
        if (municipio == null)
            return null;
        return new MunicipioResponseDTO(
            municipio.getId(), 
            municipio.getNome(), 
            EstadoResponseDTO.valueOf(municipio.getEstado())
        );
    }
   
}

    /*mínimo de 5 relacionamentos no projeto a ser entregue */
    /*fazer toda parte administrativa, todos os cruds(admnistrativo): cadastro de usuário, produto, etc*/

/*o dto serve pra transferir dados de um lugar para outro. 
é um objeto que serve para transferir dados entre camadas. retorna o que quero que venha e o que volte*/

/*response deve ser o mais simples possivel, pois sua função é receber e enviar info apenas. 
o dto não tem todas as informações, apenas as necessárias.*/