package com.becarios.proyecto_definitivo.dao.horas_ajustes;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.becarios.proyecto_definitivo.dao.AbstractDao;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorAjuste;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;

@Repository
public class HorasCostesDaoImpl extends AbstractDao<Integer, Object> implements HorasCostesDao {

    @Override
    public Deliveryexterno findByCodeDelivext(int id) {
        return (Deliveryexterno) getByKey(id);
    }

    @Override
    public void saveDelivext(Deliveryexterno factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteDelivextByCode(int id) {
        Deliveryexterno factor;
        factor = (Deliveryexterno) getSession().load(Deliveryexterno.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Deliveryexterno> findAllDelivext(int idProyecto) {
        CriteriaQuery<Deliveryexterno> cq = getSession().getCriteriaBuilder().createQuery(Deliveryexterno.class);
        cq.from(Deliveryexterno.class);
        List<Deliveryexterno> listaDeliveryexterno = getSession().createQuery(cq).getResultList();
        return listaDeliveryexterno;
    }

    @Override
    public Delivery findByCodeDeliv(int id) {
        return (Delivery) getByKey(id);
    }

    @Override
    public void saveDeliv(Delivery factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteDelivByCode(int id) {
        Delivery factor;
        factor = (Delivery) getSession().load(Delivery.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Delivery> findAllDeliv(int idProyecto) {
        CriteriaQuery<Delivery> cq = getSession().getCriteriaBuilder().createQuery(Delivery.class);
        cq.from(Delivery.class);
        List<Delivery> listaDelivery = getSession().createQuery(cq).getResultList();
        return listaDelivery;
    }

    @Override
    public FactorAjuste findByCodeFacAjust(int id) {
        return (FactorAjuste) getByKey(id);
    }

    @Override
    public void saveFacAjust(FactorAjuste factor) {
        getSession().saveOrUpdate(factor);
    }

    @Override
    public void deleteFacAjustByCode(int id) {
        FactorAjuste factor;
        factor = (FactorAjuste) getSession().load(FactorAjuste.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<FactorAjuste> findAllFacAjust(int idProyecto) {
        CriteriaQuery<FactorAjuste> cq = getSession().getCriteriaBuilder().createQuery(FactorAjuste.class);
        cq.from(FactorAjuste.class);
        List<FactorAjuste> listaFacAjust = getSession().createQuery(cq).getResultList();
        return listaFacAjust;
    }

    @Override
    public Gestion findByCodeGest(int id) {
        return (Gestion) getByKey(id);
    }

    @Override
    public void saveGest(Gestion factor) {
        getSession().saveOrUpdate(factor);
    }

    @Override
    public void deleteGestByCode(int id) {
        Gestion factor;
        factor = (Gestion) getSession().load(Gestion.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Gestion> findAllGest(int idProyecto) {
        CriteriaQuery<Gestion> cq = getSession().getCriteriaBuilder().createQuery(Gestion.class);
        cq.from(Gestion.class);
        List<Gestion> listaGestion = getSession().createQuery(cq).getResultList();
        return listaGestion;
    }

    @Override
    public Gestionexterno findByCodeGestext(int id) {
        return (Gestionexterno) getByKey(id);
    }

    @Override
    public void saveGestext(Gestionexterno factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteGestextByCode(int id) {
        Delivery factor;
        factor = (Delivery) getSession().load(Delivery.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Gestionexterno> findAllGestext(int idProyecto) {
        CriteriaQuery<Gestionexterno> cq = getSession().getCriteriaBuilder().createQuery(Gestionexterno.class);
        cq.from(Gestionexterno.class);
        List<Gestionexterno> listaGestionexterno = getSession().createQuery(cq).getResultList();
        return listaGestionexterno;
    }

    @Override
    public Gobierno findByCodeGob(int id) {
        return (Gobierno) getByKey(id);
    }

    @Override
    public void saveGob(Gobierno factor) {
        getSession().saveOrUpdate(factor);
    }

    @Override
    public void deleteGobByCode(int id) {
        Gobierno factor;
        factor = (Gobierno) getSession().load(Gobierno.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Gobierno> findAllGob(int idProyecto) {
        CriteriaQuery<Gobierno> cq = getSession().getCriteriaBuilder().createQuery(Gobierno.class);
        cq.from(Gobierno.class);
        List<Gobierno> listaGobierno = getSession().createQuery(cq).getResultList();
        return listaGobierno;
    }

    @Override
    public Gobiernoexterno findByCodeGobext(int id) {
        return (Gobiernoexterno) getByKey(id);
    }

    @Override
    public void saveGobext(Gobiernoexterno factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteGobextByCode(int id) {
        Gobiernoexterno factor;
        factor = (Gobiernoexterno) getSession().load(Gobiernoexterno.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Gobiernoexterno> findAllGobext(int idProyecto) {
        CriteriaQuery<Gobiernoexterno> cq = getSession().getCriteriaBuilder().createQuery(Gobiernoexterno.class);
        cq.from(Gobiernoexterno.class);
        List<Gobiernoexterno> listaGobiernoexterno = getSession().createQuery(cq).getResultList();
        return listaGobiernoexterno;
    }

    @Override
    public Riesgo findByCodeRiesg(int id) {
        return (Riesgo) getByKey(id);
    }

    @Override
    public void saveRiesg(Riesgo factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteRiesgByCode(int id) {

        Riesgo factor;
        factor = (Riesgo) getSession().load(Riesgo.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Riesgo> findAllRiesg(int idProyecto) {
        CriteriaQuery<Riesgo> cq = getSession().getCriteriaBuilder().createQuery(Riesgo.class);
        cq.from(Riesgo.class);
        List<Riesgo> listaRiesgo = getSession().createQuery(cq).getResultList();
        return listaRiesgo;
    }

    @Override
    public Valoracionfinal findByCodeValofin(int id) {
        return (Valoracionfinal) getByKey(id);
    }

    @Override
    public void saveValofin(Valoracionfinal factor) {
        getSession().saveOrUpdate(factor);

    }

    @Override
    public void deleteValofinByCode(int id) {
        Valoracionfinal factor;
        factor = (Valoracionfinal) getSession().load(Valoracionfinal.class, id);
        getSession().delete(factor);
        getSession().flush();
    }

    @Override
    public List<Valoracionfinal> findAllValofin(int idProyecto) {
        CriteriaQuery<Valoracionfinal> cq = getSession().getCriteriaBuilder().createQuery(Valoracionfinal.class);
        cq.from(Valoracionfinal.class);
        List<Valoracionfinal> listaValoracionfinal = getSession().createQuery(cq).getResultList();
        return listaValoracionfinal;
    }

}
