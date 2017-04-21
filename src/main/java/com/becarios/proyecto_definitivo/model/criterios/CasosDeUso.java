package com.becarios.proyecto_definitivo.model.criterios;
// Generated 19-abr-2017 17:37:47 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CasosDeUso generated by hbm2java
 */
@Entity
@Table(name = "casos_de_uso", catalog = "HE")
public class CasosDeUso implements java.io.Serializable {

	private Integer id;
	private String codigo;
	private double totalFila;
	private String nombre;
	private String modulo;
	private int idProyecto;

	public CasosDeUso() {
	}

	public CasosDeUso(String codigo, double totalFila, String nombre, String modulo, int idProyecto) {
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

	@Column(name = "TotalFila", nullable = false, precision = 22, scale = 0)
	public double getTotalFila() {
		return this.totalFila;
	}

	public void setTotalFila(double totalFila) {
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

	@Column(name = "IdProyecto", nullable = false)
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

}
