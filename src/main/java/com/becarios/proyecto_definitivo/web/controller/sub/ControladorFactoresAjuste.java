package com.becarios.proyecto_definitivo.web.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.becarios.proyecto_definitivo.dto.factores_ajuste.FactoresSaveDto;
import com.becarios.proyecto_definitivo.service.factores_ajuste.FactoresAjusteService;
import com.becarios.proyecto_definitivo.web.controller.ControladorPrincipal;

@Controller
public class ControladorFactoresAjuste {

    // Servicio de FactoresAjuste
    @Autowired
    private FactoresAjusteService service;

    @RequestMapping(value = "/factores-ajuste", method = RequestMethod.GET)
    public String index(ModelMap model) {

        model.addAttribute("id", 600);

        return "forward:/horas-costes";

    }

    @RequestMapping(value = "/factores/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void saveFactores(@RequestBody FactoresSaveDto data) {
        int idProyecto = ControladorPrincipal.idProyecto;
        // FactorAjuste
        data.getFactorAjuste().setIdProyecto(idProyecto);
        service.saveFactorAjuste(data.getFactorAjuste());

        // ComplejidadTecnica
        data.getFactorComplejidadTecnica1().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica1());

        data.getFactorComplejidadTecnica2().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica2());

        data.getFactorComplejidadTecnica3().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica3());

        data.getFactorComplejidadTecnica4().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica4());

        data.getFactorComplejidadTecnica5().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica5());

        // ArquitecturaReferencia
        data.getArquitecturaReferencia1().getId().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia1());

        data.getArquitecturaReferencia2().getId().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia2());

        data.getArquitecturaReferencia3().getId().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia3());

        data.getArquitecturaReferencia4().getId().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia4());

        // Complejidad Ambiental
        data.getFactorComplejidadAmbiental1().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental1());

        data.getFactorComplejidadAmbiental2().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental2());

        data.getFactorComplejidadAmbiental3().getId().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental3());

    }

    /*
     * @RequestMapping(value = "/factores-ajuste/{id}/save", method =
     * RequestMethod.GET) public String save(@PathVariable("id") int id) { //
     * Clase FactoresAjuste FactorComplejidadTecnica rendimiento = new
     * FactorComplejidadTecnica(); rendimiento.setIdProyecto(1);
     * rendimiento.setNombre("rendimiento"); rendimiento.setAplica(true);
     * rendimiento.setGradoDefinicion(1); rendimiento.setGradoExigencia(1);
     * rendimiento.setImpacto(1); rendimiento.setRiesgo(1);
     * service.save(rendimiento);
     * 
     * 
     * ArquitecturaReferencia solucion = new ArquitecturaReferencia();
     * solucion.setIdProyecto(1); solucion.setNombre("solucion");
     * solucion.setAplica(true); solucion.setDefinido(true);
     * solucion.setGradoConocimento(1); solucion.setImpacto(1);
     * solucion.setRiesgo(1); service.save(solucion);
     * 
     * FactorComplejidadAmbiental experiencia = new
     * FactorComplejidadAmbiental(); experiencia.setIdProyecto(1);
     * experiencia.setNombre("experiencia"); experiencia.setValoracion(1);
     * experiencia.setFactorCalculado(1); service.save(experiencia);
     * 
     * return "redirect:/"; }
     */
}
