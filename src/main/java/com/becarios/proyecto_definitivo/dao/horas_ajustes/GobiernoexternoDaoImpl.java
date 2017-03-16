package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;

public class GobiernoexternoDaoImpl extends AbstractDao <Integer, Gobiernoexterno > implements GobiernoexternoDao{

	@Override
	public Gobiernoexterno findByCodeGobext(int id) {
		return getByKey(id);
	}

	@Override
	public void saveGobext(Gobiernoexterno factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteGobextByCode(int id) {
			Gobiernoexterno factor ;
		    factor = (Gobiernoexterno)getSession().load(Gobiernoexterno.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Gobiernoexterno> findAllGobext (int idProyecto) {
		CriteriaQuery<Gobiernoexterno> cq = getSession().getCriteriaBuilder().createQuery(Gobiernoexterno.class);
    	cq.from(Gobiernoexterno.class);
    	List<Gobiernoexterno> listaGobiernoexterno = getSession().createQuery(cq).getResultList();  
		return listaGobiernoexterno;
	}
	
}
