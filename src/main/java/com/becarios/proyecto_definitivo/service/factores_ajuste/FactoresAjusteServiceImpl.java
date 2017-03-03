package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajuste.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactorComplejidadTecnica;
import com.becarios.proyecto_definitivo.model.factores_ajuste.FactoresAjuste;

public class FactoresAjusteServiceImpl implements FactoresAjusteService {

    // @Autowired
    // FactoresAjusteDao dao;

    @Override
    public List<FactoresAjuste> findFactoresAjusteById(int id) {
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
        // dao.getAllArquitecturaReferencia(id);
        return null;
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof FactoresAjuste) {
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
