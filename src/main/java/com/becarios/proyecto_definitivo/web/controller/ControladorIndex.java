package com.becarios.proyecto_definitivo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.service.ProjectService;

@Controller
public class ControladorIndex {

    @Autowired
    ProjectService project;

    private boolean first = true;

    // Redirect to main page
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect(ModelMap model) {
        return "redirect:/index";

    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        if (first) {
            project.AddProject("Proyecto de Prueba", "Codigo-0", "Lorem ipsum", false);
            first = false;
        }
        model.addAttribute("projectes", project.findAllProjects());

        return "/index";

    }

    @RequestMapping(value = "/index/{code}/delete", method = RequestMethod.POST)
    public String deleteRow(@PathVariable("code") String code) {
        // Desplazar a otra clase
        project.deleteProjectByCode(code);
        return "redirect:/index";

    }

    @RequestMapping(value = "/index/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto
        project.AddProject("Proyecto de Prueba", "Codigo-0", "Lorem ipsum", false);

        return "redirect:/index";
    }

    @RequestMapping(value = "/index/update", method = RequestMethod.GET)
    public String updateProject() {

        return "redirect:/index";

    }

}
