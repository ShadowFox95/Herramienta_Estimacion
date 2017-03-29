package com.becarios.proyecto_definitivo.service.condicionantes;

import java.util.List;

import com.becarios.proyecto_definitivo.model.condicionantes.Condicionantes;

public interface CondicionantesService {

    List<Condicionantes> findAllCondicionantes(int idProyecto);

    boolean addCondicionantes(Condicionantes Condicionante);

    boolean deleteCondicionantes(int id);
}
