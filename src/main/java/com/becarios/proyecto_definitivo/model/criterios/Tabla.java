package com.becarios.proyecto_definitivo.model.criterios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Tabla implements Serializable {

    private static final long serialVersionUID = -3744239489187828037L;

    private int total;
    private String codigoRef;

    @Id
    @Column(name = "CODIGO_CASO_DE_USO", unique = true, nullable = false, length = 8)
    public String getCodigoRef() {
        return codigoRef;
    }

    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }

    @Column(name = "TOTAL", precision = 0, scale = 0)
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
