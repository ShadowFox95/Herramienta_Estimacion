package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;

public class RiesgoDaoImpl extends AbstractDao<Integer,Riesgo> implements RiesgoDao {

	@Override
	public Riesgo findByCodeRiesg(int id) {
		return getByKey(id);
	}

	@Override
	public void saveRiesg(Riesgo factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteRiesgByCode(int id) {

		 Session session ;
		 Riesgo factor ;
		 

		    session = sessionFactory.getCurrentSession();
		    factor = (Riesgo)session.load(Riesgo.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Riesgo> findAllRiesg (int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Riesgo>) criteria.list();
	}
}
