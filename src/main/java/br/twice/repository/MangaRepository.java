package br.twice.repository;

import java.util.List;

import br.twice.model.Manga;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MangaRepository implements PanacheRepository<Manga>{
    
    public Manga findByTitulo(String titulo){
       return find("SELECT m FROM Manga m WHERE m.titulo = ?1 ", titulo).firstResult();
    }

    public List<Manga> findByAutor(String autor) {
        return find("SELECT m FROM Manga m WHERE m.autor = ?1", autor).list();
    }

    public List<Manga> findByEditora(String editora) {
        return find("SELECT m FROM Manga m WHERE m.editora = ?1", editora).list();
    }

    public List<Manga> findByVolume(int volume) {
        return find("SELECT m FROM Manga m WHERE m.volume = ?1", volume).list();
    }

    public Manga findById(Long id){
        return find("SELECT m FROM Manga m WHERE m.id =?1 ", id).firstResult();
     }
}