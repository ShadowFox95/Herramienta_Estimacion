package com.becarios.proyecto_definitivo.model.factores_ajustes;
// Generated 20-mar-2017 16:23:01 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FactorComplejidadTecnica generated by hbm2java
 */
@Entity
@Table(name = "factor_complejidad_tecnica", catalog = "HE")
public class FactorComplejidadTecnica implements java.io.Serializable {

	private int idProyecto;
	private String nombre;
	private boolean aplica;
	private int gradoDefinicion;
	private int gradoExigencia;
	private int impacto;
	private int riesgo;

	public FactorComplejidadTecnica() {
	}

	public FactorComplejidadTecnica(int idProyecto, String nombre, boolean aplica, int gradoDefinicion,
			int gradoExigencia, int impacto, int riesgo) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.aplica = aplica;
		this.gradoDefinicion = gradoDefinicion;
		this.gradoExigencia = gradoExigencia;
		this.impacto = impacto;
		this.riesgo = riesgo;
	}

	@Id

	@Column(name = "idProyecto", unique = true, nullable = false)
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	@Column(name = "Nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Aplica", nullable = false)
	public boolean isAplica() {
		return this.aplica;
	}

	public void setAplica(boolean aplica) {
		this.aplica = aplica;
	}

	@Column(name = "gradoDefinicion", nullable = false)
	public int getGradoDefinicion() {
		return this.gradoDefinicion;
	}

	public void setGradoDefinicion(int gradoDefinicion) {
		this.gradoDefinicion = gradoDefinicion;
	}

	@Column(name = "gradoExigencia", nullable = false)
	public int getGradoExigencia() {
		return this.gradoExigencia;
	}

	public void setGradoExigencia(int gradoExigencia) {
		this.gradoExigencia = gradoExigencia;
	}

	@Column(name = "Impacto", nullable = false)
	public int getImpacto() {
		return this.impacto;
	}

	public void setImpacto(int impacto) {
		this.impacto = impacto;
	}

	@Column(name = "Riesgo", nullable = false)
	public int getRiesgo() {
		return this.riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}

}
