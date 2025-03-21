package br.twice.service;

import java.util.List;

import br.twice.dto.EstadoDTO;
import br.twice.dto.EstadoResponseDTO;

public interface EstadoService {
    
  public EstadoResponseDTO create(EstadoDTO estado);
  void update(EstadoDTO estado, Long id);
  void delete(Long id);
  public EstadoResponseDTO findById(Long id);
  public EstadoResponseDTO findBySigla(String sigla);
  public List<EstadoResponseDTO> findAll();

}
