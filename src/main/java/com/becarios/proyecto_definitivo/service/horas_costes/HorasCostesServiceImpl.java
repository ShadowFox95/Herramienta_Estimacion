package com.becarios.proyecto_definitivo.service.horas_costes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;

public class HorasCostesServiceImpl implements HorasCostesService {

    // @Autowired
    // HorasCostesDao dao;

    @Override
    public List<Delivery> findDeliveryById(int id) {
        // dao.getAllDelivery(id);
        return null;
    }

    @Override
    public List<Deliveryexterno> findDeliveryExternoById(int id) {
        // dao.getAllDeliveryexterno(id);
        return null;
    }

    @Override
    public List<Gestion> findGestionById(int id) {
        // dao.getAllGestion(id);
        return null;
    }

    @Override
    public List<Gestionexterno> findGestionExternoById(int id) {
        // dao.getAllGestionexterno(id);
        return null;
    }

    @Override
    public List<Gobierno> findGobiernoById(int id) {
        // dao.getAllGobierno(id);
        return null;
    }

    @Override
    public List<Gobiernoexterno> findGobietnoExternoById(int id) {
        // dao.getAllGobiernoexterno(id);
        return null;
    }

    @Override
    public List<Riesgo> findRiesgoById(int id) {
        // dao.getAllRiesgo(id);
        return null;
    }

    @Override
    public List<Valoracionfinal> findValoracionFinalById(int id) {
        // dao.getAllValoracinofinal(id);
        return null;
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof Delivery) {
            // dao.saveDelivery(row)
        } else if (row instanceof Deliveryexterno) {
            // dao.saveDeliveryexterno(row)
        } else if (row instanceof Gestion) {
            // dao.saveGestion(row)
        } else if (row instanceof Gestionexterno) {
            // dao.saveGestionexterno(row)
        } else if (row instanceof Gobierno) {
            // dao.saveGobierno(row)
        } else if (row instanceof Gobiernoexterno) {
            // dao.saveGobiernoexterno(row)
        } else if (row instanceof Riesgo) {
            // dao.saveRiesgo(row)
        } else if (row instanceof Valoracionfinal) {
            // dao.saveValoracinofinal(row)
        }
        return false;
    }

}
