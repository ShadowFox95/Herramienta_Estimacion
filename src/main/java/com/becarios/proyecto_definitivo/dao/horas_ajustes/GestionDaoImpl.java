
package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;

public class GestionDaoImpl extends AbstractDao<Integer, Gestion> implements GestionDao {
	
	@Override
	public Gestion findByCodeGest(int id) {
		return getByKey(id);
	}

	@Override
	public void saveGest(Gestion  factor) {
		getSession().saveOrUpdate(factor);
			}

	@Override
	public void deleteGestByCode(int id) {
			Gestion factor ;
		    factor = (Gestion)getSession().load(Gestion.class,id);
		    getSession().delete(factor);
		    getSession().flush();
}
	@Override
	public List<Gestion> findAllGest(int idProyecto) {
		CriteriaQuery<Gestion> cq = getSession().getCriteriaBuilder().createQuery(Gestion.class);
    	cq.from(Gestion.class);
    	List<Gestion> listaGestion = getSession().createQuery(cq).getResultList();  
		return listaGestion;
	}

}
