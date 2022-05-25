package es.mde.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Mixins {
	@JsonPropertyOrder({"id","nombreDepartamento"})
	public static interface DepartamentoConId {
		@JsonProperty("departamento")
		abstract String getNombreDepartamento();
	}
	@JsonPropertyOrder({"id","nombre","apellidos","dni","tipoEmpleado","sueldo"})
	public static interface Empleado {
		@JsonProperty("TIPO EMPLEADO")
		abstract String getTipoEmpleado();
	}
}
