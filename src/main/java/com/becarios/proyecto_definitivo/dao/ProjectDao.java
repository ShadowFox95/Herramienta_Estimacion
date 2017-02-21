package com.becarios.proyecto_definitivo.dao;

import java.util.List;

import com.becarios.proyecto_definitivo.model.Proyecto;

public interface ProjectDao {

    Proyecto findByCode(String code);

    void saveProject(Proyecto proyecto);

    void deleteProjectByCode(String code);

    List<Proyecto> findAllProjects();

}
