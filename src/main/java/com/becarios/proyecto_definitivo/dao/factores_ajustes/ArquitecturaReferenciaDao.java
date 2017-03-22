package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;



public interface ArquitecturaReferenciaDao {

	ArquitecturaReferencia findByCodeArqRef(int ID);

    void saveArqRef(ArquitecturaReferencia  factor);

    void deleteArqRefByCode(int id);

    List<ArquitecturaReferencia> findAllArqRef(int idProyecto);
    
	
}
