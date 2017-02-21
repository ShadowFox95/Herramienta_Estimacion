package com.becarios.proyecto_definitivo.service;

import java.util.List;

import com.becarios.proyecto_definitivo.model.Proyecto;

public interface ProjectService {

    Proyecto findByCode(String code);

    void saveProject(Proyecto proyecto);

    void updateProject(Proyecto proyecto);

    void deleteProjectByCode(String code);

    List<Proyecto> findAllProjects();

    boolean isProjectCodeUnique(String code);

    boolean AddProject(String nombre, String codigo, String descripcion, boolean editado);
}
