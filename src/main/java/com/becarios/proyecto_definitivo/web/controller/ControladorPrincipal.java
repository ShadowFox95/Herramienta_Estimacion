package com.becarios.proyecto_definitivo.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.dto.ProyectoDto;
import com.becarios.proyecto_definitivo.model.Proyecto;

import testing.ReadExcel;

@Controller
public class ControladorPrincipal {

    private List<Proyecto> proyectos = new ArrayList<Proyecto>();
    private boolean first = true;
    private String control = "";
    private ProyectoDto p = new ProyectoDto();

    // Redirect to main page

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect(ModelMap model) {
        if (first) {
            proyectos.add(new Proyecto("Proyecto de Prueba", 0, "Lorem ipsum"));
            first = false;
        }
        try {
            ReadExcel.main();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        model.addAttribute("proyectos", proyectos);
        model.addAttribute("pro", p);
        model.addAttribute("control", control);
        return "forward:/criterios";

    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
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

    @RequestMapping(value = "/addProject", method = RequestMethod.GET)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto
        proyectos.add(new Proyecto("Nuevo Proyecto", (proyectos.get(proyectos.size() - 1).getCodigo()) + 1, ""));
        control = "proyecto";
        return "redirect:/";

    }

    @RequestMapping(value = "/cargar/{code}", method = RequestMethod.GET)
    public String editRow(ModelMap model, @PathVariable("code") int code) {
        for (int i = 0; i < proyectos.size(); i++) {
            if (code == (proyectos.get(i).getCodigo())) {

                p.setCodigo(proyectos.get(i).getCodigo());
                p.setNombre(proyectos.get(i).getNombre());
                p.setDescripcion(proyectos.get(i).getDescripcion());
                p.setEditado(proyectos.get(i).isEditado());
                System.out.println(proyectos.get(i).getDescripcion());
            }
        }
        control = "proyecto";
        return "redirect:/";

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

    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public String load() {
        return "redirect:/";
    }

    @RequestMapping(value = "/goto/{page}/{operation}", method = RequestMethod.POST)
    public String operate(@PathVariable("page") String page, @PathVariable("operation") String operation) {
        control = page;
        return "forward:/" + page + "/" + operation + "/";
    }

    @RequestMapping(value = "/dev", method = RequestMethod.GET)
    public String index(ModelMap model) {

        return "config/itrs";
    }

}
