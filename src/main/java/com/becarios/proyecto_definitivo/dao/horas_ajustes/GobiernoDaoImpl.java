package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

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
		 Session session ;
		 Gobierno factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (Gobierno)session.load(Gobierno.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
	}

	@Override
	public List<Gobierno> findAllGob(int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Gobierno>) criteria.list();
	}

}
