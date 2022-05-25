package es.mde.repositorios;

import es.mde.entidades.BecarioConId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="becarios", collectionResourceRel="becario", itemResourceRel="becarios")
public interface BecarioDAO extends JpaRepository<BecarioConId, Long>  {

}
