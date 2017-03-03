package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLA", schema = "USUARI")
public class CUOriginal extends Tabla {

    private static final long serialVersionUID = 4246885828035839270L;

    private int dificultad;

    public CUOriginal(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.dificultad = 5;
        super.setTotal(5);
    }

    @Column(name = "DIFICULTAD", precision = 0, scale = 0)
    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

}
