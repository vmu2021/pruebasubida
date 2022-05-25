package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.EmpleadoConId;
@RepositoryRestResource(path="empleados", collectionResourceRel="empleado", itemResourceRel="empleados")
public interface EmpleadoDAO extends JpaRepository<EmpleadoConId, Long>,EmpleadoDAOCustom  {

    EmpleadoConId findByDni(String dni);

}
