package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
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
 		 Deliveryexterno factor ;
		    factor = (Deliveryexterno)getSession().load(Deliveryexterno.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Deliveryexterno> findAllDelivext(int idProyecto) {
		CriteriaQuery<Deliveryexterno> cq = getSession().getCriteriaBuilder().createQuery(Deliveryexterno.class);
    	cq.from(Deliveryexterno.class);
    	List<Deliveryexterno> listaDeliveryexterno = getSession().createQuery(cq).getResultList();  
		return listaDeliveryexterno;
	}

}
