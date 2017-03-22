package com.becarios.proyecto_definitivo.model.factores_ajustes;
// Generated 22-mar-2017 16:09:41 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FactorComplejidadAmbiental generated by hbm2java
 */
@Entity
@Table(name = "factor_complejidad_ambiental", catalog = "HE")
public class FactorComplejidadAmbiental implements java.io.Serializable {

	private int idProyecto;
	private String nombre;
	private int valoracion;
	private int factorCalculado;

	public FactorComplejidadAmbiental() {
	}

	public FactorComplejidadAmbiental(int idProyecto, String nombre, int valoracion, int factorCalculado) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.valoracion = valoracion;
		this.factorCalculado = factorCalculado;
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

	@Column(name = "Valoracion", nullable = false)
	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Column(name = "factorCalculado", nullable = false)
	public int getFactorCalculado() {
		return this.factorCalculado;
	}

	public void setFactorCalculado(int factorCalculado) {
		this.factorCalculado = factorCalculado;
	}

}
