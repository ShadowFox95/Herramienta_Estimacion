package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;
import com.becarios.proyecto_definitivo.model.criterios.Tabla;

public interface ModuleDao {

    Modulo findByCode(int idModulo);

    void saveModule(Modulo modulo);

    void deleteModuleByCode(int idModulo);

    List<Modulo> findAllModules(int id);

    ArrayList<Tabla> FindAllTablas(int idModulo);
}
