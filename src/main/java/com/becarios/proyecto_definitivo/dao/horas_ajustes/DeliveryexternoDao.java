package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;

public interface DeliveryexternoDao {
	
	Deliveryexterno findByCodeDelivext(int id);

    void saveDelivext(Deliveryexterno  factor);

    void deleteDelivextByCode(int id);

    List<Deliveryexterno> findAllDelivext(int idProyecto);

}
