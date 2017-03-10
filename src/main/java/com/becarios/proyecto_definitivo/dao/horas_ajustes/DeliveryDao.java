package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;

public interface DeliveryDao {

	Delivery findByCodeDeliv(int ID);

    void saveDeliv(Delivery  factor);

    void deleteDelivByCode(int id);

    List<Delivery> findAllDeliv(int idProyecto);
	
	
}
