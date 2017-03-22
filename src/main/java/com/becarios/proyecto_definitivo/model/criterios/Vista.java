package com.becarios.proyecto_definitivo.model.criterios;
// Generated 22-mar-2017 16:46:32 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vista generated by hbm2java
 */
@Entity
@Table(name = "vista", catalog = "HE")
public class Vista extends Tabla implements java.io.Serializable {

	private int casosdeUsosCodigo;
	private int nro;
	private int complejidad;
	private int total;
	private int campos;
	private int listados;
	private int botones;

	public Vista() {
	}

	public Vista(int casosdeUsosCodigo, int nro, int complejidad, int total, int campos, int listados, int botones) {
		this.casosdeUsosCodigo = casosdeUsosCodigo;
		this.nro = nro;
		this.complejidad = complejidad;
		this.total = total;
		this.campos = campos;
		this.listados = listados;
		this.botones = botones;
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

	@Column(name = "Campos", nullable = false)
	public int getCampos() {
		return this.campos;
	}

	public void setCampos(int campos) {
		this.campos = campos;
	}

	@Column(name = "Listados", nullable = false)
	public int getListados() {
		return this.listados;
	}

	public void setListados(int listados) {
		this.listados = listados;
	}

	@Column(name = "Botones", nullable = false)
	public int getBotones() {
		return this.botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

}
