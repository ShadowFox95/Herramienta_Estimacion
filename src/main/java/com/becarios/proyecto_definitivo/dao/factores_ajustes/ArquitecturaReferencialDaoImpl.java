package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencial;

public class ArquitecturaReferencialDaoImpl extends AbstractDao<Integer, ArquitecturaReferencial> implements ArquitecturaReferenciaDao  {

	@Override
	public ArquitecturaReferencial findByCodeArqRef(int id) {
		return getByKey(id);
	}

	@Override
	public void saveArqRef(ArquitecturaReferencial factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteArqRefByCode(int id) {
		 Session session ;
		 ArquitecturaReferencial factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (ArquitecturaReferencial)session.load(ArquitecturaReferencial.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<ArquitecturaReferencial> findAllArqRef (int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<ArquitecturaReferencial>) criteria.list();
	}
	
}
