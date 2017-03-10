package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

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

		 Session session ;
		 Valoracionfinal factor ;
		 

		    session = sessionFactory.getCurrentSession();
		    factor = (Valoracionfinal)session.load(Valoracionfinal.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Valoracionfinal> findAllValofin (int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Valoracionfinal>) criteria.list();
	}
	
}
