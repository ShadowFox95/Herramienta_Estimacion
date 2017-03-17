package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencial;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

public class FactoresAmbientalDaoImpl extends AbstractDao<Integer, FactorComplejidadAmbiental> implements FactoresAmbientalDao {

	@Override
	public FactorComplejidadAmbiental findByCodeFacAmb(int id) {
		return getByKey(id);
	}

	@Override
	public void saveFacAmb(FactorComplejidadAmbiental factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteFacAmbByCode(int id) {
		 Session session ;
		 FactorComplejidadAmbiental factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (FactorComplejidadAmbiental)session.load(FactorComplejidadAmbiental.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<FactorComplejidadAmbiental> findAllFactAmb(int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<FactorComplejidadAmbiental>) criteria.list();
	}
	
}
