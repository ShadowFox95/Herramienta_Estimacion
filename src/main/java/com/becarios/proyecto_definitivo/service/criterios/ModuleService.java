package com.becarios.proyecto_definitivo.service.criterios;

import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;

public interface ModuleService {

    Modulo findByCode(int code);

    void saveModulo(Modulo modulo);

    void updateModulo(Modulo modulo);

    void deleteModuloByCode(int code);

    List<Modulo> findAllModulo(int codigoProyecto);

    boolean isModuloCodeUnique(String code);

    boolean AddModulo(int idProyecto, String codigoProyecto, boolean editado, String code, String caseOfUse, String name,
            int perfilesTotal, int perfilesNro, int perfilesComplejidad, int vistaTotal, int vistaNro, int vistaCampos,
            int vistaComplejidad, int vistaListados, int vistaBotones, int negocioTotal, int negocioNro,
            int negocioLogica, int persistenciaTotal, int persistenciaNro, int persistenciaAccesos, int cuTotal,
            int cuDificultad, int integracionTotal, int integracionNro, int integracionComplejidad);

    void createModulo(String codigoProyecto);

}
