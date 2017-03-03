package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajuste.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactorComplejidadTecnica;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactoresAjuste;

public interface FactoresAjusteService {

    List<FactoresAjuste> findFactoresAjusteById(int id);

    List<FactorComplejidadAmbiental> findFactoresComplejidadAmbientalById(int id);

    List<FactorComplejidadTecnica> findFactoresComplejidadTecnicaById(int id);

    List<ArquitecturaReferencia> findArquitecturaReferenciaById(int id);

    boolean save(Object row);
}
