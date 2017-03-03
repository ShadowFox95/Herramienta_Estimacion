package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERFILES", schema = "USUARI")
public class Perfiles extends Tabla {

    private static final long serialVersionUID = 2459325829828789001L;

    private int nro;
    private int complejidad;

    public Perfiles(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.nro = 1;
        this.complejidad = 5;
        super.setTotal(5);
    }

    @Column(name = "NRO", precision = 0, scale = 0)
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Column(name = "COMPLEJIDAD", scale = 0)
    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

}
