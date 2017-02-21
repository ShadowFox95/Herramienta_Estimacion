package com.becarios.proyecto_definitivo.service.criterios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService {

    @Override
    public Modulo findById(String code) {

        return null;
    }

    @Override
    public List<Modulo> findAll() {
        List<Modulo> result = null;

        return result;
    }

}
