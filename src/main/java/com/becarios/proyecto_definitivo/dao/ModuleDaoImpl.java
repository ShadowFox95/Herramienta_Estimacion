package com.becarios.proyecto_definitivo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.criterios.CUOriginal;
import com.becarios.proyecto_definitivo.model.criterios.Integracion;
import com.becarios.proyecto_definitivo.model.criterios.Modulo;
import com.becarios.proyecto_definitivo.model.criterios.Negocio;
import com.becarios.proyecto_definitivo.model.criterios.Perfiles;
import com.becarios.proyecto_definitivo.model.criterios.Persistencia;
import com.becarios.proyecto_definitivo.model.criterios.Tabla;
import com.becarios.proyecto_definitivo.model.criterios.Vista;

@Repository
public class ModuleDaoImpl extends AbstractDao<Integer, Modulo> implements ModuleDao {

    @Override
    public Modulo findByCode(String code) {
        return getByKey(code);
    }

    @Override
    public void saveModule(Modulo modulo) {
        getSession().saveOrUpdate(modulo);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void deleteModuleByCode(String code) {
        Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setString("code", code);
        query.executeUpdate();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Modulo> findAllModules() {
        Criteria criteria = createEntityCriteria();
        return (List<Modulo>) criteria.list();
    }

    @Override
    public ArrayList<Tabla> FindAllTablas(String code) {
        ArrayList<Tabla> lista = new ArrayList<Tabla>();

        lista.add(getSession().get(Perfiles.class, code));
        lista.add(getSession().get(Vista.class, code));
        lista.add(getSession().get(Negocio.class, code));
        lista.add(getSession().get(Persistencia.class, code));
        lista.add(getSession().get(CUOriginal.class, code));
        lista.add(getSession().get(Integracion.class, code));

        return lista;
    }

}
