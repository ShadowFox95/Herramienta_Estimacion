package com.becarios.proyecto_definitivo.service.horas_costes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.DeliveryExterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.GestionExterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.GobiernoExterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.ValoracionFinal;

public class HorasCostesServiceImpl implements HorasCostesService {

    // @Autowired
    // HorasCostesDao dao;

    @Override
    public List<Delivery> findDeliveryById(int id) {
        // dao.getAllDelivery(id);
        return null;
    }

    @Override
    public List<DeliveryExterno> findDeliveryExternoById(int id) {
        // dao.getAllDeliveryExterno(id);
        return null;
    }

    @Override
    public List<Gestion> findGestionById(int id) {
        // dao.getAllGestion(id);
        return null;
    }

    @Override
    public List<GestionExterno> findGestionExternoById(int id) {
        // dao.getAllGestionExterno(id);
        return null;
    }

    @Override
    public List<Gobierno> findGobiernoById(int id) {
        // dao.getAllGobierno(id);
        return null;
    }

    @Override
    public List<GobiernoExterno> findGobietnoExternoById(int id) {
        // dao.getAllGobiernoExterno(id);
        return null;
    }

    @Override
    public List<Riesgo> findRiesgoById(int id) {
        // dao.getAllRiesgo(id);
        return null;
    }

    @Override
    public List<ValoracionFinal> findValoracionFinalById(int id) {
        // dao.getAllValoracinoFinal(id);
        return null;
    }

    @Override
    public boolean save(Object row) {
        if (row instanceof Delivery) {
            // dao.saveDelivery(row)
        } else if (row instanceof DeliveryExterno) {
            // dao.saveDeliveryExterno(row)
        } else if (row instanceof Gestion) {
            // dao.saveGestion(row)
        } else if (row instanceof GestionExterno) {
            // dao.saveGestionExterno(row)
        } else if (row instanceof Gobierno) {
            // dao.saveGobierno(row)
        } else if (row instanceof GobiernoExterno) {
            // dao.saveGobiernoExterno(row)
        } else if (row instanceof Riesgo) {
            // dao.saveRiesgo(row)
        } else if (row instanceof ValoracionFinal) {
            // dao.saveValoracinoFinal(row)
        }
        return false;
    }

}
