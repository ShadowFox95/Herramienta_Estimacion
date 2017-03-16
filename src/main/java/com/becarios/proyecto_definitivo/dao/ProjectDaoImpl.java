package com.becarios.proyecto_definitivo.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

<<<<<<< Upstream, based on origin/vista
=======

>>>>>>> 4d88fc0 a
import com.becarios.proyecto_definitivo.model.Proyecto;

@Repository
public class ProjectDaoImpl extends AbstractDao<Integer, Proyecto> implements ProjectDao {

    @Override
    public Proyecto findByCode(String code) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("code", code));
        return (Proyecto) criteria.uniqueResult();
    }

    @Override
    public void saveProject(Proyecto proyecto) {
        getSession().saveOrUpdate(proyecto);

    }

    @Override
<<<<<<< Upstream, based on origin/vista
    public void deleteProjectByCode(String code) {

        Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setString("code", code);
        query.executeUpdate();

=======
    public void deleteProjectByCode(int id) {
    		Proyecto proyecto ;
		    proyecto = (Proyecto)getSession().load(Proyecto.class, id);
		    getSession().delete(proyecto);
		    getSession().flush();
>>>>>>> 4d88fc0 a
    }

    
    @Override
    public List<Proyecto> findAllProjects() {
		CriteriaQuery<Proyecto> cq = getSession().getCriteriaBuilder().createQuery(Proyecto.class);
    	cq.from(Proyecto.class);
    	List<Proyecto> listaProyecto = getSession().createQuery(cq).getResultList();  
		return listaProyecto;
    }

}
