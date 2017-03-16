package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;

public interface RiesgoDao {
	
	Riesgo findByCodeRiesg(int ID);

    void saveRiesg(Riesgo  factor);

    void deleteRiesgByCode(int id);

    List<Riesgo> findAllRiesg(int idProyecto);
}
