package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;

public interface GestionDao {
	
	Gestion findByCodeGest(int ID);

    void saveGest(Gestion  factor);

    void deleteGestByCode(int id);

    List<Gestion> findAllGest(int idProyecto);

}
