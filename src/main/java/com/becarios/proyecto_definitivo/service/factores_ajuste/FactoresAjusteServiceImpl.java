package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;



public class FactoresAjusteServiceImpl implements FactoresAjusteService {

     @Autowired
     FactorAjusteDao dao;

    @Override
    public List<FactorAjuste> findFactoresAjusteById(int id) {
        // dao.getAllFactoresAjuste(id);
        return null;
    }

    @Override
    public List<FactorComplejidadAmbiental> findFactoresComplejidadAmbientalById(int id) {
        // dao.getAllFactorComplejidadAmbiental(id);
        return null;
    }

    @Override
    public List<FactorComplejidadTecnica> findFactoresComplejidadTecnicaById(int id) {
        // dao.getAllFactorComplejidadTecnica(id);
        return null;
    }

    @Override
    public List<ArquitecturaReferencia> findArquitecturaReferenciaById(int id) {
        return dao.getAllArquitecturaReferencia(id);
        
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof FactorAjuste) {
            // dao.saveFactoresAjuste(row);
        } else if (row instanceof FactorComplejidadAmbiental) {
            // dao.saveFactorComplejidadAmbiental(row);
        } else if (row instanceof FactorComplejidadTecnica) {
            // dao.saveFactorComplejidadTecnica(row);
        } else if (row instanceof ArquitecturaReferencia) {
            // dao.saveArquitecturaReferencia(row);
        }
        return false;
    }

}
