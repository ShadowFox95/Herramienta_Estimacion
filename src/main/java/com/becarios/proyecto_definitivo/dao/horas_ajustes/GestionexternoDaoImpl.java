package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;

public class GestionexternoDaoImpl extends AbstractDao<Integer,Gestionexterno> implements GestionexternoDao{

	@Override
	public Gestionexterno findByCodeGestext(int id){
		return getByKey(id);
	}

	@Override
	public void saveGestext(Gestionexterno  factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteGestextByCode(int id) {
		 Session session ;
		 Delivery factor ;

		    session = sessionFactory.getCurrentSession();
		    factor = (Delivery)session.load(Delivery.class,id);
		    session.delete(factor);

		    //This makes the pending delete to be done
		    session.flush() ;
		
		/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setInteger("code", idModulo);
        query.executeUpdate();*/
		
	}

	@Override
	public List<Gestionexterno> findAllGestext(int idProyecto) {
		Criteria criteria = createEntityCriteria();
        return (List<Gestionexterno>) criteria.list();
	}
	
}
