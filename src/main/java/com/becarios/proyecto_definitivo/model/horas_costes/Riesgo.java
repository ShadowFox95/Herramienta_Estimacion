package com.becarios.proyecto_definitivo.model.horas_costes;
// Generated 19-abr-2017 17:37:47 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Riesgo generated by hbm2java
 */
@Entity
@Table(name = "riesgo", catalog = "HE")
public class Riesgo implements java.io.Serializable {

	private int idProyecto;
	private String nombre;
	private int num;

	public Riesgo() {
	}

	public Riesgo(int idProyecto, String nombre, int num) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.num = num;
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

	@Column(name = "Num", nullable = false)
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
