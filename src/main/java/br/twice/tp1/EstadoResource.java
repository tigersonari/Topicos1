package br.twice.tp1;

import java.util.List;

import br.twice.dto.EstadoDTO;
import br.twice.dto.EstadoResponseDTO;
import br.twice.service.EstadoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/estados")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstadoResource {

    @Inject
    EstadoService service;

/* stream é uma transmissão de dados, ou seja, uma cópia da informação. a fonte não é alterada, apenas a cópia */
/* map mapeia uma coisa por outra */

/*estudar diagrama de classes */

    @GET
    public List<EstadoResponseDTO> buscarTodos() {
        /*service.findAll().forEach(e -> e.getId());*/

        /*return service.findAll().stream().map(e -> EstadoResponseDTO.valueOf(e)).toList();*/
            return service.findAll();

        
        //return service.findAll();
    }

    @GET
    @Path("/sigla/{sigla}")
    public EstadoResponseDTO buscarPorSigla(String sigla) {
        return service.findBySigla(sigla);
    }

    @GET
    @Path("/id/{id}")
    public EstadoResponseDTO buscarPorId(Long id) {
        return service.findById(id);
    }

    @POST
    @Transactional
    public EstadoResponseDTO incluir(EstadoDTO dto) {

        return service.create(dto);
        /*EstadoResponseDTO estado = service.create(dto);
        EstadoResponseDTO response = new EstadoResponseDTO(estado.getId(), estado.getNome(), estado.getSigla(), estado.getRegiao());
        return response;*/
    }

    @PUT
    @Path("/{id}") // Adicionando o ID como parâmetro de caminho
    public void alterar(@PathParam("id") long id, EstadoDTO dto) {
        service.update(dto, id);
    }
   

    @DELETE
    @Path("/{id}")
    @Transactional
    public void apagar(@PathParam("id") Long id) {
       service.delete(id);
    }
}