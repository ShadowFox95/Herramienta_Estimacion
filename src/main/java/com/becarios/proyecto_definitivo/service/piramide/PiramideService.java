package com.becarios.proyecto_definitivo.service.piramide;

import java.util.List;

import com.becarios.proyecto_definitivo.model.piramide.Piramide;

public interface PiramideService {
	
	 void savePiramide(Piramide piramide);
	 List<Piramide> findPiramideById(int id);

}
