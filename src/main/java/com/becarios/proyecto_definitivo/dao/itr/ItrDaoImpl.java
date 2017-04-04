package com.becarios.proyecto_definitivo.dao.itr;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.itr.Itr;

@Repository
public class ItrDaoImpl extends AbstractDao<Integer, Itr> implements ItrDao {
	
	@Override
	public Itr findByCodeItr(int id) {
		return getByKey(id);
	}

	@Override
	public void saveItr(Itr factor) {
		getSession().saveOrUpdate(factor);
	}

	@Override
	public void deleteItrByCode(int id) {
			Itr factor ;
		    factor = (Itr)getSession().load(Itr.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Itr> findAllItr (int idProyecto) {
		CriteriaQuery<Itr> cq = getSession().getCriteriaBuilder().createQuery(Itr.class);
    	cq.from(Itr.class);
    	List<Itr> listaItr = getSession().createQuery(cq).getResultList();  
		return listaItr;
	}

}
