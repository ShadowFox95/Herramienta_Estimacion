package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.becarios.proyecto_definitivo.dto.criterios.TablasEditDto;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.service.criterios.ModuleService;
import com.becarios.proyecto_definitivo.web.controller.ControladorPrincipal;

@Controller
public class ControladorCriterios {

    private String show = "";

    private String notification = "";
    private String notificationType = "info";

    @Autowired
    private ModuleService moduleService;

    // Show main page
    @RequestMapping(value = "/criteriosAjax", method = RequestMethod.POST)
    public @ResponseBody List<CasosDeUso> showTables(ModelMap model) {
        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(ControladorPrincipal.idProyecto);
    }

    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public @ResponseBody List<CasosDeUso> addRowAjax(ModelMap model) {

        moduleService.createModulo(ControladorPrincipal.idProyecto);

        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(ControladorPrincipal.idProyecto);

    }

    @RequestMapping(value = "/criterios/saveRow/{idToSave}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<CasosDeUso> saveRowAjax(@PathVariable("idToSave") String code,
            @RequestBody TablasEditDto data) {

        moduleService.editTable(ControladorPrincipal.idProyecto, Integer.parseInt(code), data);
        return moduleService.findAllModulo(ControladorPrincipal.idProyecto);
    }

    @RequestMapping(value = "/criterios/delete/{idToDelete}", method = RequestMethod.DELETE)
    public @ResponseBody List<CasosDeUso> deleteRowAjax(ModelMap model, @PathVariable("idToDelete") int id) {
        moduleService.deleteModuloByCode(id, ControladorPrincipal.idProyecto); // Cambiar
                                                                               // "0"
                                                                               // por
                                                                               // idproyecto

        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(ControladorPrincipal.idProyecto);
    }

    @RequestMapping(value = "/criterios/edit/{idToEdit}", method = RequestMethod.POST)
    @ResponseBody
    public List<Object> editRowAjax(ModelMap model, @PathVariable("idToEdit") int id) {
        List<Object> lista = moduleService.findAllTablas(id);
        return lista;
    }

    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model) {
        // Cambiar '0' a 'id'
        List<CasosDeUso> rows = moduleService.findAllModulo(0);

        model.addAttribute("modules", rows);

        model.addAttribute("display", show);

        // Notifications
        if (!notification.isEmpty()) {
            model.addAttribute("altype", notificationType);
            model.addAttribute("notification", notification);
            notification = "";
        }

        // Loads default row when empty
        if (rows.isEmpty()) {
            // moduleService.AddModulo(idProyecto, code, caseOfUse, name,
            // perfilesTotal, perfilesNro, perfilesComplejidad,
            // vistaTotal, vistaNro, vistaCampos, vistaComplejidad,
            // vistaListados, vistaBotones,
            // negocioTotal, negocioNro, negocioLogica,
            // persistenciaTotal, persistenciaNro, persistenciaAccesos,
            // cuTotal, cuDificultad, integracionTotal, integracionNro,
            // integracionComplejidad)
        }

        return "forward:/factores-ajuste";

    }

    // Displays the error message if the code it's not unique
    @RequestMapping(value = "/criterios/ErrorSaveRow", method = RequestMethod.GET)
    public String ErrorSaveRow(ModelMap model) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. El codigo esta repetido";
        return "redirect:/";
    }

    @RequestMapping(value = "/criterios/ErrorSaveData", method = RequestMethod.GET)
    public String ErrorSaveData(ModelMap model) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo más tarde";
        return "redirect:/";
    }

    @RequestMapping(value = "/criterios/ErrorSaveNull", method = RequestMethod.GET)
    public String ErrorSaveNull(ModelMap model) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo válido";
        return "redirect:/";
    }

}