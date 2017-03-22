package com.becarios.proyecto_definitivo.model.horas_costes;
// Generated 22-mar-2017 16:09:41 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Gestion generated by hbm2java
 */
@Entity
@Table(name = "gestion", catalog = "HE")
public class Gestion implements java.io.Serializable {

	private int idProyecto;
	private String nombre;
	private int nivel;
	private int porcentaje;
	private boolean internaPractica;
	private int horas;
	private int coste;

	public Gestion() {
	}

	public Gestion(int idProyecto, String nombre, int nivel, int porcentaje, boolean internaPractica, int horas,
			int coste) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.nivel = nivel;
		this.porcentaje = porcentaje;
		this.internaPractica = internaPractica;
		this.horas = horas;
		this.coste = coste;
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

	@Column(name = "Nivel", nullable = false)
	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Column(name = "Porcentaje", nullable = false)
	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "internaPractica", nullable = false)
	public boolean isInternaPractica() {
		return this.internaPractica;
	}

	public void setInternaPractica(boolean internaPractica) {
		this.internaPractica = internaPractica;
	}

	@Column(name = "Horas", nullable = false)
	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Column(name = "Coste", nullable = false)
	public int getCoste() {
		return this.coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

}
