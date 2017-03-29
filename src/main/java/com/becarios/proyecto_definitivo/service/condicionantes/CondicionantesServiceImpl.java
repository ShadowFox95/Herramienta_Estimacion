package com.becarios.proyecto_definitivo.service.condicionantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.condicionantes.CondicionantesDao;
import com.becarios.proyecto_definitivo.model.condicionantes.Condicionantes;

@Service("condicionantesService")
@Transactional
public class CondicionantesServiceImpl implements CondicionantesService {
    @Autowired
    private CondicionantesDao dao;

    @Override
    public List<Condicionantes> findAllCondicionantes(int idProyecto) {
        return dao.findAllCondi(idProyecto);
    }

    @Override
    public boolean addCondicionantes(Condicionantes condicionante) {
        dao.saveCondi(condicionante);
        return true;
    }

    @Override
    public boolean deleteCondicionantes(int id) {
        dao.deleteCondiByCode(id);
        return true;
    }
}
