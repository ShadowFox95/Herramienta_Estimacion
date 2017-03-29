package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.model.condicionantes.Condicionantes;
import com.becarios.proyecto_definitivo.service.condicionantes.CondicionantesService;

@Controller
public class ControladorCondicionantes {

    @Autowired
    CondicionantesService condicionantesService;

    @RequestMapping(value = "/condicionantes", method = RequestMethod.GET)
    public String index(ModelMap model) {
        // Cambiar '0' por 'idProyecto'
        model.addAttribute("condicionantes", condicionantesService.findAllCondicionantes(0));
        return "forward:/index";
    }

    @RequestMapping(value = "/condicionantes/save")
    public String save(List<Condicionantes> condicionantes) {
        for (Condicionantes condicionante : condicionantes) {
            condicionantesService.addCondicionantes(condicionante);
        }
        return "redirect:" + "/";
    }

    @RequestMapping(value = "/condicionantes/delete")
    public String delete(int id) {
        condicionantesService.deleteCondicionantes(id);
        return "redirect:" + "/";
    }
}
