package com.becarios.proyecto_definitivo.service.piramide;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.model.piramide.Piramide;

@Service("piramidesService")
@Transactional
public class PiramideServiceImpl implements PiramideService {

	@Override
	public void savePiramide(Piramide piramide) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Piramide> findPiramideById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
