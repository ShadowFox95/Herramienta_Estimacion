package com.becarios.proyecto_definitivo.model.criterios;
// Generated 22-mar-2017 16:51:30 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Negocio generated by hbm2java
 */
@Entity
@Table(name = "negocio", catalog = "HE")
public class Negocio implements java.io.Serializable {

    private int casosdeUsosCodigo;
    private int nro;
    private int logica;
    private int total;

    public Negocio() {
    }

    public Negocio(int casosdeUsosCodigo, int nro, int logica, int total) {
        this.casosdeUsosCodigo = casosdeUsosCodigo;
        this.nro = nro;
        this.logica = logica;
        this.total = total;
    }

    @Id

    @Column(name = "CasosdeUsos_Codigo", unique = true, nullable = false)
    public int getCasosdeUsosCodigo() {
        return this.casosdeUsosCodigo;
    }

    public void setCasosdeUsosCodigo(int casosdeUsosCodigo) {
        this.casosdeUsosCodigo = casosdeUsosCodigo;
    }

    @Column(name = "Nro", nullable = false)
    public int getNro() {
        return this.nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Column(name = "Logica", nullable = false)
    public int getLogica() {
        return this.logica;
    }

    public void setLogica(int logica) {
        this.logica = logica;
    }

    @Column(name = "Total", nullable = false)
    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
