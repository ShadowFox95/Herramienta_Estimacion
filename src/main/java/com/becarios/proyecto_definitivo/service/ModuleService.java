package com.becarios.proyecto_definitivo.service;

import java.util.List;

import com.becarios.proyecto_definitivo.model.Modulo;

public interface ModuleService {

    Modulo findById(String code);

    List<Modulo> findAll();

}
