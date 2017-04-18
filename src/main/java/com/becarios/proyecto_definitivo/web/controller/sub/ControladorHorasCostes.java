package com.becarios.proyecto_definitivo.web.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.becarios.proyecto_definitivo.dto.horas_costes.HorasCostesSaveDTO;
import com.becarios.proyecto_definitivo.model.horas_costes.Delivery;
import com.becarios.proyecto_definitivo.model.horas_costes.Deliveryexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestion;
import com.becarios.proyecto_definitivo.model.horas_costes.Gestionexterno;
import com.becarios.proyecto_definitivo.model.horas_costes.Gobierno;
import com.becarios.proyecto_definitivo.model.horas_costes.Riesgo;
import com.becarios.proyecto_definitivo.model.horas_costes.Valoracionfinal;
import com.becarios.proyecto_definitivo.service.horas_costes.HorasCostesService;
import com.becarios.proyecto_definitivo.web.controller.ControladorPrincipal;

@Controller
public class ControladorHorasCostes {

    @Autowired
    private HorasCostesService service;

    @RequestMapping(value = "/horas-costes", method = RequestMethod.GET)
    public String index(ModelMap model) {

        // Cambiar '0' por 'idProyecto'
        service.findDeliveryById(1);
        service.findDeliveryExternoById(1);
        service.findGestionById(1);
        service.findGestionExternoById(1);
        service.findGobiernoById(1);
        service.findGobiernoExternoById(1);
        service.findRiesgoById(1);
        service.findValoracionFinalById(1);
        return "forward:/condicionantes";
    }

    @RequestMapping(value = "/costes/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void saveHorasCostes(@RequestBody HorasCostesSaveDTO data) {
        int idProyecto = ControladorPrincipal.idProyecto;
        data.getRiesgo().setIdProyecto(idProyecto);
        service.saveRiesgo(data.getRiesgo());

        data.getValoracionFinal().setIdProyecto(idProyecto);
        service.saveValoracionFinal(data.getValoracionFinal());

        data.getDelivery1().setIdProyecto(idProyecto);
        data.getDelivery2().setIdProyecto(idProyecto);
        data.getDelivery3().setIdProyecto(idProyecto);
        data.getDelivery4().setIdProyecto(idProyecto);
        data.getDelivery5().setIdProyecto(idProyecto);
        data.getDelivery6().setIdProyecto(idProyecto);

        service.save(data.getDelivery1());
        service.save(data.getDelivery2());
        service.save(data.getDelivery3());
        service.save(data.getDelivery4());
        service.save(data.getDelivery5());
        service.save(data.getDelivery6());

        data.getGestion1().setIdProyecto(idProyecto);
        data.getGestion2().setIdProyecto(idProyecto);
        data.getGestion3().setIdProyecto(idProyecto);

        service.save(data.getGestion1());
        service.save(data.getGestion2());
        service.save(data.getGestion3());

        data.getGobierno1().setIdProyecto(idProyecto);
        data.getGobierno2().setIdProyecto(idProyecto);

        service.save(data.getGobierno1());
        service.save(data.getGobierno2());
    }

    @RequestMapping(value = "/costes/{id}/save", method = RequestMethod.GET)
    public String save(@PathVariable("id") int id)
    // Valoracion Final
    /*
     * @RequestParam("total_adm_horas") int
     * totalADMHoras, @RequestParam("total_adm_coste") int totalADMCoste,
     * 
     * @RequestParam("total_testing_horas") int totalTestingHoras,
     * 
     * @RequestParam("total_testing_coste") int totalTestingCoste,
     * 
     * @RequestParam("total_onsite_horas") int totalOnSiteHoras,
     * 
     * @RequestParam("total_onsite_coste") int totalOnSiteCoste,
     * 
     * @RequestParam("horas_contingencia") int horasContingencia, // Centro
     * ADM-DW
     * 
     * // Delivery
     * 
     * @RequestParam("configuracion_porcentaje") int configuracionPorcentaje,
     * 
     * @RequestParam("configuracion_horas") int configuracionHoras,
     * 
     * @RequestParam("configuracion_coste") int configuracionCoste,
     * 
     * @RequestParam("evaluacion_porcentaje") int evaluacionPorcentaje,
     * 
     * @RequestParam("evaluacion_horas") int evaluacionHoras,
     * 
     * @RequestParam("evaluacion_coste") int evaluacionCoste,
     * 
     * @RequestParam("analisis_porcentaje") int analisisPorcentaje,
     * 
     * @RequestParam("analisis_horas") int analisisHoras,
     * 
     * @RequestParam("analisis_interna_practica") boolean
     * analisisInternaPractica,
     * 
     * @RequestParam("analisis_coste") int analisisCoste,
     * 
     * @RequestParam("design_porcentaje") int
     * designPorcentaje, @RequestParam("design_horas") int designHoras,
     * 
     * @RequestParam("design_coste") int designCoste,
     * 
     * @RequestParam("construccion_porcentaje") int construccionPorcentaje,
     * 
     * @RequestParam("construccion_horas") int construccionHoras,
     * 
     * @RequestParam("construccion_coste") int construccionCoste,
     * 
     * @RequestParam("pruebas_porcentaje") int
     * pruebasPorcentaje, @RequestParam("pruebas_horas") int pruebasHoras,
     * 
     * @RequestParam("pruebas_interna_practica") boolean pruebasInternaPractica,
     * 
     * @RequestParam("pruebas_coste") int pruebasCoste,
     * 
     * // Gestion
     * 
     * @RequestParam("calidad_nivel") int
     * calidadNivel, @RequestParam("calidad_porcentaje") int calidadPorcentaje,
     * 
     * @RequestParam("calidad_interna_practica") boolean calidadInternaPractica,
     * 
     * @RequestParam("calidad_horas") int
     * calidadHoras, @RequestParam("calidad_coste") int calidadCoste,
     * 
     * @RequestParam("seguridad_nivel") int seguridadNivel,
     * 
     * @RequestParam("seguridad_porcentaje") int seguridadPorcentaje,
     * 
     * @RequestParam("seguridad_interna_practica") boolean
     * seguridadInternaPractica,
     * 
     * @RequestParam("seguridad_horas") int
     * seguridadHoras, @RequestParam("seguridad_coste") int seguridadCoste,
     * 
     * @RequestParam("despliegues_nivel") int desplieguesNivel,
     * 
     * @RequestParam("despliegues_porcentaje") int desplieguesPorcentaje,
     * 
     * @RequestParam("despliegues_interna_practica") boolean
     * desplieguesInternaPractica,
     * 
     * @RequestParam("desplieguies_horas") int desplieguesHoras,
     * 
     * @RequestParam("despliegues_coste") int desplieguesCoste,
     * 
     * // Gobierno
     * 
     * @RequestParam("gestion_proyecto_porcentaje") int
     * gestionProyectoPorcentaje,
     * 
     * @RequestParam("gestion_proyecto_interna_practica") boolean
     * gestionProyectoInternaPractica,
     * 
     * @RequestParam("gestion_proyecto_horas") int gestionProyectoHoras,
     * 
     * @RequestParam("gestion_proyecto_coste") int gestionProyectoCoste,
     * 
     * @RequestParam("gestion_dm_porcentaje") int gestionDmPorcentaje,
     * 
     * @RequestParam("gestion_dm_interna_practica") boolean
     * gestionDmInternaPractica,
     * 
     * @RequestParam("gestion_dm_horas") int
     * gestionDmHoras, @RequestParam("gestion_dm_coste") int gestionDmCoste,
     * 
     * // Externo a ADM-DW
     * 
     * // Delivery
     * 
     * @RequestParam("testing_ext_porcentaje") int testingExtPorcentaje,
     * 
     * @RequestParam("testing_ext") int
     * testingExtHoras, @RequestParam("testing_ext_coste") int testingExtCoste,
     * 
     * @RequestParam("analisis_ext_porcentaje") int analisisExtPorcentaje,
     * 
     * @RequestParam("analisis_ext_horas") int AnalisisExtHoras,
     * 
     * @RequestParam("analisis_ext_coste") int AnalisisExtCoste,
     * 
     * // Gestion
     * 
     * @RequestParam("calidad_ext_porcentaje") int calidadExtPorcentaje,
     * 
     * @RequestParam("calidad_ext_horas") int calidadExtHoras,
     * 
     * @RequestParam("calidad_ext_coste") int calidadExtCoste,
     * 
     * @RequestParam("seguridad_ext_porcentaje") int seguridadExtPorcentaje,
     * 
     * @RequestParam("seguridad_ext_horas") int seguridadExtHoras,
     * 
     * @RequestParam("seguridad_ext_coste") int seguridadExtCoste,
     * 
     * @RequestParam("despliegues_ext_porcentaje") int desplieguesExtPorcentaje,
     * 
     * @RequestParam("despliegues_ext_horas") int desplieguesExtHoras,
     * 
     * @RequestParam("despliegues_ext_coste") int desplieguesExtCoste,
     * 
     * // Gobierno
     * 
     * @RequestParam("despliegues_ext_porcentaje") int
     * gestionProyectoExtPorcentaje,
     * 
     * @RequestParam("despliegues_ext_horas") int gestionProyectoExtHoras,
     * 
     * @RequestParam("despliegues_ext_coste") int gestionProyectoExtCoste
     */

    {
        // Centro ADM-DW
        Delivery gestionConfiguracion = new Delivery();
        gestionConfiguracion.setIdProyecto(1);
        gestionConfiguracion.setNombre("Gestión de la configuracion");
        gestionConfiguracion.setPorcentaje(1);
        gestionConfiguracion.setHoras(1);
        gestionConfiguracion.setCoste(1);
        service.save(gestionConfiguracion);

        /*
         * Delivery faseEvaluacion = new Delivery(); faseEvaluacion.setNombre(
         * "Fase de evaluacion y diseño de la arquitectura");
         * faseEvaluacion.setPorcentaje(evaluacionPorcentaje);
         * faseEvaluacion.setHoras(evaluacionHoras);
         * faseEvaluacion.setCoste(evaluacionCoste);
         * service.save(faseEvaluacion);
         * 
         * Delivery FaseAnalisis = new Delivery(); FaseAnalisis.setNombre(
         * "Fase de análisis"); FaseAnalisis.setPorcentaje(analisisPorcentaje);
         * FaseAnalisis.setInternaPractica(analisisInternaPractica);
         * FaseAnalisis.setHoras(analisisHoras);
         * FaseAnalisis.setCoste(analisisCoste); service.save(FaseAnalisis);
         * 
         * Delivery FaseDesign = new Delivery(); FaseDesign.setNombre(
         * "Fase de diseño"); FaseDesign.setPorcentaje(designPorcentaje);
         * FaseDesign.setHoras(designHoras); FaseDesign.setCoste(designCoste);
         * service.save(FaseDesign);
         * 
         * Delivery FaseConstruccion = new Delivery();
         * FaseConstruccion.setNombre("Fase de construccion y pruebas unitarias"
         * ); FaseConstruccion.setPorcentaje(construccionPorcentaje);
         * FaseConstruccion.setHoras(construccionHoras);
         * FaseConstruccion.setCoste(construccionCoste);
         * service.save(FaseConstruccion);
         * 
         * Delivery FasePruebas = new Delivery(); FasePruebas.setNombre(
         * "Fase de pruebas de funcionamiento");
         * FasePruebas.setPorcentaje(pruebasPorcentaje);
         * FasePruebas.setInternaPractica(pruebasInternaPractica);
         * FasePruebas.setHoras(pruebasHoras);
         * FasePruebas.setCoste(pruebasCoste); service.save(FasePruebas);
         */

        // Gestion de la calidad/seguridad/despliegues
        Gestion GestionCalidad = new Gestion();
        GestionCalidad.setIdProyecto(1);
        GestionCalidad.setNombre("Gestión de calidad");
        GestionCalidad.setNivel(1);
        GestionCalidad.setPorcentaje(1);
        GestionCalidad.setInternaPractica(true);
        GestionCalidad.setHoras(1);
        GestionCalidad.setCoste(1);
        service.save(GestionCalidad);

        /*
         * Gestion GestionSeguridad = new Gestion(); GestionSeguridad.setNombre(
         * "Gestión de seguridad"); GestionSeguridad.setNivel(seguridadNivel);
         * GestionSeguridad.setPorcentaje(seguridadPorcentaje);
         * GestionSeguridad.setInternaPractica(seguridadInternaPractica);
         * GestionSeguridad.setHoras(seguridadHoras);
         * GestionSeguridad.setCoste(seguridadCoste);
         * service.save(GestionSeguridad);
         * 
         * Gestion GestionDespliegues = new Gestion();
         * GestionDespliegues.setNombre("Gestión de despliegues");
         * GestionDespliegues.setNivel(desplieguesNivel);
         * GestionDespliegues.setPorcentaje(desplieguesPorcentaje);
         * GestionDespliegues.setInternaPractica(desplieguesInternaPractica);
         * GestionDespliegues.setHoras(desplieguesHoras);
         * GestionDespliegues.setCoste(desplieguesCoste);
         * service.save(GestionDespliegues);
         */

        // Gobierno
        Gobierno GestionProyecto = new Gobierno();
        GestionProyecto.setIdProyecto(1);
        GestionProyecto.setNombre("Gestion del proyecto");
        GestionProyecto.setPorcentaje(1);
        GestionProyecto.setInternaPractica(true);
        GestionProyecto.setHoras(1);
        GestionProyecto.setCoste(1);
        service.save(GestionProyecto);

        /*
         * Gobierno GestionDm = new Gobierno(); GestionDm.setNombre(
         * "Gestion del DM"); GestionDm.setPorcentaje(gestionDmPorcentaje);
         * GestionDm.setInternaPractica(gestionDmInternaPractica);
         * GestionDm.setHoras(gestionDmHoras);
         * GestionDm.setCoste(gestionDmCoste); service.save(GestionDm);
         */

        Deliveryexterno testingExterno = new Deliveryexterno();
        testingExterno.setIdProyecto(1);
        testingExterno.setNombre("Centro de Testing");
        testingExterno.setPorcentaje(1);
        testingExterno.setHoras(1);
        testingExterno.setCoste(1);
        service.save(testingExterno);

        /*
         * Deliveryexterno analisisExterno = new Deliveryexterno();
         * analisisExterno.setIdProyecto(1);
         * analisisExterno.setNombre("Análisis");
         * analisisExterno.setPorcentaje(1); analisisExterno.setHoras(1);
         * analisisExterno.setCoste(1); service.save(analisisExterno);
         */

        Gestionexterno calidadExterno = new Gestionexterno();
        calidadExterno.setIdProyecto(1);
        calidadExterno.setNombre("Gestión de calidad");
        calidadExterno.setPorcentaje(1);
        calidadExterno.setHoras(1);
        calidadExterno.setCoste(1);
        service.save(calidadExterno);

        /*
         * Gestionexterno seguridadExterno = new Gestionexterno();
         * seguridadExterno.setNombre("Gestión de seguridad");
         * seguridadExterno.setPorcentaje(seguridadExtPorcentaje);
         * seguridadExterno.setHoras(seguridadExtHoras);
         * seguridadExterno.setCoste(seguridadExtCoste);
         * service.save(seguridadExterno);
         * 
         * Gestionexterno desplieguesExterno = new Gestionexterno();
         * desplieguesExterno.setNombre("Gestión de despliegues");
         * desplieguesExterno.setPorcentaje(desplieguesExtPorcentaje);
         * desplieguesExterno.setHoras(desplieguesExtHoras);
         * desplieguesExterno.setCoste(desplieguesExtCoste);
         * service.save(desplieguesExterno);
         * 
         * Gobiernoexterno gestionProyectoExterno = new Gobiernoexterno();
         * gestionProyectoExterno.setNombre("Gestión del proyecto");
         * gestionProyectoExterno.setPorcentaje(gestionProyectoExtPorcentaje);
         * gestionProyectoExterno.setHoras(gestionProyectoExtHoras);
         * gestionProyectoExterno.setCoste(gestionProyectoExtCoste);
         * service.save(gestionProyectoExterno);
         */

        // Valoracion Final
        Valoracionfinal totalADM = new Valoracionfinal();
        totalADM.setIdProyecto(1);
        totalADM.setNombre("Total ADM-DW");
        totalADM.setHoras(1);
        totalADM.setCoste(1);
        service.save(totalADM);

        /*
         * Valoracionfinal totalTesting = new Valoracionfinal();
         * totalTesting.setNombre("Total centro de Testing");
         * totalTesting.setHoras(totalTestingHoras);
         * totalTesting.setCoste(totalTestingCoste); service.save(totalTesting);
         * 
         * Valoracionfinal totalOnSite = new Valoracionfinal();
         * totalOnSite.setNombre("Total OnSite");
         * totalOnSite.setHoras(totalOnSiteHoras);
         * totalOnSite.setCoste(totalOnSiteCoste); service.save(totalOnSite);
         */

        // Riesgo
        Riesgo riesgo = new Riesgo();
        riesgo.setIdProyecto(1);
        riesgo.setNombre("Horas de Contingencia");
        riesgo.setNum(1);

        service.save(riesgo);

        return "redirect:/";

    }

}
