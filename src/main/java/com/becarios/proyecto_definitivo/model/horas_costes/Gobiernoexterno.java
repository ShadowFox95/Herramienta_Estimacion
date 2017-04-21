package com.becarios.proyecto_definitivo.model.horas_costes;
// Generated 19-abr-2017 17:37:47 by Hibernate Tools 5.2.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Gobiernoexterno generated by hbm2java
 */
@Entity
@Table(name = "gobiernoexterno", catalog = "HE")
public class Gobiernoexterno implements java.io.Serializable {

	private GobiernoexternoId id;
	private int porcentaje;
	private int horas;
	private int coste;

	public Gobiernoexterno() {
	}

	public Gobiernoexterno(GobiernoexternoId id, int porcentaje, int horas, int coste) {
		this.id = id;
		this.porcentaje = porcentaje;
		this.horas = horas;
		this.coste = coste;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idProyecto", column = @Column(name = "idProyecto", nullable = false)),
			@AttributeOverride(name = "nombre", column = @Column(name = "Nombre", nullable = false, length = 45)) })
	public GobiernoexternoId getId() {
		return this.id;
	}

	public void setId(GobiernoexternoId id) {
		this.id = id;
	}

	@Column(name = "Porcentaje", nullable = false)
	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
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
