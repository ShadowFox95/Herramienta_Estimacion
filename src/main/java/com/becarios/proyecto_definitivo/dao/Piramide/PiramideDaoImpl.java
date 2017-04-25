package com.becarios.proyecto_definitivo.dao.Piramide;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.piramide.Piramide;

@Repository
public class PiramideDaoImpl extends AbstractDao <Integer, Object> implements PiramideDao {

	@Override
	public Piramide findByCodePiramide(int id) {
		return (Piramide) getByKey(id);
	}

	@Override
	public void savePiramide(Piramide piramide) {
		getSession().saveOrUpdate(piramide);
	}

	@Override
	public void deletePiramide(int id) {
		Piramide factor ;
	    factor = (Piramide)getSession().load(Piramide.class,id);
	    getSession().delete(factor);
	    getSession().flush() ;
	}

	@Override
	public List<Piramide> findAllPiramide(int id) {
		CriteriaQuery<Piramide> cq = getSession().getCriteriaBuilder().createQuery(Piramide.class);
    	cq.from(Piramide.class);
    	List<Piramide> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}

}
