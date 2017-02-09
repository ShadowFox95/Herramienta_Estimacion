package com.becarios.proyecto_definitivo.model;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.attributes.CUOriginal;
import com.becarios.proyecto_definitivo.model.attributes.Integracion;
import com.becarios.proyecto_definitivo.model.attributes.Negocio;
import com.becarios.proyecto_definitivo.model.attributes.Perfiles;
import com.becarios.proyecto_definitivo.model.attributes.Persistencia;
import com.becarios.proyecto_definitivo.model.attributes.Vista;

public class Proyecto {

    private String nombre;
    private int codigo;
    private String descripcion;
    private boolean editado = false;
    List<Modulo> rows = new ArrayList<Modulo>();

    public Proyecto() {

    }

    public Proyecto(String nombre, int codigo, String descripcion) {
        this.setNombre(nombre);
        this.codigo = codigo;
        this.setDescripcion(descripcion);
    }

    public void crearModulo() {
        // Crea array de tablas
        List<Tabla> tablas = new ArrayList<Tabla>();
        tablas.add(new Perfiles());
        tablas.add(new Vista());
        tablas.add(new Negocio());
        tablas.add(new Persistencia());
        tablas.add(new CUOriginal());
        tablas.add(new Integracion());

        int code;
        if (rows.isEmpty()) {
            code = -1;
        } else {
            try {
                code = Integer.parseInt(rows.get(rows.size() - 1).getCode().split("-")[1]);
            } catch (IndexOutOfBoundsException ie) {
                code = -1;
            } catch (NumberFormatException ne) {
                code = -1;
            }
        }

        Modulo m = new Modulo();

        m.setName("Nombre Default");
        m.setCode("Codigo-" + (code + 1));
        m.setCaseOfUse("Caso Default");
        m.setTotal(5);
        m.setDefaultTablas();

        rows.add(m);
    }

    public ArrayList<Modulo> getRows() {
        return (ArrayList<Modulo>) rows;
    }

    public void setRows(List<Modulo> rows) {
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
        Modulo row = null;
        for (int i = 0; i < rows.size(); i++) {

            if (code.equals(rows.get(i).getCode())) {

                row = rows.get(i);
                List<Tabla> tablas = row.getTablas();

                for (int j = 0; j < tablas.size(); j++) {

                    if (tablas.get(j) instanceof Perfiles) {
                        Perfiles t = (Perfiles) tablas.get(j);
                        t.setTotal(perfilesTotal);
                        t.setNro(perfilesNro);
                        t.setComplejidad(perfilesComplejidad);
                        row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Vista) {
                        Vista t = (Vista) tablas.get(j);
                        t.setTotal(vistaTotal);
                        t.setNro(vistaNro);
                        t.setCampos(vistaCampos);
                        t.setComplejidad(vistaComplejidad);
                        t.setListados(vistaListados);
                        t.setBotones(vistaBotones);
                        row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Negocio) {
                        Negocio t = (Negocio) tablas.get(j);
                        t.setTotal(negocioTotal);
                        t.setNro(negocioNro);
                        t.setLogica(negocioLogica);
                        row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Persistencia) {
                        Persistencia t = (Persistencia) tablas.get(j);
                        t.setTotal(persistenciaTotal);
                        t.setNro(persistenciaNro);
                        t.setAccesos(persistenciaAccesos);
                        row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof CUOriginal) {
                        CUOriginal t = (CUOriginal) tablas.get(j);
                        t.setTotal(cuTotal);
                        t.setDificultad(cuDificultad);
                        row.getTablas().set(j, t);

                    } else if (tablas.get(j) instanceof Integracion) {
                        Integracion t = (Integracion) tablas.get(j);
                        t.setTotal(integracionTotal);
                        t.setNro(integracionNro);
                        t.setComplejidad(integracionComplejidad);
                        row.getTablas().set(j, t);
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
            if (code.equals(rows.get(i).getCode())) {
                rows.get(i).setTotal(total);
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
