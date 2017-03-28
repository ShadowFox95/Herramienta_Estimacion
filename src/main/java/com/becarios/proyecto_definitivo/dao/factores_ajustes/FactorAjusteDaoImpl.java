package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;

public class FactorAjusteDaoImpl extends AbstractDao <Integer, FactorAjuste> implements FactorAjusteDao {

	@Override
	public FactorAjuste findByCodeFacAjus(int id) {
		return getByKey(id);
	}

	@Override
	public void saveFacAjus(FactorAjuste factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteFacAjusByCode(int id) {
			FactorAjuste factor ;
		    factor = (FactorAjuste)getSession().load(FactorAjuste.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<FactorAjuste> findAllFacAjus(int idProyecto) {
		CriteriaQuery<FactorAjuste> cq = getSession().getCriteriaBuilder().createQuery(FactorAjuste.class);
    	cq.from(FactorAjuste.class);
    	List<FactorAjuste> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	
	
}
