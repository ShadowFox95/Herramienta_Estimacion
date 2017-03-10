package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;

public interface GobiernoexternoDao {

	Gobiernoexterno findByCodeGobext(int ID);

    void saveGobext(Gobiernoexterno  factor);

    void deleteGobextByCode(int id);

    List<Gobiernoexterno> findAllGobext(int idProyecto);
	
}
