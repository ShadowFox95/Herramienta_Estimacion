package com.becarios.proyecto_definitivo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;

@Entity
@Table(name = "PROYECTO", schema = "USUARI")
public class Proyecto implements Serializable {

    private static final long serialVersionUID = -8546637619367339050L;

    private String codigo;
    private String nombre;
    private String descripcion;

    private boolean editado = false;
    List<Modulo> rows = new ArrayList<Modulo>();

    public Proyecto() {

    }

    public Proyecto(String nombre, String codigo, String descripcion) {
        this.setNombre(nombre);
        this.codigo = codigo;
        this.setDescripcion(descripcion);
    }

    public ArrayList<Modulo> loadRows() {
        return (ArrayList<Modulo>) rows;
    }

    public void setRows(List<Modulo> rows) {
        this.rows = rows;
    }

    @Id
    @Column(name = "IdProyecto", precision = 0, scale = 0, unique = true, nullable = false)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name = "IsEditado", nullable = false)
    public boolean isEditado() {
        return editado;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }

    @Column(name = "NOMBRE", length = 40, nullable = false)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "DESCRIPCION", length = 200)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
