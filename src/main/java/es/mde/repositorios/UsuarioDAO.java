package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import es.mde.entidades.UsuarioConId;

@RepositoryRestResource(path="usuarios", collectionResourceRel="usuario", itemResourceRel="usuarios")
public interface UsuarioDAO extends JpaRepository< UsuarioConId, Long>{

}
