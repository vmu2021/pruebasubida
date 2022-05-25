package es.mde.repositorios;

import es.mde.entidades.DepartamentoConId;


public interface DepartamentoDAOCustom {
	DepartamentoConId findByNombreDepartamento(String nombreDepartamento);
}
