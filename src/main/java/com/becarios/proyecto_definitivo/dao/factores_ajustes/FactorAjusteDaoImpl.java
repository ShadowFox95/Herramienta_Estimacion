package com.becarios.proyecto_definitivo.dao.factores_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;
import com.becarios.proyecto_definitivo.service.factores_ajuste.FactoresAjusteService;

@Repository
public class FactorAjusteDaoImpl extends AbstractDao <Integer, Object> implements FactorAjusteDao {

	@Override
	public FactorAjuste findByCodeFacAjus(int id) {
		return (FactorAjuste) getByKey(id);
	}

	@Override
	public void saveFacAjus(FactorAjuste factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteFacAjusByCode(int id) {
			FactorAjuste factor ;
		    factor = (FactorAjuste)getSession().load(FactorAjuste.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<FactorAjuste> findAllFacAjus(int idProyecto) {
		CriteriaQuery<FactorAjuste> cq = getSession().getCriteriaBuilder().createQuery(FactorAjuste.class);
    	cq.from(FactorAjuste.class);
    	List<FactorAjuste> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	
	@Override
	public ArquitecturaReferencia findByCodeArqRef(int id) {
		return (ArquitecturaReferencia) getByKey(id);
	}

	@Override
	public void saveArqRef(ArquitecturaReferencia factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteArqRefByCode(int id) {
			ArquitecturaReferencia factor ;
		    factor = (ArquitecturaReferencia)getSession().load(ArquitecturaReferencia.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<ArquitecturaReferencia> findAllArqRef (int idProyecto) {
		CriteriaQuery<ArquitecturaReferencia> cq = getSession().getCriteriaBuilder().createQuery(ArquitecturaReferencia.class);
    	cq.from(ArquitecturaReferencia.class);
    	List<ArquitecturaReferencia> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	
	@Override
	public FactorComplejidadAmbiental findByCodeFacAmb(int id) {
		return (FactorComplejidadAmbiental) getByKey(id);
	}

	@Override
	public void saveFacAmb(FactorComplejidadAmbiental factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteFacAmbByCode(int id) {
		 FactorComplejidadAmbiental factor ;
		    factor = (FactorComplejidadAmbiental)getSession().load(FactorComplejidadAmbiental.class,id);
		    getSession().delete(factor);
		    getSession().flush() ;
	}

	@Override
	public List<FactorComplejidadAmbiental> findAllFactAmb(int idProyecto) {
		CriteriaQuery<FactorComplejidadAmbiental> cq = getSession().getCriteriaBuilder().createQuery(FactorComplejidadAmbiental.class);
    	cq.from(FactorComplejidadAmbiental.class);
    	List<FactorComplejidadAmbiental> listaArquRef = getSession().createQuery(cq).getResultList();  
		return listaArquRef;
	}
	@Override
	public FactorComplejidadTecnica findByCodeFacTec(int id) {
		return (FactorComplejidadTecnica) getByKey(id);
	}

	@Override
	public void saveFacTec(FactorComplejidadTecnica factor) {
		getSession().saveOrUpdate(factor);
		
	}

	@Override
	public void deleteFacTecByCode(int id) {
			FactorAjusteDaoImpl factor ;
		    factor = (FactorAjusteDaoImpl)getSession().load(FactorAjusteDaoImpl.class,id);
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
