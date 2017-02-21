package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INTEGRACION", schema = "USUARI")
public class Integracion extends Tabla {

    private static final long serialVersionUID = 4006336308830010409L;

    private int nro;
    private int complejidad;

    public Integracion(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.nro = 1;
        this.complejidad = 2;
        super.setTotal(2);
    }

    @Column(name = "NRO", precision = 0, scale = 0)
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Column(name = "COMPLEJIDAD", precision = 0, scale = 0)
    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

}
