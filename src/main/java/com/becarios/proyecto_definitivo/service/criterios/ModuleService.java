package com.becarios.proyecto_definitivo.service.criterios;

import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUsoId;

public interface ModuleService {

    CasosDeUso findByCode(int id);

    void saveModulo(CasosDeUso modulo);

    void updateModulo(CasosDeUso modulo);

    void deleteModuloByCode(int id);

    List<CasosDeUso> findAllModulo(int id);

    void createModulo(int id);

    boolean AddModulo(int idProyecto, int id, String code, String caseOfUse, String name, int perfilesTotal,
            int perfilesNro, int perfilesComplejidad, int vistaTotal, int vistaNro, int vistaCampos,
            int vistaComplejidad, int vistaListados, int vistaBotones, int negocioTotal, int negocioNro,
            int negocioLogica, int persistenciaTotal, int persistenciaNro, int persistenciaAccesos, int cuTotal,
            int cuDificultad, int integracionTotal, int integracionNro, int integracionComplejidad);

}
