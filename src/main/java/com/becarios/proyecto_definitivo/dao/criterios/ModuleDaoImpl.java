package com.becarios.proyecto_definitivo.dao.criterios;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.dao.factores_ajustes.FactoresTecnicaDaoImpl;
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

    @SuppressWarnings("deprecation")
    @Override
    public void deleteModuleByCode(int idModulo) {
       
    	 Session session ;
		 Modulo modulo;

		    session = sessionFactory.getCurrentSession();
		    modulo = (Modulo)session.load(Modulo.class,idModulo);
		    session.delete(modulo);

		    //This makes the pending delete to be done
		    session.flush() ;
    	
    	/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Modulo> findAllModules(int id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("idProyecto", id));
        return (List<Modulo>) criteria.list();
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
