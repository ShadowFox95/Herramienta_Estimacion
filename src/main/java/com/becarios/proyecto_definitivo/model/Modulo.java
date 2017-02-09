package com.becarios.proyecto_definitivo.model;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.attributes.CUOriginal;
import com.becarios.proyecto_definitivo.model.attributes.Integracion;
import com.becarios.proyecto_definitivo.model.attributes.Negocio;
import com.becarios.proyecto_definitivo.model.attributes.Perfiles;
import com.becarios.proyecto_definitivo.model.attributes.Persistencia;
import com.becarios.proyecto_definitivo.model.attributes.Vista;

public class Modulo {
    private String name;
    private String code;
    private String caseOfUse;
    private int total;

    List<Tabla> tablas = new ArrayList<Tabla>();

    public Modulo(String code, List<Tabla> tablas) {
        this.code = code;
        this.tablas = tablas;
        name = "";
        caseOfUse = "";
        total = 0;

    }

    public Modulo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCaseOfUse() {
        return caseOfUse;
    }

    public void setCaseOfUse(String caseOfUse) {
        this.caseOfUse = caseOfUse;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = (int) total;
    }

    public List<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(List<Tabla> tablas) {
        this.tablas = tablas;
    }

    public void setDefaultTablas() {
        tablas.add(new Perfiles());
        tablas.add(new Vista());
        tablas.add(new Negocio());
        tablas.add(new Persistencia());
        tablas.add(new CUOriginal());
        tablas.add(new Integracion());

    }

    public void apply(String code, String name, String caseOfUse) {
        this.code = code;
        this.caseOfUse = caseOfUse;
        this.name = name;

    }

    /*
     * public String rowConstructor() { String row = "<tr><td>" + name +
     * "</td><td>" + code + "</td><td>" + caseOfUse + "</td><td>5</td><td>" +
     * valoration + "</td></tr>"; return row; }
     */

}
