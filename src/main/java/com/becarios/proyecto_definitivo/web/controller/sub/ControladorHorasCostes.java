package com.becarios.proyecto_definitivo.web.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobiernoexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;
import com.becarios.proyecto_definitivo.service.horas_costes.HorasCostesService;

@Controller
public class ControladorHorasCostes {

    @Autowired
    private HorasCostesService service;

    @RequestMapping(value = "/estimacion-horas", method = RequestMethod.GET)
    public String index(ModelMap model) {

        return "estimacion-horas/horas";
    }

    @RequestMapping(value = "/costes/{id}/save", method = RequestMethod.GET)
    public void save(@PathVariable("id") int id,
            // Valoracion Final
            @RequestParam("total_adm_horas") int totalADMHoras, @RequestParam("total_adm_coste") int totalADMCoste,
            @RequestParam("total_testing_horas") int totalTestingHoras,
            @RequestParam("total_testing_coste") int totalTestingCoste,
            @RequestParam("total_onsite_horas") int totalOnSiteHoras,
            @RequestParam("total_onsite_coste") int totalOnSiteCoste,
            @RequestParam("horas_contingencia") int horasContingencia,
            // Centro ADM-DW

            // Delivery
            @RequestParam("configuracion_porcentaje") int configuracionPorcentaje,
            @RequestParam("configuracion_horas") int configuracionHoras,
            @RequestParam("configuracion_coste") int configuracionCoste,

            @RequestParam("evaluacion_porcentaje") int evaluacionPorcentaje,
            @RequestParam("evaluacion_horas") int evaluacionHoras,
            @RequestParam("evaluacion_coste") int evaluacionCoste,

            @RequestParam("analisis_porcentaje") int analisisPorcentaje,
            @RequestParam("analisis_horas") int analisisHoras,
            @RequestParam("analisis_interna_practica") boolean analisisInternaPractica,
            @RequestParam("analisis_coste") int analisisCoste,

            @RequestParam("design_porcentaje") int designPorcentaje, @RequestParam("design_horas") int designHoras,
            @RequestParam("design_coste") int designCoste,

            @RequestParam("construccion_porcentaje") int construccionPorcentaje,
            @RequestParam("construccion_horas") int construccionHoras,
            @RequestParam("construccion_coste") int construccionCoste,

            @RequestParam("pruebas_porcentaje") int pruebasPorcentaje, @RequestParam("pruebas_horas") int pruebasHoras,
            @RequestParam("pruebas_interna_practica") boolean pruebasInternaPractica,
            @RequestParam("pruebas_coste") int pruebasCoste,

            // Gestion
            @RequestParam("calidad_nivel") int calidadNivel, @RequestParam("calidad_porcentaje") int calidadPorcentaje,
            @RequestParam("calidad_interna_practica") boolean calidadInternaPractica,
            @RequestParam("calidad_horas") int calidadHoras, @RequestParam("calidad_coste") int calidadCoste,

            @RequestParam("seguridad_nivel") int seguridadNivel,
            @RequestParam("seguridad_porcentaje") int seguridadPorcentaje,
            @RequestParam("seguridad_interna_practica") boolean seguridadInternaPractica,
            @RequestParam("seguridad_horas") int seguridadHoras, @RequestParam("seguridad_coste") int seguridadCoste,

            @RequestParam("despliegues_nivel") int desplieguesNivel,
            @RequestParam("despliegues_porcentaje") int desplieguesPorcentaje,
            @RequestParam("despliegues_interna_practica") boolean desplieguesInternaPractica,
            @RequestParam("desplieguies_horas") int desplieguesHoras,
            @RequestParam("despliegues_coste") int desplieguesCoste,

            // Gobierno
            @RequestParam("gestion_proyecto_porcentaje") int gestionProyectoPorcentaje,
            @RequestParam("gestion_proyecto_interna_practica") boolean gestionProyectoInternaPractica,
            @RequestParam("gestion_proyecto_horas") int gestionProyectoHoras,
            @RequestParam("gestion_proyecto_coste") int gestionProyectoCoste,

            @RequestParam("gestion_dm_porcentaje") int gestionDmPorcentaje,
            @RequestParam("gestion_dm_interna_practica") boolean gestionDmInternaPractica,
            @RequestParam("gestion_dm_horas") int gestionDmHoras, @RequestParam("gestion_dm_coste") int gestionDmCoste,

            // Externo a ADM-DW

            // Delivery
            @RequestParam("testing_ext_porcentaje") int testingExtPorcentaje,
            @RequestParam("testing_ext") int testingExtHoras, @RequestParam("testing_ext_coste") int testingExtCoste,

            @RequestParam("analisis_ext_porcentaje") int analisisExtPorcentaje,
            @RequestParam("analisis_ext_horas") int AnalisisExtHoras,
            @RequestParam("analisis_ext_coste") int AnalisisExtCoste,

            // Gestion
            @RequestParam("calidad_ext_porcentaje") int calidadExtPorcentaje,
            @RequestParam("calidad_ext_horas") int calidadExtHoras,
            @RequestParam("calidad_ext_coste") int calidadExtCoste,

            @RequestParam("seguridad_ext_porcentaje") int seguridadExtPorcentaje,
            @RequestParam("seguridad_ext_horas") int seguridadExtHoras,
            @RequestParam("seguridad_ext_coste") int seguridadExtCoste,

            @RequestParam("despliegues_ext_porcentaje") int desplieguesExtPorcentaje,
            @RequestParam("despliegues_ext_horas") int desplieguesExtHoras,
            @RequestParam("despliegues_ext_coste") int desplieguesExtCoste,

            // Gobierno
            @RequestParam("despliegues_ext_porcentaje") int gestionProyectoExtPorcentaje,
            @RequestParam("despliegues_ext_horas") int gestionProyectoExtHoras,
            @RequestParam("despliegues_ext_coste") int gestionProyectoExtCoste

    ) {
        // Centro ADM-DW
        Delivery gestionConfiguracion = new Delivery();
        gestionConfiguracion.setNombre("Gestión de la configuracion, entornos locales y desarrollo");
        gestionConfiguracion.setPorcentaje(configuracionPorcentaje);
        gestionConfiguracion.setHoras(configuracionHoras);
        gestionConfiguracion.setCoste(configuracionCoste);
        service.save(gestionConfiguracion);

        Delivery faseEvaluacion = new Delivery();
        faseEvaluacion.setNombre("Fase de evaluacion y diseño de la arquitectura");
        faseEvaluacion.setPorcentaje(evaluacionPorcentaje);
        faseEvaluacion.setHoras(evaluacionHoras);
        faseEvaluacion.setCoste(evaluacionCoste);
        service.save(faseEvaluacion);

        Delivery FaseAnalisis = new Delivery();
        FaseAnalisis.setNombre("Fase de análisis");
        FaseAnalisis.setPorcentaje(analisisPorcentaje);
        FaseAnalisis.setInternaPractica(analisisInternaPractica);
        FaseAnalisis.setHoras(analisisHoras);
        FaseAnalisis.setCoste(analisisCoste);
        service.save(FaseAnalisis);

        Delivery FaseDesign = new Delivery();
        FaseDesign.setNombre("Fase de diseño");
        FaseDesign.setPorcentaje(designPorcentaje);
        FaseDesign.setHoras(designHoras);
        FaseDesign.setCoste(designCoste);
        service.save(FaseDesign);

        Delivery FaseConstruccion = new Delivery();
        FaseConstruccion.setNombre("Fase de construccion y pruebas unitarias");
        FaseConstruccion.setPorcentaje(construccionPorcentaje);
        FaseConstruccion.setHoras(construccionHoras);
        FaseConstruccion.setCoste(construccionCoste);
        service.save(FaseConstruccion);

        Delivery FasePruebas = new Delivery();
        FasePruebas.setNombre("Fase de pruebas de funcionamiento");
        FasePruebas.setPorcentaje(pruebasPorcentaje);
        FasePruebas.setInternaPractica(pruebasInternaPractica);
        FasePruebas.setHoras(pruebasHoras);
        FasePruebas.setCoste(pruebasCoste);
        service.save(FasePruebas);

        // Gestion de la calidad/seguridad/despliegues
        Gestion GestionCalidad = new Gestion();
        GestionCalidad.setNombre("Gestión de calidad");
        GestionCalidad.setNivel(calidadNivel);
        GestionCalidad.setPorcentaje(calidadPorcentaje);
        GestionCalidad.setInternaPractica(calidadInternaPractica);
        GestionCalidad.setHoras(calidadHoras);
        GestionCalidad.setCoste(calidadCoste);
        service.save(GestionCalidad);

        Gestion GestionSeguridad = new Gestion();
        GestionSeguridad.setNombre("Gestión de seguridad");
        GestionSeguridad.setNivel(seguridadNivel);
        GestionSeguridad.setPorcentaje(seguridadPorcentaje);
        GestionSeguridad.setInternaPractica(seguridadInternaPractica);
        GestionSeguridad.setHoras(seguridadHoras);
        GestionSeguridad.setCoste(seguridadCoste);
        service.save(GestionSeguridad);

        Gestion GestionDespliegues = new Gestion();
        GestionDespliegues.setNombre("Gestión de despliegues");
        GestionDespliegues.setNivel(desplieguesNivel);
        GestionDespliegues.setPorcentaje(desplieguesPorcentaje);
        GestionDespliegues.setInternaPractica(desplieguesInternaPractica);
        GestionDespliegues.setHoras(desplieguesHoras);
        GestionDespliegues.setCoste(desplieguesCoste);
        service.save(GestionDespliegues);

        // Gobierno
        Gobierno GestionProyecto = new Gobierno();
        GestionProyecto.setNombre("Gestion del proyecto");
        GestionProyecto.setPorcentaje(gestionProyectoPorcentaje);
        GestionProyecto.setInternaPractica(gestionProyectoInternaPractica);
        GestionProyecto.setHoras(gestionProyectoHoras);
        GestionProyecto.setCoste(gestionProyectoCoste);
        service.save(GestionProyecto);

        Gobierno GestionDm = new Gobierno();
        GestionDm.setNombre("Gestion del DM");
        GestionDm.setPorcentaje(gestionDmPorcentaje);
        GestionDm.setInternaPractica(gestionDmInternaPractica);
        GestionDm.setHoras(gestionDmHoras);
        GestionDm.setCoste(gestionDmCoste);
        service.save(GestionDm);

        Deliveryexterno testingExterno = new Deliveryexterno();
        testingExterno.setNombre("Centro de Testing");
        testingExterno.setPorcentaje(testingExtPorcentaje);
        testingExterno.setHoras(testingExtHoras);
        testingExterno.setCoste(testingExtCoste);
        service.save(testingExterno);

        Deliveryexterno analisisExterno = new Deliveryexterno();
        analisisExterno.setNombre("Análisis");
        analisisExterno.setPorcentaje(analisisExtPorcentaje);
        analisisExterno.setHoras(AnalisisExtHoras);
        analisisExterno.setCoste(AnalisisExtCoste);
        service.save(analisisExterno);

        Gestionexterno calidadExterno = new Gestionexterno();
        calidadExterno.setNombre("Gestión de calidad");
        calidadExterno.setPorcentaje(calidadExtPorcentaje);
        calidadExterno.setHoras(calidadExtHoras);
        calidadExterno.setCoste(calidadExtCoste);
        service.save(calidadExterno);

        Gestionexterno seguridadExterno = new Gestionexterno();
        seguridadExterno.setNombre("Gestión de seguridad");
        seguridadExterno.setPorcentaje(seguridadExtPorcentaje);
        seguridadExterno.setHoras(seguridadExtHoras);
        seguridadExterno.setCoste(seguridadExtCoste);
        service.save(seguridadExterno);

        Gestionexterno desplieguesExterno = new Gestionexterno();
        desplieguesExterno.setNombre("Gestión de despliegues");
        desplieguesExterno.setPorcentaje(desplieguesExtPorcentaje);
        desplieguesExterno.setHoras(desplieguesExtHoras);
        desplieguesExterno.setCoste(desplieguesExtCoste);
        service.save(desplieguesExterno);

        Gobiernoexterno gestionProyectoExterno = new Gobiernoexterno();
        gestionProyectoExterno.setNombre("Gestión del proyecto");
        gestionProyectoExterno.setPorcentaje(gestionProyectoExtPorcentaje);
        gestionProyectoExterno.setHoras(gestionProyectoExtHoras);
        gestionProyectoExterno.setCoste(gestionProyectoExtCoste);
        service.save(gestionProyectoExterno);

        // Valoracion Final
        Valoracionfinal totalADM = new Valoracionfinal();
        totalADM.setNombre("Total ADM-DW");
        totalADM.setHoras(totalADMHoras);
        totalADM.setCoste(totalADMCoste);
        service.save(totalADM);

        Valoracionfinal totalTesting = new Valoracionfinal();
        totalTesting.setNombre("Total centro de Testing");
        totalTesting.setHoras(totalTestingHoras);
        totalTesting.setCoste(totalTestingCoste);
        service.save(totalTesting);

        Valoracionfinal totalOnSite = new Valoracionfinal();
        totalOnSite.setNombre("Total OnSite");
        totalOnSite.setHoras(totalOnSiteHoras);
        totalOnSite.setCoste(totalOnSiteCoste);
        service.save(totalOnSite);

        // Riesgo
        Riesgo riesgo = new Riesgo();
        riesgo.setNombre("Horas de Contingencia");
        riesgo.setNum(horasContingencia);

        service.save(riesgo);

    }

}
