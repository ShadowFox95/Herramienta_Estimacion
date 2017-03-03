package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NEGOCIO", schema = "USUARI")
public class Negocio extends Tabla {

    /**
     * 
     */
    private static final long serialVersionUID = 5437899284704384663L;

    private int nro;
    private int logica;

    public Negocio(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.nro = 1;
        this.logica = 5;
        super.setTotal(5);
    }

    @Column(name = "NRO", precision = 0, scale = 0)
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Column(name = "LOGICA", precision = 0, scale = 0)
    public int getLogica() {
        return logica;
    }

    public void setLogica(int logica) {
        this.logica = logica;
    }

}
