package com.becarios.proyecto_definitivo.model.criterios;

public class CUOriginal extends Tabla {
    private int dificultad;
    private int total;

    public CUOriginal() {
        this.dificultad = 5;
        this.total = 5;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
