package com.becarios.proyecto_definitivo.model.criterios;
// Generated 22-mar-2017 16:51:30 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cuoriginal generated by hbm2java
 */
@Entity
@Table(name = "cuoriginal", catalog = "HE")
public class Cuoriginal implements java.io.Serializable {

    private int casosdeUsosCodigo;
    private int complejidad;
    private int total;

    public Cuoriginal() {
    }

    public Cuoriginal(int casosdeUsosCodigo, int complejidad, int total) {
        this.casosdeUsosCodigo = casosdeUsosCodigo;
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
