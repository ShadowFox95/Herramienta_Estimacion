package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.becarios.proyecto_definitivo.dao.factores_ajustes.ArquitecturaReferenciaDao;
import com.becarios.proyecto_definitivo.dao.factores_ajustes.FactoresAmbientalDao;
import com.becarios.proyecto_definitivo.dao.factores_ajustes.FactoresTecnicaDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

public class FactoresAjusteServiceImpl implements FactoresAjusteService {

    // @Autowired
    // FactorAjusteDao factoresAjusteDao;
    @Autowired
    ArquitecturaReferenciaDao arquitecturaReferenciaDao;
    @Autowired
    FactoresAmbientalDao factoresAmbientalDao;
    @Autowired
    FactoresTecnicaDao factoresTecnicaDao;

    @Override
    public List<FactorAjuste> findFactoresAjusteById(int id) {
        // return factoresAjusteDao.getAllFactoresAjuste(id);
        return null;
    }

    @Override
    public List<FactorComplejidadAmbiental> findFactoresComplejidadAmbientalById(int id) {
        return factoresAmbientalDao.findAllFactAmb(id);
    }

    @Override
    public List<FactorComplejidadTecnica> findFactoresComplejidadTecnicaById(int id) {
        return factoresTecnicaDao.findAllFacTec(id);
    }

    @Override
    public List<ArquitecturaReferencia> findArquitecturaReferenciaById(int id) {
        return arquitecturaReferenciaDao.findAllArqRef(id);
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof FactorAjuste) {
            // factoresAjusteDao.saveFactoresAjuste((FactorAjuste) row);

        } else if (row instanceof FactorComplejidadAmbiental) {
            factoresAmbientalDao.saveFacAmb((FactorComplejidadAmbiental) row);

        } else if (row instanceof FactorComplejidadTecnica) {
            factoresTecnicaDao.saveFacTec((FactorComplejidadTecnica) row);

        } else if (row instanceof ArquitecturaReferencia) {
            arquitecturaReferenciaDao.saveArqRef((ArquitecturaReferencia) row);

        }
        return false;
    }

}
