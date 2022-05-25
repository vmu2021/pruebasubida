package es.mde.entidades;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import es.mde.comun.Departamento;
import es.mde.comun.Empleado;
import es.mde.comun.Sueldo;

public class EmpleadoConId extends Empleado {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToMany(cascade = CascadeType.ALL, targetEntity = SueldoConId.class, mappedBy = "empleado")
	public Collection<Sueldo> getSueldos() {
		return super.getSueldos();
	}


	@Override
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = DepartamentoConId.class)
	@JoinColumn(name = "DEPARTAMENTO")
	public Departamento getDepartamento() {
		// TODO Auto-generated method stub
		return super.getDepartamento();
	}

	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return super.getApellidos();
	}

	@Override
	public String getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}


	public EmpleadoConId() {
		super();
	}



	public EmpleadoConId(String nombre, String apellidos, String dni, String tipoEmpleado, Collection<Sueldo> sueldos,
			Departamento departamento, long id) {
		super(nombre, apellidos, dni, tipoEmpleado, sueldos, departamento);
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmpleadoConId [getId()=" + getId() + ", getSueldos()=" + getSueldos() + ", getDepartamento()="
				+ getDepartamento() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
				+ ", getDni()=" + getDni() + "]";
	}


}
