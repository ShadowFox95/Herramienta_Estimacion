package com.becarios.proyecto_definitivo.service.piramide;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.Piramide.PiramideDao;
import com.becarios.proyecto_definitivo.dao.factores_ajustes.FactorAjusteDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.piramide.Piramide;

@Service("piramidesService")
@Transactional
public class PiramideServiceImpl implements PiramideService {

	@Autowired
    private PiramideDao dao;


    @Override
    public List<Piramide> findAllById(int id) {
        return PiramideDao.findAllPiramid(id);
    }

    @Override
    boolean void savePiramide(Piramide pira) {
        PiramideDao.savePiram(pira);
        return true;
    }

}
