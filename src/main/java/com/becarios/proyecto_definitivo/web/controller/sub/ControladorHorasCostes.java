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
import com.becarios.proyecto_definitivo.model.horas_costes.ValoracionfinalId;
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
        int idProyecto = 1;
        System.out.println("Esto no esta pagado..."+data.getDelivery1().toString()+"-----------");
        
        data.getRiesgo().setIdProyecto(idProyecto);
        data.getRiesgo().setNombre("Horas de Contingencia");
        service.saveRiesgo(data.getRiesgo());

        data.getValoracionFinal().getId().setIdProyecto(idProyecto);
        data.getValoracionFinal().getId().setNombre("Total ADM-DW");
        service.saveValoracionFinal(data.getValoracionFinal());

        
        System.out.println("Esto no esta pagado..."+data.getDelivery1().toString()+"-----------");
        data.getDelivery1().getId().setIdProyecto(idProyecto);
        System.out.println("Esto no esta pagado..."+data.getDelivery1().toString()+"-----------");
        data.getDelivery1().getId().setNombre("Gestion");
        
        data.getDelivery2().getId().setIdProyecto(idProyecto);
        data.getDelivery2().getId().setNombre("Evaluacion");
        
        data.getDelivery3().getId().setIdProyecto(idProyecto);
        data.getDelivery3().getId().setNombre("Analisis");
        
        data.getDelivery4().getId().setIdProyecto(idProyecto);
        data.getDelivery4().getId().setNombre("DiseÒo");
        
        data.getDelivery5().getId().setIdProyecto(idProyecto);
        data.getDelivery5().getId().setNombre("ConstrucciÛn");
        
        data.getDelivery6().getId().setIdProyecto(idProyecto);
        data.getDelivery6().getId().setNombre("Pruebas");

        service.save(data.getDelivery1());
        service.save(data.getDelivery2());
        service.save(data.getDelivery3());
        service.save(data.getDelivery4());
        service.save(data.getDelivery5());
        service.save(data.getDelivery6());

        
        data.getGestion1().getId().setIdProyecto(idProyecto);
        data.getGestion1().getId().setNombre("Calidad");
        
        data.getGestion2().getId().setIdProyecto(idProyecto);
        data.getGestion2().getId().setNombre("Seguridad");
        
        data.getGestion3().getId().setIdProyecto(idProyecto);
        data.getGestion3().getId().setNombre("Despliegues");

        service.save(data.getGestion1());
        service.save(data.getGestion2());
        service.save(data.getGestion3());

        data.getGobierno1().getId().setIdProyecto(idProyecto);
        data.getGobierno1().getId().setNombre("Proyecto");
        
        data.getGobierno2().getId().setIdProyecto(idProyecto);
        data.getGobierno2().getId().setNombre("DM");

        service.save(data.getGobierno1());
        service.save(data.getGobierno2());
    }

  /*  @RequestMapping(value = "/costes/{id}/save", method = RequestMethod.GET)
    public String save(@PathVariable("id") int id) {
        // Centro ADM-DW
        Delivery gestionConfiguracion = new Delivery();
        gestionConfiguracion.setIdProyecto(1);
        gestionConfiguracion.setNombre("Gesti√≥n de la configuracion");
        gestionConfiguracion.setPorcentaje(1);
        gestionConfiguracion.setHoras(1);
        gestionConfiguracion.setCoste(1);
        service.save(gestionConfiguracion);

        // Gestion de la calidad/seguridad/despliegues
        Gestion GestionCalidad = new Gestion();
        GestionCalidad.setIdProyecto(1);
        GestionCalidad.setNombre("Gesti√≥n de calidad");
        GestionCalidad.setNivel(1);
        GestionCalidad.setPorcentaje(1);
        GestionCalidad.setInternaPractica(true);
        GestionCalidad.setHoras(1);
        GestionCalidad.setCoste(1);
        service.save(GestionCalidad);

        // Gobierno
        Gobierno GestionProyecto = new Gobierno();
        GestionProyecto.setIdProyecto(1);
        GestionProyecto.setNombre("Gestion del proyecto");
        GestionProyecto.setPorcentaje(1);
        GestionProyecto.setInternaPractica(true);
        GestionProyecto.setHoras(1);
        GestionProyecto.setCoste(1);
        service.save(GestionProyecto);

        Deliveryexterno testingExterno = new Deliveryexterno();
        testingExterno.setIdProyecto(1);
        testingExterno.setNombre("Centro de Testing");
        testingExterno.setPorcentaje(1);
        testingExterno.setHoras(1);
        testingExterno.setCoste(1);
        service.save(testingExterno);

        Gestionexterno calidadExterno = new Gestionexterno();
        calidadExterno.setIdProyecto(1);
        calidadExterno.setNombre("Gesti√≥n de calidad");
        calidadExterno.setPorcentaje(1);
        calidadExterno.setHoras(1);
        calidadExterno.setCoste(1);
        service.save(calidadExterno);

        // Valoracion Final
        Valoracionfinal totalADM = new Valoracionfinal();
        totalADM.setIdProyecto(1);
        totalADM.setNombre("Total ADM-DW");
        totalADM.setHoras(1);
        totalADM.setCoste(1);
        service.save(totalADM);

        // Riesgo
        Riesgo riesgo = new Riesgo();
        riesgo.setIdProyecto(1);
        riesgo.setNombre("Horas de Contingencia");
        riesgo.setNum(1);

        service.save(riesgo);

        return "redirect:/";

    }*/

}
