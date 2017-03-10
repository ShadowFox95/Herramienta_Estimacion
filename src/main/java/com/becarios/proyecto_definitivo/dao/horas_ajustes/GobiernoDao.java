package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;

public interface GobiernoDao {
	
	Gobierno findByCodeGob(int ID);

    void saveGob(Gobierno  factor);

    void deleteGobByCode(int id);

    List<Gobierno> findAllGob(int idProyecto);

}
