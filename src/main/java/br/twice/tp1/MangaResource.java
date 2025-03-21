package br.twice.tp1;

import java.util.List;

import br.twice.model.Manga;
import br.twice.repository.MangaRepository;
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

@Path("/mangas")
public class MangaResource {

    @Inject
    MangaRepository mangaRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manga> buscarTodos() {
        return Manga.findAll().list();
    }

    @GET
    @Path("/titulo/{titulo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Manga buscarPorTitulo(String titulo){
        return mangaRepository.findByTitulo(titulo);
    }

    @GET
    @Path("/editora/{editora}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manga> buscarPorEditora(String editora){
        return mangaRepository.findByEditora(editora);
    }

    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Manga buscarPorId(Long id){
        return mangaRepository.findById(id);
    }

    @GET
    @Path("/autor/{autor}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manga> buscarPorAutor(String autor){
        return mangaRepository.findByAutor(autor);
    }

    @GET
    @Path("/volume/{volume}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manga> buscarPorVolume (int volume){
        return mangaRepository.findByVolume(volume);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Manga incluir(Manga manga) {
        // Persistindo o novo mangá
        manga.persist();
        return manga;
    }

    @PUT
    @Path("/{id}") // Adicionando o ID como parâmetro de caminho
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public void alterar(@PathParam("id") long id, Manga manga) {
        // Buscando o manga existente pelo ID
        Manga edicaoManga = Manga.findById(id);
    
            // Atualizando os dados do manga
            edicaoManga.setTitulo(manga.getTitulo());
            edicaoManga.setVolume(manga.getVolume());
            edicaoManga.setAutor(manga.getAutor());
            edicaoManga.setEditora(manga.getEditora());
    
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void apagar(@PathParam("id") Long id) {
        // Verificando se o manga existe antes de deletar
        Manga manga = Manga.findById(id);
            manga.delete();
    }
}