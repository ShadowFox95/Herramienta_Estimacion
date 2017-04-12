package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

public interface FactoresAjusteService {

    List<FactorAjuste> findFactoresAjusteById(int id);

    List<FactorComplejidadAmbiental> findFactoresComplejidadAmbientalById(int id);

    List<FactorComplejidadTecnica> findFactoresComplejidadTecnicaById(int id);

    List<ArquitecturaReferencia> findArquitecturaReferenciaById(int id);

    boolean save(Object row);

    void saveFactorAjuste(FactorAjuste f);
}
