package es.mde.repositorios;

import java.util.List;

import es.mde.entidades.AbogadoConId;
import es.mde.entidades.EmpleadoConId;
import es.mde.entidades.JefeDepartamentoConId;
import org.springframework.beans.factory.annotation.Autowired;

import es.mde.comun.Empleado;
import es.mde.entidades.SueldoConId;

public class SueldoDAOImpl implements SueldoDAOCustom{

	@Autowired
	private SueldoDAO sueldoDAO;

	@Autowired
	private EmpleadoDAO empleadoDAO;

	@Override
	public SueldoConId getTotalMes(long idSueldo) {
		
		SueldoConId sueldoMes = sueldoDAO.findById(idSueldo).get();
		Empleado empleado = sueldoMes.getEmpleado();
		if(empleado != null) {
		double sueldoTotal = calcularTotal(sueldoMes, empleado);
		sueldoMes.setTotal(sueldoTotal);
		}
		return sueldoMes;
	}

	private double calcularTotal(SueldoConId sueldoMes, Empleado empleado) {
		double sueldoTotal = 0;
		EmpleadoConId empleadoConId = empleadoDAO.findByDni(empleado.getDni());
		if(empleadoConId instanceof JefeDepartamentoConId) {
			JefeDepartamentoConId jefeDepartamentoConId = (JefeDepartamentoConId) empleadoConId;
			sueldoTotal = sueldoMes.isBonus()? sueldoMes.getCantidadMensual() + jefeDepartamentoConId.getBono() : sueldoMes.getCantidadMensual();
		}else if(empleadoConId instanceof AbogadoConId) {
			AbogadoConId abogadoConId = (AbogadoConId) empleadoConId;
			sueldoTotal = sueldoMes.getCantidadMensual() + sueldoMes.getHorasExtras()*abogadoConId.getPrecioHoraExtra();
		}else {
			sueldoTotal = sueldoMes.getCantidadMensual();
		}
		return sueldoTotal;
	}

	@Override
	public List<SueldoConId> listaSueldosTotales() {
			List<SueldoConId> sueldos= sueldoDAO.findAll();
			sueldos.stream().forEach(sueldo -> {
			Empleado empleado = sueldo.getEmpleado();
			if(empleado != null) {
			double sueldoTotal= calcularTotal(sueldo, empleado);
			sueldo.setTotal(sueldoTotal);
			}
		});
		return sueldos;
	}

}
