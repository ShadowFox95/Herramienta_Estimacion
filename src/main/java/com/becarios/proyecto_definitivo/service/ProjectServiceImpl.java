package com.becarios.proyecto_definitivo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.ProjectDao;
import com.becarios.proyecto_definitivo.model.Proyecto;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao dao;

    @Override
    public Proyecto findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public void saveProject(Proyecto proyecto) {
        dao.saveProject(proyecto);

    }

    @Override
    public void updateProject(Proyecto proyecto) {
        Proyecto entity = dao.findByCode(proyecto.getCodigo());
        if (entity != null) {
            entity.setNombre(proyecto.getNombre());
            entity.setDescripcion(proyecto.getDescripcion());
            entity.setEditado(proyecto.isEditado());
            entity.setRows(proyecto.loadRows());
        }

    }

    @Override
    public void deleteProjectByCode(String code) {
        dao.deleteProjectByCode(code);

    }

    @Override
    public List<Proyecto> findAllProjects() {
        return dao.findAllProjects();
    }

    @Override
    public boolean isProjectCodeUnique(String code) {
        Proyecto proyecto = findByCode(code);
        return (proyecto == null || ((proyecto.getCodigo() == code)));
    }

    @Override
    public boolean AddProject(String nombre, String codigo, String descripcion, boolean editado) {
        Proyecto proyecto = new Proyecto();
        proyecto.setCodigo(codigo);
        proyecto.setNombre(nombre);
        proyecto.setDescripcion(descripcion);
        proyecto.setEditado(editado);
        return false;
    }

}
