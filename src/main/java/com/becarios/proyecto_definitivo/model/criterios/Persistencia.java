package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERSISTENCIA", schema = "USUARI")
public class Persistencia extends Tabla {

    private static final long serialVersionUID = -6576940775958796748L;

    private int nro;
    private int accesos;

    public Persistencia(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.nro = 1;
        this.accesos = 5;
        super.setTotal(5);
    }

    @Column(name = "NRO", precision = 0, scale = 0)
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Column(name = "ACCESOS", precision = 0, scale = 0)
    public int getAccesos() {
        return accesos;
    }

    public void setAccesos(int accesos) {
        this.accesos = accesos;
    }

}
