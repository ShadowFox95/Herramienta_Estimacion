package com.becarios.proyecto_definitivo.model.criterios;
// Generated 21-abr-2017 13:47:07 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Integracion generated by hbm2java
 */
@Entity
@Table(name = "integracion", catalog = "HE")
public class Integracion implements java.io.Serializable {

    private int casosdeUsosCodigo;
    private int nro;
    private int complejidad;
    private int total;

    public Integracion() {
    }

    public Integracion(int casosdeUsosCodigo, int nro, int complejidad, int total) {
        this.casosdeUsosCodigo = casosdeUsosCodigo;
        this.nro = nro;
        this.complejidad = complejidad;
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

    @Column(name = "Complejidad", nullable = false)
    public int getComplejidad() {
        return this.complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    @Column(name = "Total", nullable = false)
    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
