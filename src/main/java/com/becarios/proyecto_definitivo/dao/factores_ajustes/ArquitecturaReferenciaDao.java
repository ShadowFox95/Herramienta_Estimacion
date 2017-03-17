package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencial;

public interface ArquitecturaReferenciaDao {

	ArquitecturaReferencial findByCodeArqRef(int ID);

    void saveArqRef(ArquitecturaReferencial  factor);

    void deleteArqRefByCode(int id);

    List<ArquitecturaReferencial> findAllArqRef(int idProyecto);
	
}
