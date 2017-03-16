package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;

public class GestionexternoDaoImpl extends AbstractDao<Integer,Gestionexterno> implements GestionexternoDao{

	@Override
	public Gestionexterno findByCodeGestext(int id){
		return getByKey(id);
	}

	@Override
	public void saveGestext(Gestionexterno  factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteGestextByCode(int id) {
			Delivery factor ;
		    factor = (Delivery)getSession().load(Delivery.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Gestionexterno> findAllGestext(int idProyecto) {
		CriteriaQuery<Gestionexterno> cq = getSession().getCriteriaBuilder().createQuery(Gestionexterno.class);
    	cq.from(Gestionexterno.class);
    	List<Gestionexterno> listaGestionexterno = getSession().createQuery(cq).getResultList();  
		return listaGestionexterno;
	}
	
}
