package es.mde.entidades;

import es.mde.comun.Empleado;

public class AbogadoConId extends EmpleadoConId {

    private int precioHoraExtra;

    public int getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(int precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public AbogadoConId() { }
}
