package com.becarios.proyecto_definitivo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

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
    public void deleteProjectByCode(String code) {

        Query<?> query = getSession().createQuery("delete from Modulo where code = :code");
        query.setString("code", code);
        query.executeUpdate();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Proyecto> findAllProjects() {
        Criteria criteria = createEntityCriteria();
        return (List<Proyecto>) criteria.list();
    }

}
