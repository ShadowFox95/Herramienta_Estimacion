package com.becarios.proyecto_definitivo.dto;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.model.criterios.Cuoriginal;
import com.becarios.proyecto_definitivo.model.criterios.Integracion;
import com.becarios.proyecto_definitivo.model.criterios.Negocio;
import com.becarios.proyecto_definitivo.model.criterios.Perfiles;
import com.becarios.proyecto_definitivo.model.criterios.Persistencia;
import com.becarios.proyecto_definitivo.model.criterios.Vista;

public class ProyectoDto {

    private String nombre;
    private int codigo;
    private String descripcion;
    private boolean editado = false;
    List<CasosDeUso> rows = new ArrayList<CasosDeUso>();

    public ProyectoDto() {

    }

    public ProyectoDto(String nombre, int codigo, String descripcion) {
        this.setNombre(nombre);
        this.codigo = codigo;
        this.setDescripcion(descripcion);
    }

    public void crearModulo() {
        // Crea array de tablas
        List<Object> tablas = new ArrayList<Object>();
        tablas.add(new Perfiles());
        tablas.add(new Vista());
        tablas.add(new Negocio());
        tablas.add(new Persistencia());
        tablas.add(new Cuoriginal());
        tablas.add(new Integracion());

        int code;
        if (rows.isEmpty()) {
            code = -1;
        } else {
            try {
                code = Integer.parseInt(rows.get(rows.size() - 1).getCodigo().split("-")[1]);
            } catch (IndexOutOfBoundsException ie) {
                code = -1;
            } catch (NumberFormatException ne) {
                code = -1;
            }
        }

        CasosDeUso m = new CasosDeUso();

        m.setNombre("Nombre Default");
        m.setCodigo("Codigo-" + (code + 1));
        m.setModulo("Caso Default");
        m.setTotalFila(5);

        rows.add(m);
    }

    public ArrayList<CasosDeUso> getRows() {
        return (ArrayList<CasosDeUso>) rows;
    }

    public void setRows(List<CasosDeUso> rows) {
        this.rows = rows;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isEditado() {
        return editado;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }

    public boolean GuardarDatos(String code, int perfilesTotal, int perfilesNro, int perfilesComplejidad,
            int vistaTotal, int vistaNro, int vistaCampos, int vistaComplejidad, int vistaListados, int vistaBotones,
            int negocioTotal, int negocioNro, int negocioLogica, int persistenciaTotal, int persistenciaNro,
            int persistenciaAccesos, int cuTotal, int cuDificultad, int integracionTotal, int integracionNro,
            int integracionComplejidad) {
        CasosDeUso row = null;
        for (int i = 0; i < rows.size(); i++) {

            if (code.equals(rows.get(i).getCodigo())) {

                row = rows.get(i);
                List<Object> tablas = null;

                for (int j = 0; j < tablas.size(); j++) {

                    if (tablas.get(j) instanceof Perfiles) {
                        Perfiles t = (Perfiles) tablas.get(j);
                        t.setTotal(perfilesTotal);
                        t.setNro(perfilesNro);
                        t.setComplejidad(perfilesComplejidad);
                        // row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Vista) {
                        Vista t = (Vista) tablas.get(j);
                        t.setTotal(vistaTotal);
                        t.setNro(vistaNro);
                        t.setCampos(vistaCampos);
                        t.setComplejidad(vistaComplejidad);
                        t.setListados(vistaListados);
                        t.setBotones(vistaBotones);
                        // row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Negocio) {
                        Negocio t = (Negocio) tablas.get(j);
                        t.setTotal(negocioTotal);
                        t.setNro(negocioNro);
                        t.setLogica(negocioLogica);
                        // row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Persistencia) {
                        Persistencia t = (Persistencia) tablas.get(j);
                        t.setTotal(persistenciaTotal);
                        t.setNro(persistenciaNro);
                        t.setAccesos(persistenciaAccesos);
                        // row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Cuoriginal) {
                        Cuoriginal t = (Cuoriginal) tablas.get(j);
                        t.setTotal(cuTotal);
                        t.setComplejidad(cuDificultad);
                        // row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Integracion) {
                        Integracion t = (Integracion) tablas.get(j);
                        t.setTotal(integracionTotal);
                        t.setNro(integracionNro);
                        t.setComplejidad(integracionComplejidad);
                        // row.getTablas().set(j, t);
                    }
                }
                rows.set(i, row);
            }
        }
        return true;
    }

    public void CalcularTotal(String code, int perfilesTotal, int vistaTotal, int negocioTotal, int persistenciaTotal,
            int cuTotal, int integracionTotal) {
        float total;
        if (!editado) {
            total = (float) ((perfilesTotal + vistaTotal + negocioTotal + persistenciaTotal) / 7);
        } else {
            total = (float) ((perfilesTotal + vistaTotal + negocioTotal + persistenciaTotal) * 0.8 / 7
                    + integracionTotal * 0.2);
        }
        for (int i = 0; i < rows.size(); i++) {
            if (code.equals(rows.get(i).getCodigo())) {
                rows.get(i).setTotalFila(total);
            }

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
