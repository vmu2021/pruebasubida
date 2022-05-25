package es.mde.repositorios;

import es.mde.entidades.JefeDepartamentoConId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "jefes", collectionResourceRel = "jefe", itemResourceRel = "jefes")
public interface JefeDepartamentoDAO extends JpaRepository<JefeDepartamentoConId, Long> {

}
