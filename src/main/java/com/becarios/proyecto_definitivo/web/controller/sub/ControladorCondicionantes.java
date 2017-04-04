package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.becarios.proyecto_definitivo.dto.condicionantes.CondicionantesDto;
import com.becarios.proyecto_definitivo.dto.condicionantes.CondicionantesIdDto;
import com.becarios.proyecto_definitivo.model.condicionantes.Condicionantes;
import com.becarios.proyecto_definitivo.model.condicionantes.CondicionantesId;
import com.becarios.proyecto_definitivo.service.condicionantes.CondicionantesService;

@Controller
public class ControladorCondicionantes {

    @Autowired
    CondicionantesService condicionantesService;

    CondicionantesDto condicionantesActual;

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

    private void passCondicionantesToDto(Condicionantes condicionantes) {
        condicionantesActual
                .setId(new CondicionantesIdDto(condicionantes.getId().getId(), condicionantes.getId().getIdProyecto()));
        condicionantesActual.setDescripcion(condicionantes.getDescripcion());
        condicionantesActual.setEstimacion(condicionantes.isEstimacion());
    }

    private void passDtoToCondicionantes(Condicionantes condicionantes) {
        condicionantes.setId(new CondicionantesId(condicionantesActual.getId().getId(),
                condicionantesActual.getId().getIdProyecto()));
        condicionantes.setDescripcion(condicionantesActual.getDescripcion());
        condicionantes.setEstimacion(condicionantes.isEstimacion());
    }
}
