package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;


public interface FactorAjusteDao {
	FactorAjuste findByCodeFacAjust(int id);

    void saveFacAjust(FactorAjuste  factor);

    void deleteFacAjustByCode(int id);

    List<FactorAjuste> findAllFacAjust(int idProyecto);

}
