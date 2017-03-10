package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;

public class DeliveryexternoDaoImpl extends AbstractDao<Integer,Deliveryexterno> implements DeliveryexternoDao {
	
	@Override
	public Deliveryexterno findByCodeDelivext(int id){
		return getByKey(id);
	}

	@Override
	public void saveDelivext(Deliveryexterno  factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteDelivextByCode(int id) {
		 Session session ;
		 Deliveryexterno factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (Deliveryexterno)session.load(Deliveryexterno.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Deliveryexterno> findAllDelivext(int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Deliveryexterno>) criteria.list();
	}

}
