package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;


import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;

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
		 FactorComplejidadAmbiental factor ;
		    factor = (FactorComplejidadAmbiental)getSession().load(FactorComplejidadAmbiental.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<FactorComplejidadAmbiental> findAllFactAmb(int idProyecto) {
		CriteriaQuery<FactorComplejidadAmbiental> cq = getSession().getCriteriaBuilder().createQuery(FactorComplejidadAmbiental.class);
    	cq.from(FactorComplejidadAmbiental.class);
    	List<FactorComplejidadAmbiental> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	
}
