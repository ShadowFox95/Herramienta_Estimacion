package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

public interface FactoresAmbientalDao {

    FactorComplejidadAmbiental findByCodeFacAmb(int ID);

    void saveFacAmb(FactorComplejidadAmbiental  factor);

    void deleteFacAmbByCode(int id);

    List<FactorComplejidadAmbiental> findAllFactAmb(int idProyecto);
	
}
