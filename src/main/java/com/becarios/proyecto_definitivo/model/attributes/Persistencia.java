package com.becarios.proyecto_definitivo.model.attributes;

import com.becarios.proyecto_definitivo.model.Tabla;

public class Persistencia extends Tabla {

    private int nro;
    private int accesos;
    private int total;

    public Persistencia() {
        this.nro = 1;
        this.accesos = 5;
        this.total = 5;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getAccesos() {
        return accesos;
    }

    public void setAccesos(int accesos) {
        this.accesos = accesos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
