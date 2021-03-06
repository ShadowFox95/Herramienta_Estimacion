package com.becarios.proyecto_definitivo.model;
// default package
// Generated 04-abr-2017 16:50:21 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Proyecto generated by hbm2java
 */
@Entity
@Table(name = "proyecto", catalog = "HE")
public class Proyecto implements java.io.Serializable {

	private Integer id;
	private String descripcion;
	private String codigoProyecto;
	private String nombre;
	private boolean isEditado;

	public Proyecto() {
	}

	public Proyecto(String codigoProyecto, String nombre, boolean isEditado) {
		this.codigoProyecto = codigoProyecto;
		this.nombre = nombre;
		this.isEditado = isEditado;
	}

	public Proyecto(String descripcion, String codigoProyecto, String nombre, boolean isEditado) {
		this.descripcion = descripcion;
		this.codigoProyecto = codigoProyecto;
		this.nombre = nombre;
		this.isEditado = isEditado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Descripcion", length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "CodigoProyecto", nullable = false, length = 45)
	public String getCodigoProyecto() {
		return this.codigoProyecto;
	}

	public void setCodigoProyecto(String codigoProyecto) {
		this.codigoProyecto = codigoProyecto;
	}

	@Column(name = "Nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "IsEditado", nullable = false)
	public boolean isIsEditado() {
		return this.isEditado;
	}

	public void setIsEditado(boolean isEditado) {
		this.isEditado = isEditado;
	}

}
