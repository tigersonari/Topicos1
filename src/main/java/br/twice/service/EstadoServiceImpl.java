package br.twice.service;

import java.util.List;

import br.twice.dto.EstadoDTO;
import br.twice.dto.EstadoResponseDTO;
import br.twice.model.Estado;
import br.twice.model.Regiao;
import br.twice.repository.EstadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EstadoServiceImpl implements EstadoService {

    @Inject
    EstadoRepository estadoRepository;

    @Override
    @Transactional
    public EstadoResponseDTO create(EstadoDTO estado) {


        Estado novoEstado = new Estado();
            novoEstado.setNome(estado.nome());
            novoEstado.setSigla(estado.sigla());

            novoEstado.setRegiao(Regiao.valueOf(estado.idRegiao()));
            
                        //selecionar uma região
            /*Regiao regiao = null;

            for (Regiao r : Regiao.values()){
                if (r.getId() == estado.idRegiao())
                    regiao = r;
            }
            novoEstado.setRegiao(regiao);*/

            //realizando inclusão
            estadoRepository.persist(novoEstado);

            return EstadoResponseDTO.valueOf(novoEstado);

    }

    @Override
    @Transactional
    public void update(EstadoDTO estado, Long id) {

        Estado edicaoEstado = estadoRepository.findById(id);

        edicaoEstado.setNome(estado.nome());
        edicaoEstado.setSigla(estado.sigla());
        edicaoEstado.setRegiao(Regiao.valueOf(estado.idRegiao()));

    }

    @Override
    @Transactional
    public void delete(Long id) {

        /*estadoRepository.deleteById(id);*/

        estadoRepository.deleteById(id);
        Estado estado = estadoRepository.findById(id);
            estadoRepository.delete(estado);

    }

    @Override
    public EstadoResponseDTO findById(Long id) {
        return EstadoResponseDTO.valueOf(estadoRepository.findById(id));
    }

    @Override
    public EstadoResponseDTO findBySigla(String sigla) {
        return EstadoResponseDTO.valueOf(estadoRepository.findBySigla(sigla));
    }

    @Override
    public List<EstadoResponseDTO> findAll() {
        return estadoRepository.findAll().stream().map(e -> EstadoResponseDTO.valueOf(e)).toList();
    }
    
}
