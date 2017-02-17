package com.becarios.proyecto_definitivo.model.criterios;

public class Integracion extends Tabla {
    private int nro;
    private int complejidad;
    private int total;

    public Integracion() {
        this.nro = 1;
        this.complejidad = 2;
        this.total = 2;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
