package br.twice.service;

import java.util.List;

import br.twice.dto.MunicipioDTO;
import br.twice.dto.MunicipioResponseDTO;
import br.twice.model.Estado;
import br.twice.model.Municipio;
import br.twice.repository.EstadoRepository;
import br.twice.repository.MunicipioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MunicipioServiceImpl implements MunicipioService {

    @Inject
    MunicipioRepository municipioRepository;

    @Inject
    EstadoRepository estadoRepository;

    @Override
    @Transactional
    public MunicipioResponseDTO create(MunicipioDTO dto) {
        Municipio novoMunicipio = new Municipio();
        novoMunicipio.setNome(dto.nome());

        // buscando o estado pelo id
        Estado estado = estadoRepository.findById(dto.idEstado());

        novoMunicipio.setEstado(estado);

        // realizando inclusao
        municipioRepository.persist(novoMunicipio);

        return MunicipioResponseDTO.valueOf(novoMunicipio);
    }

    @Override
    @Transactional
    public void update(long id, MunicipioDTO dto) {
        Municipio edicaoMunicipio = municipioRepository.findById(id);

        edicaoMunicipio.setNome(dto.nome());
        // buscando o estado pelo id
        Estado estado = estadoRepository.findById(dto.idEstado());
        edicaoMunicipio.setEstado(estado);
    }

    @Override
    @Transactional
    public void delete(long id) {
        municipioRepository.deleteById(id);
    }

    @Override
    public MunicipioResponseDTO findById(long id) {
        return MunicipioResponseDTO.valueOf(municipioRepository.findById(id));
    }

    @Override
    public List<MunicipioResponseDTO> findByEstado(Long idEstado) {
        return municipioRepository.findByEstado(idEstado)
        .stream().map(e -> MunicipioResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<MunicipioResponseDTO> findByNome(String nome) {
        return municipioRepository.findByNome(nome)
        .stream().map(e -> MunicipioResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<MunicipioResponseDTO> findAll() {
        return municipioRepository.findAll().stream().map(e -> MunicipioResponseDTO.valueOf(e)).toList();
    }
    
}
