package com.becarios.proyecto_definitivo.model.attributes;

import com.becarios.proyecto_definitivo.model.Tabla;

public class Negocio extends Tabla {

    private int nro;
    private int logica;
    private int total;

    public Negocio() {
        this.nro = 1;
        this.logica = 5;
        this.total = 5;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getLogica() {
        return logica;
    }

    public void setLogica(int logica) {
        this.logica = logica;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
