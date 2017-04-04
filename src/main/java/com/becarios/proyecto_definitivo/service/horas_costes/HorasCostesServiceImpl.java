package com.becarios.proyecto_definitivo.service.horas_costes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.horas_ajustes.HorasCostesDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;

@Service("HorasCostesService")
@Transactional
public class HorasCostesServiceImpl implements HorasCostesService {

    @Autowired
    HorasCostesDao dao;

    @Override
    public List<Delivery> findDeliveryById(int id) {
        return dao.findAllDeliv(id);

    }

    @Override
    public List<Deliveryexterno> findDeliveryExternoById(int id) {
        return dao.findAllDelivext(id);

    }

    @Override
    public List<Gestion> findGestionById(int id) {
        return dao.findAllGest(id);

    }

    @Override
    public List<Gestionexterno> findGestionExternoById(int id) {
        return dao.findAllGestext(id);

    }

    @Override
    public List<Gobierno> findGobiernoById(int id) {
        return dao.findAllGob(id);

    }

    @Override
    public List<Gobiernoexterno> findGobiernoExternoById(int id) {
        return dao.findAllGobext(id);
    }

    @Override
    public List<Riesgo> findRiesgoById(int id) {
        return dao.findAllRiesg(id);

    }

    @Override
    public List<Valoracionfinal> findValoracionFinalById(int id) {
        return dao.findAllValofin(id);

    }

    @Override
    public boolean save(Object row) {
        if (row instanceof Delivery) {
            dao.saveDeliv((Delivery) row);
        } else if (row instanceof Deliveryexterno) {
            dao.saveDelivext((Deliveryexterno) row);
        } else if (row instanceof Gestion) {
            dao.saveGest((Gestion) row);
        } else if (row instanceof Gestionexterno) {
            dao.saveGestext((Gestionexterno) row);
        } else if (row instanceof Gobierno) {
            dao.saveGob((Gobierno) row);
        } else if (row instanceof Gobiernoexterno) {
            dao.saveGobext((Gobiernoexterno) row);
        } else if (row instanceof Riesgo) {
            dao.saveRiesg((Riesgo) row);
        } else if (row instanceof Valoracionfinal) {
            dao.saveValofin((Valoracionfinal) row);
        }
        return false;
    }

}
