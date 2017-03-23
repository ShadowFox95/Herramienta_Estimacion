package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;

public class FactorAjusteDaoImpl extends AbstractDao<Integer, FactorAjuste> implements FactorAjusteDao{

	@Override
	public FactorAjuste findByCodeFacAjust(int id) {
		return getByKey(id);
	}

	@Override
	public void saveFacAjust(FactorAjuste  factor) {
		getSession().saveOrUpdate(factor);
			}

	@Override
	public void deleteFacAjustByCode(int id) {
			FactorAjuste factor ;
		    factor = (FactorAjuste)getSession().load(FactorAjuste.class,id);
		    getSession().delete(factor);
		    getSession().flush();
}
	@Override
	public List<FactorAjuste> findAllFacAjust (int idProyecto) {
		CriteriaQuery<FactorAjuste> cq = getSession().getCriteriaBuilder().createQuery(FactorAjuste.class);
    	cq.from(FactorAjuste.class);
    	List<FactorAjuste> listaFacAjust = getSession().createQuery(cq).getResultList();  
		return listaFacAjust;
	}
	
}
