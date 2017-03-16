package com.becarios.proyecto_definitivo.web.controller;

<<<<<<< Upstream, based on origin/marius
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
    public static int idProyecto=1;
    
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
=======
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.model.Proyecto;

@Controller
public class ControladorPrincipal {

    private List<Proyecto> proyectos = new ArrayList<Proyecto>();
    private boolean first = true;
    private String control = "";

    // Redirect to main page
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect(ModelMap model) {
        if (first) {
            proyectos.add(new Proyecto("Proyecto de Prueba", 0, "Lorem ipsum"));
            first = false;
        }
        model.addAttribute("proyectos", proyectos);
        model.addAttribute("control", control);
        return "/index";

    }

    @RequestMapping(value = "/{code}/delete", method = RequestMethod.POST)
    public String deleteRow(@PathVariable("code") String code) {
        // Desplazar a otra clase
        int a = -1;
        for (int i = 0; i < proyectos.size(); i++) {
            if (code.equals(proyectos.get(i).getCodigo())) {
                a = i;
            }
        }
        if (a > -1) {
            proyectos.remove(a);
        }
        return "redirect:/";

    }

    @RequestMapping(value = "/addProject", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto
        proyectos.add(new Proyecto("Proyecto de Prueba", (proyectos.get(proyectos.size() - 1).getCodigo()) + 1,
                "Lorem ipsum"));

        return "redirect:/load";

    }

    @RequestMapping(value = "/{code}/edit", method = RequestMethod.POST)
    public String editRow(ModelMap model, @PathVariable("code") String code) {
        for (int i = 0; i < proyectos.size(); i++) {
            if (code.equals(proyectos.get(i).getCodigo())) {
                model.addAttribute("proyecto", proyectos.get(i));
            }
        }
        return "redirect:/criterios/load/";

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String updateProject(@ModelAttribute("proyecto") Proyecto proyecto) {
        for (int i = 0; i < proyectos.size(); i++) {
            if (proyecto.getCodigo() == (proyectos.get(i).getCodigo())) {
                proyectos.set(i, proyecto);
            }
        }
        return "redirect:/";

    }

<<<<<<< Upstream, based on origin/marius
    @RequestMapping(value = "/do/{page}/{operation}")
    public String operate() {
        return "";
>>>>>>> 3f184c8 pp
=======
    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public String load() {
        return "forward:/" + "criterios";
    }

    @RequestMapping(value = "/goto/{page}/{operation}", method = RequestMethod.POST)
    public String operate(@PathVariable("page") String page, @PathVariable("operation") String operation) {
        control = page;
        return "forward:/" + page + "/" + operation + "/";
>>>>>>> 9185c57 restored
    }

}
