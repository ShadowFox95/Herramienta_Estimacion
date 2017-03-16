package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
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
    public Modulo findByCode(int idModulo) {
        return getByKey(idModulo);
    }

    @Override
    public void saveModule(Modulo modulo) {
        getSession().saveOrUpdate(modulo);
    }

    
    @Override
    public void deleteModuleByCode(int idModulo) {
       		 Modulo modulo;
		    modulo = (Modulo)getSession().load(Modulo.class,idModulo);
		    getSession().delete(modulo);
		    getSession().flush() ;
    }

    @Override
    public List<Modulo> findAllModules(int id) {
		CriteriaQuery<Modulo> cq = getSession().getCriteriaBuilder().createQuery(Modulo.class);
    	cq.from(Modulo.class);
    	List<Modulo> listaModelo= getSession().createQuery(cq).getResultList();  
		return listaModelo;
    }

    @Override
    public ArrayList<Tabla> FindAllTablas(int idModulo) {
        ArrayList<Tabla> lista = new ArrayList<Tabla>();

        lista.add(getSession().get(Perfiles.class, idModulo));
        lista.add(getSession().get(Vista.class, idModulo));
        lista.add(getSession().get(Negocio.class, idModulo));
        lista.add(getSession().get(Persistencia.class, idModulo));
        lista.add(getSession().get(CUOriginal.class, idModulo));
        lista.add(getSession().get(Integracion.class, idModulo));

        return lista;
    }

}
