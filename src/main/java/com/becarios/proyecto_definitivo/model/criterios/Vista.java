package com.becarios.proyecto_definitivo.model.criterios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VISTA", schema = "USUARI")
public class Vista extends Tabla {

    private static final long serialVersionUID = -4470615942677187015L;

    private int nro;
    private int complejidad;
    private int campos;
    private int listados;
    private int botones;

    public Vista(String codigoRef) {
        super.setCodigoRef(codigoRef);
        this.nro = 1;
        this.complejidad = 5;
        this.campos = 5;
        this.listados = 5;
        this.botones = 5;
        super.setTotal(20);
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

    @Column(name = "BOTONES", precision = 0, scale = 0)
    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Column(name = "CAMPOS", precision = 0, scale = 0)
    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    @Column(name = "LISTADOS", precision = 0, scale = 0)
    public int getListados() {
        return listados;
    }

    public void setListados(int listados) {
        this.listados = listados;
    }

}
