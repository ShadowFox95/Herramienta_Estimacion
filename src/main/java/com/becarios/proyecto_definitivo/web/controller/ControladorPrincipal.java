package com.becarios.proyecto_definitivo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.model.Proyecto;
import com.becarios.proyecto_definitivo.service.ProjectService;

@Controller
public class ControladorPrincipal {

    @Autowired
    ProjectService project;

    private boolean first = true;
    private String control = "";

    // Redirect to main page

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect(ModelMap model) {
        if (first) {
            project.AddProject("Proyecto de Prueba", "Codigo-0", "Lorem ipsum", false);
            first = false;
        }
       // model.addAttribute("projectes", project.findAllProjects());
        //model.addAttribute("control", control);
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
        return "redirect:/";

    }

    @RequestMapping(value = "/cargar/{code}", method = RequestMethod.GET)
    public String editRow(ModelMap model, @PathVariable("code") int id) {
        // module.findtables(id);

        return "forward:/";

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
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

    @RequestMapping(value = "/crear-proyecto", method = RequestMethod.GET)
    public String create() {
        control = "proyecto";
        return "forward:/criterios";
    }

    @RequestMapping(value = "/dev", method = RequestMethod.GET)
    public String index(ModelMap model) {

        return "config/itrs";
    }

}
