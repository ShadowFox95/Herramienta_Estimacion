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

public interface HorasCostesService {

    List<Delivery> findDeliveryById(int id);

    List<DeliveryExterno> findDeliveryExternoById(int id);

    List<Gestion> findGestionById(int id);

    List<GestionExterno> findGestionExternoById(int id);

    List<Gobierno> findGobiernoById(int id);

    List<GobiernoExterno> findGobietnoExternoById(int id);

    List<Riesgo> findRiesgoById(int id);

    List<ValoracionFinal> findValoracionFinalById(int id);

    boolean save(Object row);

}
