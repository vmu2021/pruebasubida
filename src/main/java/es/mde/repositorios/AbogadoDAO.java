package es.mde.repositorios;

import es.mde.entidades.AbogadoConId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "abogados", collectionResourceRel = "abogado", itemResourceRel = "abogados")
public interface AbogadoDAO extends JpaRepository<AbogadoConId, Long> {

}
