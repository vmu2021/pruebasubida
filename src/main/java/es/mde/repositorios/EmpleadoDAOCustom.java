package es.mde.repositorios;

import java.util.List;

import es.mde.entidades.EmpleadoConId;

public interface EmpleadoDAOCustom {
	List<EmpleadoConId> getEmpleadosPorTipo(String tipoEmpleado);
	
}
