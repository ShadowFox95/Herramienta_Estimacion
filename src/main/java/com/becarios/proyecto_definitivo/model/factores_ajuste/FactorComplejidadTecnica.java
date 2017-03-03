package com.becarios.proyecto_definitivo.model.factores_ajuste;

public class FactorComplejidadTecnica {

    private int id;
    private String nombre;
    private boolean aplica;
    private int gradoDefinicion;
    private int gradoExigencia;
    private int impacto;
    private int riesgo;

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

    public boolean isAplica() {
        return aplica;
    }

    public void setAplica(boolean aplica) {
        this.aplica = aplica;
    }

    public int getGradoDefinicion() {
        return gradoDefinicion;
    }

    public void setGradoDefinicion(int gradoDefinicion) {
        this.gradoDefinicion = gradoDefinicion;
    }

    public int getGradoExigencia() {
        return gradoExigencia;
    }

    public void setGradoExigencia(int gradoExigencia) {
        this.gradoExigencia = gradoExigencia;
    }

    public int getImpacto() {
        return impacto;
    }

    public void setImpacto(int impacto) {
        this.impacto = impacto;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

}
