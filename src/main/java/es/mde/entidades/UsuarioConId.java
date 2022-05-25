package es.mde.entidades;

import es.mde.comun.Usuario;

public class UsuarioConId extends Usuario {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioConId() {
		super();
	}

	@Override
	public String toString() {
		return "UsuarioConId [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getUsername()=" + getUsername()
				+ ", getPasswd()=" + getPasswd() + "]";
	}

}
