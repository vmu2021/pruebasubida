package es.mde.entidades;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import es.mde.comun.Departamento;
import es.mde.comun.Empleado;

public class DepartamentoConId extends Departamento {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToMany(cascade = CascadeType.ALL, targetEntity = EmpleadoConId.class, mappedBy = "departamento")
	public Collection<Empleado> getEmpleados() {
		return super.getEmpleados();
	}

	public DepartamentoConId() {
		super();
	}

	@Override
	public String getNombreDepartamento() {
		// TODO Auto-generated method stub
		return super.getNombreDepartamento();
	}

	@Override
	public String toString() {
		return "DepartamentoConId [getId()=" + getId() + ", getEmpleados()=" + getEmpleados()
				+ ", getNombreDepartamento()=" + getNombreDepartamento() + "]";
	}


	


}
