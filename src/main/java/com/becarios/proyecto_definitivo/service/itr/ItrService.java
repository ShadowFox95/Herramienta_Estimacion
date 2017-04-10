package com.becarios.proyecto_definitivo.service.itr;

import java.util.List;

import com.becarios.proyecto_definitivo.model.itr.Itr;

public interface ItrService {
	
	List<Itr> findAll(int id);
	
	boolean save(Itr itr);

}
