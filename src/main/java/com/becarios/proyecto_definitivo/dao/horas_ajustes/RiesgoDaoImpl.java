package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;

public class RiesgoDaoImpl extends AbstractDao<Integer,Riesgo> implements RiesgoDao {

	@Override
	public Riesgo findByCodeRiesg(int id) {
		return getByKey(id);
	}

	@Override
	public void saveRiesg(Riesgo factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteRiesgByCode(int id) {
	
		Riesgo factor ;
		    factor = (Riesgo)getSession().load(Riesgo.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Riesgo> findAllRiesg (int idProyecto) {
		CriteriaQuery<Riesgo> cq = getSession().getCriteriaBuilder().createQuery(Riesgo.class);
    	cq.from(Riesgo.class);
    	List<Riesgo> listaRiesgo = getSession().createQuery(cq).getResultList();  
		return  listaRiesgo;	
	}
}
