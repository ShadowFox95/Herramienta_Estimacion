package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;

public class DeliveryDaoImpl  extends AbstractDao<Integer, Delivery> implements DeliveryDao{

	@Override
	public Delivery findByCodeDeliv(int id) {
		return getByKey(id);
	}

	@Override
	public void saveDeliv(Delivery factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteDelivByCode(int id) {

		 Session session ;
		 Delivery factor ;
		 

		    session = sessionFactory.getCurrentSession();
		    factor = (Delivery)session.load(Delivery.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Delivery> findAllDeliv (int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Delivery>) criteria.list();
	}
}
