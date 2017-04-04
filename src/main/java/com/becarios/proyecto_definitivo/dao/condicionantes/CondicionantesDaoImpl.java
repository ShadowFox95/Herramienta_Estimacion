package com.becarios.proyecto_definitivo.dao.condicionantes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.condicionantes.Condicionantes;

@Repository
public class CondicionantesDaoImpl extends AbstractDao<Integer, Condicionantes> implements CondicionantesDao {

	  @Override
	    public Condicionantes findByCode(int idCondi) {
	        return getByKey(idCondi);
	    }

	    @Override
	    public void saveCondi(Condicionantes Condi) {
	        getSession().saveOrUpdate(Condi);
	    }

	    @Override
	    public void deleteCondiByCode(int idCondi) {
	    	Condicionantes Condi;
	    	Condi = (Condicionantes) getSession().load(Condicionantes.class, idCondi);
	        getSession().delete(Condi);
	        getSession().flush();
	    }

	    @Override
	    public List<Condicionantes> findAllCondi(int id) {
	        CriteriaQuery<Condicionantes> cq = getSession().getCriteriaBuilder().createQuery(Condicionantes.class);
	        cq.from(Condicionantes.class);
	        List<Condicionantes> listaCondi = getSession().createQuery(cq).getResultList();
	        return listaCondi;
	    }
	
}
