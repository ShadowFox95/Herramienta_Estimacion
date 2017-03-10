package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;

public interface GestionexternoDao {
	
	Gestionexterno findByCodeGestext(int ID);

    void saveGestext(Gestionexterno  factor);

    void deleteGestextByCode(int id);

    List<Gestionexterno> findAllGestext(int idProyecto);

}
