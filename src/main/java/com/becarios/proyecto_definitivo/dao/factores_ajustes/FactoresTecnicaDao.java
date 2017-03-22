package com.becarios.proyecto_definitivo.dao.factores_ajustes;
import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;


public interface FactoresTecnicaDao {

    FactorComplejidadTecnica findByCodeFacTec(int ID);

    void saveFacTec(FactorComplejidadTecnica  factor);

    void deleteFacTecByCode(int id);

    List<FactorComplejidadTecnica> findAllFacTec(int idProyecto);

}
