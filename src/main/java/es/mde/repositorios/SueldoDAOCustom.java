package es.mde.repositorios;

import java.util.List;

import es.mde.entidades.SueldoConId;

public interface SueldoDAOCustom {
	
	SueldoConId getTotalMes(long idSueldo);
	List<SueldoConId> listaSueldosTotales();
	
}
