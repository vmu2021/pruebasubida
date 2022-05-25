package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.DepartamentoConId;

@RepositoryRestResource(path="departamentos", collectionResourceRel="departamento", itemResourceRel="departamentos")
public interface DepartamentoDAO extends JpaRepository<DepartamentoConId, Long> {
	DepartamentoConId findByNombreDepartamento(String nombreDepartamento);
}
