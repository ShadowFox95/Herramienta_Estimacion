package com.becarios.proyecto_definitivo.model.attributes;

import com.becarios.proyecto_definitivo.model.Tabla;

public class Vista extends Tabla {

    private int nro;
    private int complejidad;
    private int campos;
    private int listados;
    private int botones;
    private int total;

    public Vista() {
        this.nro = 1;
        this.complejidad = 5;
        this.campos = 5;
        this.listados = 5;
        this.botones = 5;
        this.total = 20;
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

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getListados() {
        return listados;
    }

    public void setListados(int listados) {
        this.listados = listados;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
