package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.model.criterios.Cuoriginal;
import com.becarios.proyecto_definitivo.model.criterios.Integracion;
import com.becarios.proyecto_definitivo.model.criterios.Negocio;
import com.becarios.proyecto_definitivo.model.criterios.Perfiles;
import com.becarios.proyecto_definitivo.model.criterios.Persistencia;
import com.becarios.proyecto_definitivo.model.criterios.Tabla;
import com.becarios.proyecto_definitivo.model.criterios.Vista;

@Repository
public class ModuleDaoImpl extends AbstractDao<Integer, CasosDeUso> implements ModuleDao {

    @Override
    public CasosDeUso findByCode(int idModulo) {
        return getByKey(idModulo);
    }

    @Override
    public void saveModule(CasosDeUso modulo) {
        getSession().saveOrUpdate(modulo);
    }

    @Override
    public void deleteModuleByCode(int idModulo) {
    	CasosDeUso modulo;
        modulo = (CasosDeUso) getSession().load(CasosDeUso.class, idModulo);
        getSession().delete(modulo);
        getSession().flush();
    }

    @Override
    public List<CasosDeUso> findAllModules(int id) {
        CriteriaQuery<CasosDeUso> cq = getSession().getCriteriaBuilder().createQuery(CasosDeUso.class);
        cq.from(CasosDeUso.class);
        List<CasosDeUso> listaModelo = getSession().createQuery(cq).getResultList();
        return listaModelo;
    }

    @Override
    public ArrayList<Tabla> FindAllTablas(int idModulo) {
        ArrayList<Tabla> lista = new ArrayList<Tabla>();

        lista.add(getSession().get(Perfiles.class, idModulo));
        lista.add(getSession().get(Vista.class, idModulo));
        lista.add(getSession().get(Negocio.class, idModulo));
        lista.add(getSession().get(Persistencia.class, idModulo));
        lista.add(getSession().get(Cuoriginal.class, idModulo));
        lista.add(getSession().get(Integracion.class, idModulo));

        return lista;
    }

}
