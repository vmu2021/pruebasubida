package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.SueldoConId;
@RepositoryRestResource(path="sueldos", collectionResourceRel="sueldo", itemResourceRel="sueldos")
public interface SueldoDAO extends JpaRepository<SueldoConId, Long>,SueldoDAOCustom{

}
