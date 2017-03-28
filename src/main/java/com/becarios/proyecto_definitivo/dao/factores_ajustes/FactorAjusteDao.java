package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;

public interface FactorAjusteDao {
	

	FactorAjuste findByCodeFacAjus(int ID);

    void saveFacAjus(FactorAjuste  factor);

    void deleteFacAjusByCode(int id);

    List<FactorAjuste> findAllFacAjus(int idProyecto);
    

}
