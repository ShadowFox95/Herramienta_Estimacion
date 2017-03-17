package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;

public interface ValoracionfinalDao {
	Valoracionfinal findByCodeValofin(int ID);

    void saveValofin(Valoracionfinal  factor);

    void deleteValofinByCode(int id);

    List<Valoracionfinal> findAllValofin(int idProyecto);

}
