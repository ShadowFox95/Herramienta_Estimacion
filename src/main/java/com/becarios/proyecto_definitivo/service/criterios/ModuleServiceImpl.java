package com.becarios.proyecto_definitivo.service.criterios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.becarios.proyecto_definitivo.dao.criterios.ModuleDao;
import com.becarios.proyecto_definitivo.dao.criterios.ModuleDaoImpl;
import com.becarios.proyecto_definitivo.model.criterios.CUOriginal;
import com.becarios.proyecto_definitivo.model.criterios.Integracion;
import com.becarios.proyecto_definitivo.model.criterios.Modulo;
import com.becarios.proyecto_definitivo.model.criterios.Negocio;
import com.becarios.proyecto_definitivo.model.criterios.Perfiles;
import com.becarios.proyecto_definitivo.model.criterios.Persistencia;
import com.becarios.proyecto_definitivo.model.criterios.Tabla;
import com.becarios.proyecto_definitivo.model.criterios.Vista;

@Service("ModuleService")
@Transactional
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleDaoImpl dao;

    @Override
    public Modulo findByCode(int code) {
        return dao.findByCode(code);
    }

    @Override
    public void saveModulo(Modulo modulo) {
        dao.saveModule(modulo);

    }

    @Override
    public void updateModulo(Modulo modulo) {
        Modulo entity = dao.findByCode(modulo.getId());
        if (entity != null) {
            entity.setNombre(modulo.getNombre());
            entity.setModulo(modulo.getModulo());
            entity.setTotalFila(modulo.getTotalFila());
        }

    }

    @Override
    public void deleteModuloByCode(int code) {
        dao.deleteModuleByCode(code);

    }

    @Override
    public List<Modulo> findAllModulo(int codigoProyecto) {
        return dao.findAllModules(codigoProyecto);
    }


    @Override
    public boolean AddModulo(int idProyecto, String codigoProyecto, boolean editado, String code, String caseOfUse, String name,
            int perfilesTotal, int perfilesNro, int perfilesComplejidad, int vistaTotal, int vistaNro, int vistaCampos,
            int vistaComplejidad, int vistaListados, int vistaBotones, int negocioTotal, int negocioNro,
            int negocioLogica, int persistenciaTotal, int persistenciaNro, int persistenciaAccesos, int cuTotal,
            int cuDificultad, int integracionTotal, int integracionNro, int integracionComplejidad) {
        try {
            // Crear el Objeto a Guardar
            Modulo modulo = new Modulo();
            modulo.setCodigo(code);
            modulo.setModulo(caseOfUse);
            modulo.setNombre(name);
            modulo.setTotalFila(perfilesTotal+vistaTotal+cuTotal+integracionTotal+negocioTotal+persistenciaTotal);
            modulo.setIdProyecto(idProyecto);

            // Llamar al service para que lo guarde

            // Crea objeto Perfiles
            Perfiles perfiles = new Perfiles(code);
            perfiles.setCodigoRef(code);
            perfiles.setNro(perfilesNro);
            perfiles.setComplejidad(perfilesComplejidad);
            perfiles.setTotal(perfilesTotal);
            

            // Crea objeto Vista
            Vista vista = new Vista(code);
            vista.setCodigoRef(code);
            vista.setNro(vistaNro);
            vista.setBotones(vistaBotones);
            vista.setCampos(vistaCampos);
            vista.setComplejidad(vistaComplejidad);
            vista.setListados(vistaListados);
            vista.setTotal(vistaTotal);

            // Crea objeto Negocio
            Negocio negocio = new Negocio(code);
            negocio.setCodigoRef(code);
            negocio.setNro(negocioNro);
            negocio.setLogica(negocioLogica);
            negocio.setTotal(negocioTotal);

            // Crea objeto Persistencia
            Persistencia persistencia = new Persistencia(code);
            persistencia.setCodigoRef(code);
            persistencia.setNro(persistenciaNro);
            persistencia.setAccesos(persistenciaAccesos);
            persistencia.setTotal(persistenciaTotal);

            // Crea objeto CUOriginal
            CUOriginal cu = new CUOriginal(code);
            cu.setCodigoRef(code);
            cu.setDificultad(cuDificultad);
            cu.setTotal(cuTotal);

            // Crea objeto Integracion
            Integracion integracion = new Integracion(code);
            integracion.setCodigoRef(code);
            integracion.setNro(integracionNro);
            integracion.setComplejidad(integracionComplejidad);
            integracion.setTotal(integracionTotal);

            // Crea la lista de tablas
            List<Tabla> list = modulo.loadTablas();
            list.add(0, perfiles);
            list.add(1, vista);
            list.add(2, negocio);
            list.add(3, persistencia);
            list.add(4, cu);
            list.add(5, integracion);

            modulo.setTablas(list);

            float total;
            if (!editado) {
                total = (float) ((perfilesTotal + vistaTotal + negocioTotal + persistenciaTotal) / 7);
            } else {
                total = (float) ((perfilesTotal + vistaTotal + negocioTotal + persistenciaTotal) * 0.8 / 7
                        + integracionTotal * 0.2);
            }

            modulo.setTotalFila(total);

            this.saveModulo(modulo);
            // Not implemented yet
            // dao.saveTablas(perfiles,vista,negocio,persistencia,cuoriginal,integracion)

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void createModulo(String codigoProyecto) {

        Modulo m = new Modulo(codigoProyecto);

        m.setNombre("Nombre por defecto");
        m.setCode("Codigo"); // Autogenerated Value
        m.setCaseOfUse("Caso de uso" + " por defecto");
        m.setTotalFila(5);
        m.setDefaultTablas();

    }

}
