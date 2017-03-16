package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;

public class ValoracionfinalDaoImpl extends AbstractDao<Integer, Valoracionfinal> implements ValoracionfinalDao{

	@Override
	public Valoracionfinal findByCodeValofin(int id) {
		return getByKey(id);
	}

	@Override
	public void saveValofin(Valoracionfinal factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteValofinByCode(int id) {
			Valoracionfinal factor ;
		    factor = (Valoracionfinal)getSession().load(Valoracionfinal.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Valoracionfinal> findAllValofin (int idProyecto) {
		CriteriaQuery<Valoracionfinal> cq = getSession().getCriteriaBuilder().createQuery(Valoracionfinal.class);
    	cq.from(Valoracionfinal.class);
    	List<Valoracionfinal> listaValoracionfinal = getSession().createQuery(cq).getResultList();  
		return listaValoracionfinal;
	}
	
}
