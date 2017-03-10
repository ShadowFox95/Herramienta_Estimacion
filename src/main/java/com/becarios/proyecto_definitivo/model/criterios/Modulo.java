package com.becarios.proyecto_definitivo.model.criterios;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CASOS_DE_USO", schema = "USUARI",catalog = "HE", uniqueConstraints = @UniqueConstraint(columnNames = "IdProyecto"))
public class Modulo implements Serializable {
	private Integer id;
	private String codigo;
	private int totalFila;
	private String nombre;
	private String modulo;
	private int idProyecto;

	public Modulo() {
	}

	public Modulo(String codigo, int totalFila, String nombre, String modulo, int idProyecto) {
		this.codigo = codigo;
		this.totalFila = totalFila;
		this.nombre = nombre;
		this.modulo = modulo;
		this.idProyecto = idProyecto;
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

	@Column(name = "Codigo", nullable = false, length = 45)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "TotalFila", nullable = false)
	public int getTotalFila() {
		return this.totalFila;
	}

	public void setTotalFila(int totalFila) {
		this.totalFila = totalFila;
	}

	@Column(name = "Nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Modulo", nullable = false, length = 45)
	public String getModulo() {
		return this.modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	@Column(name = "IdProyecto", unique = true, nullable = false)
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

}
