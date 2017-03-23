package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;

public interface ModuleDao {

    CasosDeUso findByCode(int Id);

    void saveModule(CasosDeUso modulo);

    void deleteModuleByCode(int idModulo);

    List<CasosDeUso> findAllModules(int id);

    ArrayList<Object> FindAllTablas(int idModulo);
}
