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

    {
        // Centro ADM-DW
        Delivery gestionConfiguracion = new Delivery();
        gestionConfiguracion.setIdProyecto(1);
        gestionConfiguracion.setNombre("Gestión de la configuracion");
        gestionConfiguracion.setPorcentaje(1);
        gestionConfiguracion.setHoras(1);
        gestionConfiguracion.setCoste(1);
        service.save(gestionConfiguracion);

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
