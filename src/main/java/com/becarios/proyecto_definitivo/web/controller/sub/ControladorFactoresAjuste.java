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

import com.becarios.proyecto_definitivo.dto.factores_ajuste.FactoresSaveDto;
import com.becarios.proyecto_definitivo.model.factores_ajustes.ArquitecturaReferencia;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadAmbiental;
import com.becarios.proyecto_definitivo.model.factores_ajustes.FactorComplejidadTecnica;
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
        data.getFactorComplejidadTecnica1().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica1());

        data.getFactorComplejidadTecnica2().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica2());

        data.getFactorComplejidadTecnica3().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica3());

        data.getFactorComplejidadTecnica4().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica4());

        data.getFactorComplejidadTecnica5().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadTecnica5());

        // ArquitecturaReferencia
        data.getArquitecturaReferencia1().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia1());

        data.getArquitecturaReferencia2().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia2());

        data.getArquitecturaReferencia3().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia3());

        data.getArquitecturaReferencia4().setIdProyecto(idProyecto);
        service.save(data.getArquitecturaReferencia4());

        // Complejidad Ambiental
        data.getFactorComplejidadAmbiental1().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental1());

        data.getFactorComplejidadAmbiental2().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental2());

        data.getFactorComplejidadAmbiental3().setIdProyecto(idProyecto);
        service.save(data.getFactorComplejidadAmbiental3());

    }

    /*
     * @RequestMapping(value = "/factores-ajuste/save/{idToSave}", method =
     * RequestMethod.GET) public List<FactorAjuste>
     * save(@RequestParam("idToSave") int id) { FactorAjuste row= new
     * FactorAjuste(1,1); service.save(row);
     * 
     * // Cambiar '0' por 'idProyecto' return service.findFactoresAjusteById(1);
     * 
     * }
     */

    // @RequestMapping(value = "/factores-ajuste/{id}/", method =
    // RequestMethod.GET)
    // public String index(ModelMap model, @PathVariable("id") int id) {
    //
    // model.addAttribute("idProyecto", id);
    //
    // return "factores-ajuste/factores-ajuste";
    // }

    @RequestMapping(value = "/factores-ajuste/{id}/save", method = RequestMethod.GET)
    public String save(@PathVariable("id") int id)
    /*
     * @RequestParam("rendimiento_aplica") boolean rendimientoAplica,
     * 
     * @RequestParam("rendimiento_definicion") int rendimientoDefinicion,
     * 
     * @RequestParam("rendimiento_exigencia") int rendimientoExigencia,
     * 
     * @RequestParam("rendimiento_impacto") int rendimientoImpacto,
     * 
     * @RequestParam("rendimiento_riesgo") int rendimientoRiesgo,
     * 
     * @RequestParam("usabilidad_aplica") boolean usabilidadAplica,
     * 
     * @RequestParam("usabilidad_definicion") int usabilidadDefinicion,
     * 
     * @RequestParam("usabilidad_exigencia") int usabilidadExigencia,
     * 
     * @RequestParam("usabilidad_impacto") int usabilidadImpacto,
     * 
     * @RequestParam("usabilidad_riesgo") int usabilidadRiesgo,
     * 
     * @RequestParam("portabilidad_aplica") boolean portabilidadAplica,
     * 
     * @RequestParam("portabilidad_definicion") int portabilidadDefinicion,
     * 
     * @RequestParam("portabilidad_exigencia") int portabilidadExigencia,
     * 
     * @RequestParam("portabilidad_impacto") int portabilidadImpacto,
     * 
     * @RequestParam("portabilidad_riesgo") int portabilidadRiesgo,
     * 
     * @RequestParam("concurrencia_aplica") boolean concurrenciaAplica,
     * 
     * @RequestParam("concurrencia_definicion") int concurrenciaDefinicion,
     * 
     * @RequestParam("concurrencia_exigencia") int concurrenciaExigencia,
     * 
     * @RequestParam("concurrencia_impacto") int concurrenciaImpacto,
     * 
     * @RequestParam("concurrencia_riesgo") int concurrenciaRiesgo,
     * 
     * @RequestParam("seguridad_aplica") boolean seguridadAplica,
     * 
     * @RequestParam("seguridad_definicion") int seguridadDefinicion,
     * 
     * @RequestParam("seguridad_exigencia") int seguridadExigencia,
     * 
     * @RequestParam("seguridad_impacto") int seguridadImpacto,
     * 
     * @RequestParam("seguridad_riesgo") int seguridadRiesgo,
     * 
     * @RequestParam("solucion_aplica") boolean solucionAplica,
     * 
     * @RequestParam("solucion_definido") boolean solucionDefinido,
     * 
     * @RequestParam("solucion_conocimiento") int solucionConocimiento,
     * 
     * @RequestParam("solucion_impacto") int
     * solucionImpacto, @RequestParam("solucion_riesgo") int solucionRiesgo,
     * 
     * @RequestParam("integracion_aplica") boolean integracionAplica,
     * 
     * @RequestParam("integracion_definido") boolean integracionDefinido,
     * 
     * @RequestParam("integracion_conocimiento") int integracionConocimiento,
     * 
     * @RequestParam("integracion_impacto") int integracionImpacto,
     * 
     * @RequestParam("integracion_riesgo") int integracionRiesgo,
     * 
     * @RequestParam("logica_aplica") boolean logicaAplica,
     * 
     * @RequestParam("logica_definido") boolean logicaDefinido,
     * 
     * @RequestParam("logica_conocimiento") int logicaConocimiento,
     * 
     * @RequestParam("logica_impacto") int
     * logicaImpacto, @RequestParam("logica_riesgo") int logicaRiesgo,
     * 
     * @RequestParam("despliegue_aplica") boolean despliegueAplica,
     * 
     * @RequestParam("despliegue_definido") boolean despliegueDefinido,
     * 
     * @RequestParam("despliegue_conocimiento") int despliegueConocimiento,
     * 
     * @RequestParam("despliegue_impacto") int despliegueImpacto,
     * 
     * @RequestParam("despliegue_riesgo") int despliegueRiesgo,
     * 
     * @RequestParam("experiencia_valoracion") int experienciaValoracion,
     * 
     * @RequestParam("experiencia_calculado") int experienciaFactorCalculado,
     * 
     * @RequestParam("capacidades_valoracion") int capacidadesValoracion,
     * 
     * @RequestParam("capacidades_calculado") int capacidadesFactorCalculado,
     * 
     * @RequestParam("calidad_valoracion") int calidadValoracion,
     * 
     * @RequestParam("calidad_calculado") int calidadFactorCalculado
     */
    {

        // Clase FactoresAjuste
        FactorComplejidadTecnica rendimiento = new FactorComplejidadTecnica();
        rendimiento.setIdProyecto(1);
        rendimiento.setNombre("rendimiento");
        rendimiento.setAplica(true);
        rendimiento.setGradoDefinicion(1);
        rendimiento.setGradoExigencia(1);
        rendimiento.setImpacto(1);
        rendimiento.setRiesgo(1);
        service.save(rendimiento);

        /*
         * FactorComplejidadTecnica usabilidad = new FactorComplejidadTecnica();
         * usabilidad.setIdProyecto(1); usabilidad.setNombre("usabilidad");
         * usabilidad.setAplica(usabilidadAplica);
         * usabilidad.setGradoDefinicion(usabilidadDefinicion);
         * usabilidad.setGradoExigencia(usabilidadExigencia);
         * usabilidad.setImpacto(usabilidadImpacto);
         * usabilidad.setRiesgo(usabilidadRiesgo); falta un
         * service-save(usabilidad y en las demas igual, solo guardare una de
         * cada 3/3)
         * 
         * 
         * FactorComplejidadTecnica portabilidad = new
         * FactorComplejidadTecnica(); portabilidad.setIdProyecto(1);
         * portabilidad.setNombre("portabilidad");
         * portabilidad.setAplica(rendimientoAplica);
         * portabilidad.setGradoDefinicion(portabilidadDefinicion);
         * portabilidad.setImpacto(portabilidadImpacto);
         * portabilidad.setRiesgo(portabilidadRiesgo);
         * 
         * 
         * FactorComplejidadTecnica concurrencia = new
         * FactorComplejidadTecnica(); concurrencia.setIdProyecto(1);
         * concurrencia.setNombre("concurrencia");
         * concurrencia.setAplica(concurrenciaAplica);
         * concurrencia.setGradoDefinicion(concurrenciaDefinicion);
         * concurrencia.setGradoExigencia(concurrenciaExigencia);
         * concurrencia.setImpacto(concurrenciaImpacto);
         * concurrencia.setRiesgo(concurrenciaRiesgo);
         * 
         * 
         * FactorComplejidadTecnica seguridad = new FactorComplejidadTecnica();
         * seguridad.setIdProyecto(1); seguridad.setNombre("seguridad");
         * seguridad.setAplica(seguridadAplica);
         * seguridad.setGradoDefinicion(seguridadDefinicion);
         * seguridad.setGradoExigencia(seguridadExigencia);
         * seguridad.setImpacto(seguridadImpacto);
         * seguridad.setRiesgo(seguridadRiesgo);
         */

        ArquitecturaReferencia solucion = new ArquitecturaReferencia();
        solucion.setIdProyecto(1);
        solucion.setNombre("solucion");
        solucion.setAplica(true);
        solucion.setDefinido(true);
        solucion.setGradoConocimento(1);
        solucion.setImpacto(1);
        solucion.setRiesgo(1);
        service.save(solucion);

        /*
         * ArquitecturaReferencia integracion = new ArquitecturaReferencia();
         * integracion.setIdProyecto(1); integracion.setNombre("integracion");
         * integracion.setAplica(integracionAplica);
         * integracion.setDefinido(integracionDefinido);
         * integracion.setGradoConocimento(integracionConocimiento);
         * integracion.setImpacto(integracionImpacto);
         * integracion.setRiesgo(integracionRiesgo);
         * 
         * 
         * ArquitecturaReferencia logica = new ArquitecturaReferencia();
         * logica.setIdProyecto(1); logica.setNombre("logica");
         * logica.setAplica(logicaAplica); logica.setDefinido(logicaDefinido);
         * logica.setGradoConocimento(logicaConocimiento);
         * logica.setImpacto(logicaImpacto); logica.setRiesgo(logicaRiesgo);
         * 
         * 
         * ArquitecturaReferencia despliegue = new ArquitecturaReferencia();
         * despliegue.setIdProyecto(1); despliegue.setNombre("despliegue");
         * despliegue.setAplica(despliegueAplica);
         * despliegue.setDefinido(despliegueDefinido);
         * despliegue.setGradoConocimento(despliegueConocimiento);
         * despliegue.setImpacto(despliegueImpacto);
         * despliegue.setRiesgo(despliegueRiesgo);
         * 
         */

        FactorComplejidadAmbiental experiencia = new FactorComplejidadAmbiental();
        experiencia.setIdProyecto(1);
        experiencia.setNombre("experiencia");
        experiencia.setValoracion(1);
        experiencia.setFactorCalculado(1);
        service.save(experiencia);

        /*
         * FactorComplejidadAmbiental capacidades = new
         * FactorComplejidadAmbiental(); capacidades.setIdProyecto(id);
         * capacidades.setNombre("capacidade s");
         * capacidades.setValoracion(capacidadesValoracion);
         * capacidades.setFactorCalculado(capacidadesFactorCalculado);
         * 
         * 
         * FactorComplejidadAmbiental calidad = new
         * FactorComplejidadAmbiental(); calidad.setIdProyecto(1);
         * calidad.setNombre("calidad");
         * calidad.setValoracion(calidadValoracion);
         * calidad.setFactorCalculado(calidadFactorCalculado);
         */

        return "redirect:/";
    }
}
