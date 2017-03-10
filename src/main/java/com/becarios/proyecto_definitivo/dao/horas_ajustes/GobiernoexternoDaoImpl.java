package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

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

		 Session session ;
		 Gobiernoexterno factor ;
		 

		    session = sessionFactory.getCurrentSession();
		    factor = (Gobiernoexterno)session.load(Gobiernoexterno.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Gobiernoexterno> findAllGobext (int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Gobiernoexterno>) criteria.list();
	}
	
}
