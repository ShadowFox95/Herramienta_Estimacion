package com.becarios.proyecto_definitivo.service.criterios;

import java.util.List;

import com.becarios.proyecto_definitivo.model.criterios.Modulo;

public interface ModuleService {

<<<<<<< Upstream, based on origin/vista
    Modulo findByCode(String code);
=======
    Modulo findByCode(int id);
>>>>>>> 4d88fc0 a

    void saveModulo(Modulo modulo);

    void updateModulo(Modulo modulo);

<<<<<<< Upstream, based on origin/vista
    void deleteModuloByCode(String code);
=======
    void deleteModuloByCode(int id);
>>>>>>> 4d88fc0 a

<<<<<<< Upstream, based on origin/vista
    List<Modulo> findAllModulo();
=======
    List<Modulo> findAllModulo(int id);
>>>>>>> 4d88fc0 a

    void createModulo(int id);

<<<<<<< Upstream, based on origin/vista
    boolean AddModulo(String codigoProyecto, boolean editado, String code, String caseOfUse, String name,
            int perfilesTotal, int perfilesNro, int perfilesComplejidad, int vistaTotal, int vistaNro, int vistaCampos,
            int vistaComplejidad, int vistaListados, int vistaBotones, int negocioTotal, int negocioNro,
            int negocioLogica, int persistenciaTotal, int persistenciaNro, int persistenciaAccesos, int cuTotal,
            int cuDificultad, int integracionTotal, int integracionNro, int integracionComplejidad);

    void createModulo(String codigoProyecto);
=======
	boolean AddModulo(int idProyecto, int id,String code, String caseOfUse, String name, int perfilesTotal,
			int perfilesNro, int perfilesComplejidad, int vistaTotal, int vistaNro, int vistaCampos,
			int vistaComplejidad, int vistaListados, int vistaBotones, int negocioTotal, int negocioNro,
			int negocioLogica, int persistenciaTotal, int persistenciaNro, int persistenciaAccesos, int cuTotal,
			int cuDificultad, int integracionTotal, int integracionNro, int integracionComplejidad);
>>>>>>> 4d88fc0 a

}
