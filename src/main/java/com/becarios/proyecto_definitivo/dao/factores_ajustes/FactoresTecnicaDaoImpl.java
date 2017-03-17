package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.criterios.Modulo;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;

@Repository
public class FactoresTecnicaDaoImpl extends AbstractDao<Integer, FactorComplejidadTecnica> implements FactoresTecnicaDao{
	
		@Override
		public FactorComplejidadTecnica findByCodeFacTec(int id) {
			return getByKey(id);
		}

		@Override
		public void saveFacTec(FactorComplejidadTecnica factor) {
			getSession().saveOrUpdate(factor);
			
		}

		@Override
		public void deleteFacTecByCode(int id) {
			 Session session ;
			 FactoresTecnicaDaoImpl factor ;

			    session = sessionFactory.getCurrentSession();
			    factor = (FactoresTecnicaDaoImpl)session.load(FactoresTecnicaDaoImpl.class,id);
			    session.delete(factor);

			    //This makes the pending delete to be done
			    session.flush() ;
			
			/*Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
	        query.setInteger("code", idModulo);
	        query.executeUpdate();*/
			
		}

		@Override
		public List<FactorComplejidadTecnica> findAllFacTec(int idProyecto) {
			Criteria criteria = createEntityCriteria();
	        return (List<FactorComplejidadTecnica>) criteria.list();
		}
}
