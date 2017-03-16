package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;
import com.becarios.proyecto_definitivo.model.criterios.Tabla;

public interface ModuleDao {

    Modulo findByCode(String code);

    void saveModule(Modulo modulo);

    void deleteModuleByCode(String code);

    List<Modulo> findAllModules();

    ArrayList<Tabla> FindAllTablas(String code);
}
