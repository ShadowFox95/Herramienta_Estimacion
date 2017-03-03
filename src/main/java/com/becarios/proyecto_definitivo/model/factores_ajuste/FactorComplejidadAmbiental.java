package com.becarios.proyecto_definitivo.model.factores_ajuste;

public class FactorComplejidadAmbiental {

    private int id;
    private String nombre;
    private int valoracion;
    private int factorCalculado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getFactorCalculado() {
        return factorCalculado;
    }

    public void setFactorCalculado(int factorCalculado) {
        this.factorCalculado = factorCalculado;
    }

}
