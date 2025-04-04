package br.twice.tp1;

import br.twice.dto.EstadoDTO;
import br.twice.service.EstadoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/*caixa alta "ABCD" é constante */


@Path("/estados")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstadoResource {

    @Inject
    EstadoService service;

/* stream é uma transmissão de dados, ou seja, uma cópia da informação. a fonte não é alterada, apenas a cópia */
/* map mapeia uma coisa por outra */


    @GET
    public Response buscarTodos() {
        return Response.ok().entity(service.findAll()).build();
    } /*novo (pesquisar o uso de response) */

    @GET
    @Path("/sigla/{sigla}")
    public Response buscarPorSigla(String sigla) {
        return Response.ok().entity(service.findBySigla(sigla)).build();
    } /*novo */

    @GET
    @Path("/id/{id}")
    public Response buscarPorId(Long id) {
        return Response.ok().entity(service.findById(id)).build();
    } /*novo */

    @POST
    @Transactional
    public Response incluir(@Valid EstadoDTO dto) {
        return Response.status(Status.CREATED).entity(service.create(dto)).build();
    } /* novo (pesquisar o uso de response) */
    //valid é a validação do dto(NotBlank que foi colocado), se não passar, retorna erro 400 (bad request)
    //VALIDAR AS INFORMAÇÕES DO DTO NO TRABALHO, POIS SERÁ OBRIGATÓRIO!!!

    @PUT
    @Path("/{id}") // Adicionando o ID como parâmetro de caminho
    public Response alterar(long id, EstadoDTO dto) {
        service.update(dto, id);
        return Response.noContent().build(); // Retorna 204 No Content
    } /*alterado com response também */
   

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response apagar(@PathParam("id") Long id) {
       service.delete(id);
       return Response.noContent().build(); // Retorna 204 No Content
    }
}