package com.becarios.proyecto_definitivo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.dto.ProyectoDto;
import com.becarios.proyecto_definitivo.model.Proyecto;
import com.becarios.proyecto_definitivo.service.ProjectService;

@Controller
public class ControladorPrincipal {

    @Autowired
    ProjectService project;

    private String control = "";

    public static int idProyecto = 1;

    @Autowired
    private static ProyectoDto proyectoActual;

    // Redirect to main page

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect(ModelMap model) {

        model.addAttribute("projectes", project.findAllProjects());

        model.addAttribute("control", control);

        
        return "forward:/criterios";

    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
    	
        return "/index";

    }

    @RequestMapping(value = "/{code}/delete", method = RequestMethod.POST)
    public String deleteRow(@PathVariable("code") int id) {
        // Desplazar a otra clase
        project.deleteProjectByCode(id);
        return "redirect:/";

    }

    @RequestMapping(value = "/addProject", method = RequestMethod.GET)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto

        project.AddProject("Nombre", "Codigo", "Descripcion", false);

        control = "proyecto";
        return "redirect:/";

    }

    @RequestMapping(value = "/saveProject", method = RequestMethod.POST)
    public String updateProject(@ModelAttribute("proyecto") Proyecto proyecto) {
        project.saveProject(proyecto);
        return "redirect:/";

    }

    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public String load() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/goto/{page}/{operation}", method = RequestMethod.POST)
    public String operate(@PathVariable("page") String page, @PathVariable("operation") String operation) {
        control = page;
        return "forward:/" + page + "/" + operation + "/";
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String config(ModelMap model) {
        control = "config";
        return "forward:/";
    }

    @RequestMapping(value = "/return", method = RequestMethod.POST)
    public String volver(ModelMap model) {
        control = "proyecto";
        return "redirect:/";
    }

    private void passProyectoToDto(Proyecto proyecto) {
        proyectoActual.setId(proyecto.getId());
        proyectoActual.setCodigoProyecto(proyecto.getCodigoProyecto());
        proyectoActual.setNombre(proyecto.getNombre());
        proyectoActual.setDescripcion(proyecto.getDescripcion());
        proyectoActual.setEditado(proyecto.isIsEditado());
    }

    private void passDtoToProyecto(Proyecto proyecto) {
        proyecto.setId(proyectoActual.getId());
        proyecto.setCodigoProyecto(proyectoActual.getCodigoProyecto());
        proyecto.setNombre(proyectoActual.getNombre());
        proyecto.setDescripcion(proyectoActual.getDescripcion());
        proyecto.setIsEditado(proyectoActual.isEditado());
    }
}
