package br.twice.repository;


import br.twice.model.Estado;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoRepository implements PanacheRepository<Estado>{
    
    public Estado findBySigla(String sigla){
       return find("SELECT e FROM Estado e WHERE e.sigla = ?1 ", sigla).firstResult();
    }

        @Override
    public Estado findById(Long id){
        return find("SELECT e FROM Estado e WHERE e.id =?1 ", id).firstResult();
     }

}
