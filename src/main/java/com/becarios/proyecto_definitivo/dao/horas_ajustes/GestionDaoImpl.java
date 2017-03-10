
package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;

public class GestionDaoImpl extends AbstractDao<Integer, Gestion> implements GestionDao {
	
	@Override
	public Gestion findByCodeGest(int id) {
		return getByKey(id);
	}

	@Override
	public void saveGest(Gestion  factor) {
		getSession().saveOrUpdate(factor);
			}

	@Override
	public void deleteGestByCode(int id) {
		 Session session ;
		 Gestion factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (Gestion)session.load(Gestion.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
	}

	@Override
	public List<Gestion> findAllGest(int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Gestion>) criteria.list();
	}

}
