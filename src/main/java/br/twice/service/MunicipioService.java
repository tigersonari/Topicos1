package br.twice.service;

import java.util.List;

import br.twice.dto.MunicipioDTO;
import br.twice.dto.MunicipioResponseDTO;

public interface MunicipioService {

  MunicipioResponseDTO create(MunicipioDTO Municipio);
  void update(long id, MunicipioDTO Municipio);
  void delete(long id);
  MunicipioResponseDTO findById(long id);
  List<MunicipioResponseDTO> findByEstado(Long idEstado);
  List<MunicipioResponseDTO> findByNome(String nome);
  List<MunicipioResponseDTO> findAll();
  
}

/*usar ctrl + f para fazer a troca de um nome por outro. ex: em todo lugar que tiver a palvra ESTADO
 * será substituida por MUNICIPIO.
 */

/*fazer os testes e estudar, pois será apresentado em sala */
