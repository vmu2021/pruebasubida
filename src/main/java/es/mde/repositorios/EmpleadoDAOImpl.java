package es.mde.repositorios;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;

import es.mde.entidades.EmpleadoConId;

public class EmpleadoDAOImpl implements EmpleadoDAOCustom{
	@Autowired
	private EmpleadoDAO empleadoDAO;

	@Override
	public List<EmpleadoConId> getEmpleadosPorTipo(String tipoEmpleado) {
		
		return Collections.emptyList();
	}
	
	

}
