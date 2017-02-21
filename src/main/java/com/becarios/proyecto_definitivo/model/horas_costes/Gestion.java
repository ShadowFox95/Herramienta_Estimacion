package com.becarios.proyecto_definitivo.model.horas_costes;

public class Gestion {
    private String nombre;
    private int nivel;
    private int porcentaje;
    private boolean internaPractica;
    private int horas;
    private int coste;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean getInternaPractica() {
        return internaPractica;
    }

    public void setInternaPractica(boolean internaPractica) {
        this.internaPractica = internaPractica;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

}
