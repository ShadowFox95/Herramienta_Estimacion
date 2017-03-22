package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;

public class ArquitecturaReferencialDaoImpl extends AbstractDao<Integer, ArquitecturaReferencia> implements ArquitecturaReferenciaDao  {

	@Override
	public ArquitecturaReferencia findByCodeArqRef(int id) {
		return getByKey(id);
	}

	@Override
	public void saveArqRef(ArquitecturaReferencia factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteArqRefByCode(int id) {
			ArquitecturaReferencia factor ;
		    factor = (ArquitecturaReferencia)getSession().load(ArquitecturaReferencia.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<ArquitecturaReferencia> findAllArqRef (int idProyecto) {
		CriteriaQuery<ArquitecturaReferencia> cq = getSession().getCriteriaBuilder().createQuery(ArquitecturaReferencia.class);
    	cq.from(ArquitecturaReferencia.class);
    	List<ArquitecturaReferencia> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	
}
