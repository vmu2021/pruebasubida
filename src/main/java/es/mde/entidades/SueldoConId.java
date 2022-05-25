package es.mde.entidades;

import java.time.LocalDate;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Transient;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.domain.jaxb.PageAdapter;

import es.mde.comun.Empleado;
import es.mde.comun.Sueldo;

public class SueldoConId extends Sueldo {

	private long id;
	private boolean pagado = false;
	@Transient
	private double total;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	@Override
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = EmpleadoConId.class)
	@JoinColumn(name = "EMPLEADO")
	public Empleado getEmpleado() {
	
		return super.getEmpleado();
	}

	public SueldoConId() {
		super();
	}


	public SueldoConId(double cantidadMensual, int horasExtras, boolean bonus, LocalDate fechaSueldo, Empleado empleado,
			long id, boolean pagado, double total) {
		super(cantidadMensual, horasExtras, bonus, fechaSueldo, empleado);
		this.id = id;
		this.pagado = pagado;
		this.total = total;
	}

	@Override
	public String toString() {
		return "SueldoConId [id=" + id + ", pagado=" + pagado + ", total=" + total + ", getId()=" + getId()
				+ ", getTotal()=" + getTotal() + ", isPagado()=" + isPagado() + ", getEmpleado()=" + getEmpleado()
				+ "]";
	}

	

	
	

	
	
}
