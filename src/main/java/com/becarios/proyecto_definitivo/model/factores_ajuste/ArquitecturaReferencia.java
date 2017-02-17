package com.becarios.proyecto_definitivo.model.factores_ajuste;

public class ArquitecturaReferencia {

    private int id;
    private String nombre;
    private boolean aplica;
    private boolean definido;
    private int gradoConocimiento;
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

    public boolean isDefinido() {
        return definido;
    }

    public void setDefinido(boolean definido) {
        this.definido = definido;
    }

    public int getGradoConocimiento() {
        return gradoConocimiento;
    }

    public void setGradoConocimiento(int gradoConocimiento) {
        this.gradoConocimiento = gradoConocimiento;
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
