package br.twice.repository;


import java.util.List;

import br.twice.model.Municipio;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MunicipioRepository implements PanacheRepository<Municipio>{
    
    public List<Municipio> findByNome (String nome){
       return find("SELECT m FROM Municipio m WHERE m.nome LIKE ?1 ", "%" + nome + "%").list();
    }

/*em "SELECT m FROM Municipio m WHERE m.nome LIKE ?1 ", é usado m aporque a consulta é ao municipio. se fosse, por exemplo,
 * consulta a estado, no lugar de m seria usado e.
 */


    public List<Municipio> findByEstado(Long idEstado){
        return find("SELECT m FROM Municipio m WHERE m.estado.id =?1 ", idEstado).list();
     }

}

/*isso não é sql, é um hql. é uma consulta orientada a objeto */
