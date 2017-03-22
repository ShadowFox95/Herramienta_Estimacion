package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
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
				FactoresTecnicaDaoImpl factor ;
			    factor = (FactoresTecnicaDaoImpl)getSession().load(FactoresTecnicaDaoImpl.class,id);
			    getSession().delete(factor);
			    getSession().flush() ;
			
		}

		@Override
		public List<FactorComplejidadTecnica> findAllFacTec(int idProyecto) {
			CriteriaQuery<FactorComplejidadTecnica> cq = getSession().getCriteriaBuilder().createQuery(FactorComplejidadTecnica.class);
	    	cq.from(FactorComplejidadTecnica.class);
	    	List<FactorComplejidadTecnica> listaArquRef = getSession().createQuery(cq).getResultList();  
			return listaArquRef;
		}
}
