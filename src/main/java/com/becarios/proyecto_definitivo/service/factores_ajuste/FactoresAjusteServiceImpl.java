package com.becarios.proyecto_definitivo.service.factores_ajuste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.factores_ajustes.FactorAjusteDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

@Service("factoresAjusteService")
@Transactional
public class FactoresAjusteServiceImpl implements FactoresAjusteService {

    @Autowired
    private FactorAjusteDao factoresAjusteDao;

    @Override
    public List<FactorAjuste> findFactoresAjusteById(int id) {
        return factoresAjusteDao.findAllFacAjus(id);

    }

    @Override
    public List<FactorComplejidadAmbiental> findFactoresComplejidadAmbientalById(int id) {
        return factoresAjusteDao.findAllFactAmb(id);
    }

    @Override
    public List<FactorComplejidadTecnica> findFactoresComplejidadTecnicaById(int id) {
        return factoresAjusteDao.findAllFacTec(id);
    }

    @Override
    public List<ArquitecturaReferencia> findArquitecturaReferenciaById(int id) {
        return factoresAjusteDao.findAllArqRef(id);
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof FactorAjuste) {
            // factoresAjusteDao.saveFactoresAjuste((FactorAjuste) row);

        } else if (row instanceof FactorComplejidadAmbiental) {
            factoresAjusteDao.saveFacAmb((FactorComplejidadAmbiental) row);

        } else if (row instanceof FactorComplejidadTecnica) {
            factoresAjusteDao.saveFacTec((FactorComplejidadTecnica) row);

        } else if (row instanceof ArquitecturaReferencia) {
            factoresAjusteDao.saveArqRef((ArquitecturaReferencia) row);

        }
        return false;
    }

    @Override
    public void saveFactorAjuste(FactorAjuste f) {
        factoresAjusteDao.saveFacAjus(f);
    }

}
