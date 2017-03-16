package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;

public class GobiernoDaoImpl extends AbstractDao<Integer, Gobierno> implements GobiernoDao {
	
	@Override
	public Gobierno findByCodeGob(int id) {
		return getByKey(id);
	}

	@Override
	public void saveGob(Gobierno  factor) {
		getSession().saveOrUpdate(factor);
			}

	@Override
	public void deleteGobByCode(int id) {
			Gobierno factor ;
		    factor = (Gobierno)getSession().load(Gobierno.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<Gobierno> findAllGob(int idProyecto) {
		CriteriaQuery<Gobierno> cq = getSession().getCriteriaBuilder().createQuery(Gobierno.class);
    	cq.from(Gobierno.class);
    	List<Gobierno> listaGobierno = getSession().createQuery(cq).getResultList();  
		return listaGobierno;
	}

}
