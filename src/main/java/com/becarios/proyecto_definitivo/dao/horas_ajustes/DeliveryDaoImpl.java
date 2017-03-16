package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
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
			Delivery factor ;
		    factor = (Delivery)getSession().load(Delivery.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Delivery> findAllDeliv (int idProyecto) {
		CriteriaQuery<Delivery> cq = getSession().getCriteriaBuilder().createQuery(Delivery.class);
    	cq.from(Delivery.class);
    	List<Delivery> listaDelivery = getSession().createQuery(cq).getResultList();  
		return listaDelivery;
	}
}
