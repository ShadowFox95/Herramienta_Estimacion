package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;

import com.becarios.proyecto_definitivo.model.criterios.Tabla;
import com.becarios.proyecto_definitivo.service.criterios.ModuleService;

@Controller
public class ControladorCriterios {

    @Autowired
    ModuleService module;

    private String show = "";
    private String notification = "";
    private String notificationType = "info";

    // Show main page
    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model, @RequestParam("ProjectCode") int idProyecto) {
        // if (!show.isEmpty()) {
        // model.addAttribute("perfiles", tablasTemp.get(0));
        // model.addAttribute("vista", tablasTemp.get(1));
        // model.addAttribute("negocio", tablasTemp.get(2));
        // model.addAttribute("persistencia", tablasTemp.get(3));
        //
        // if (true) { /* proyecto.isEditado() */
        // model.addAttribute("cu", tablasTemp.get(4));
        // }
        // model.addAttribute("integracion", tablasTemp.get(5));
        //
        model.addAttribute("projectCode", idProyecto);
        List<CasosDeUso> modulos = module.findAllModulo(idProyecto);

        model.addAttribute("modules", modulos);

        model.addAttribute("display", show);

        // Notifications
        if (!notification.isEmpty()) {
            model.addAttribute("altype", notificationType);
            model.addAttribute("notification", notification);
            notification = "";
        }

        // Loads default row when empty
        if (modulos.isEmpty()) {
            module.createModulo(idProyecto);
        }

        return "forward:/factores-ajuste";

    }

    // saves the name changes
    @RequestMapping(value = "/criterios/{projectCode}/saveRow", method = RequestMethod.POST)
    public String saveRow(@PathVariable("projectCode") int idProyecto, @RequestParam("ProjectEditado") boolean editado,
            @RequestParam("moduleId") int id, @RequestParam("moduleCode") String code,
            @RequestParam("moduleName") String name, @RequestParam("moduleCaseOfUse") String caseOfUse,
            @RequestParam("perfilesTotal") int perfilesTotal, @RequestParam("perfilesNro") int perfilesNro,
            @RequestParam("perfilesComplejidad") int perfilesComplejidad, @RequestParam("vistaTotal") int vistaTotal,
            @RequestParam("vistaNro") int vistaNro, @RequestParam("vistaCampos") int vistaCampos,
            @RequestParam("vistaComplejidad") int vistaComplejidad, @RequestParam("vistaListados") int vistaListados,
            @RequestParam("vistaBotones") int vistaBotones, @RequestParam("negocioTotal") int negocioTotal,
            @RequestParam("negocioNro") int negocioNro, @RequestParam("negocioLogica") int negocioLogica,
            @RequestParam("persistenciaTotal") int persistenciaTotal,
            @RequestParam("persistenciaNro") int persistenciaNro,
            @RequestParam("persistenciaAccesos") int persistenciaAccesos,
            @RequestParam(value = "cuTotal", defaultValue = "0") int cuTotal,
            @RequestParam(value = "cuDificultad", defaultValue = "0") int cuDificultad,
            @RequestParam("integracionTotal") int integracionTotal,
            @RequestParam("integracionComplejidad") int integracionComplejidad,
            @RequestParam("integracionNro") int integracionNro) {

        code = code.trim();
        if (code.equals("")) {
            return "redirect:/criterios/" + idProyecto + "/ErrorSaveNull";
        }

        if (!module.AddModulo(idProyecto, id, code, caseOfUse, name, perfilesTotal, perfilesNro, perfilesComplejidad,
                vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, vistaBotones, negocioTotal,
                negocioNro, negocioLogica, persistenciaTotal, persistenciaNro, persistenciaAccesos, cuTotal,
                cuDificultad, integracionTotal, integracionNro, integracionComplejidad)) {

            return "redirect:/criterios/" + idProyecto + "/ErrorSaveData";

        } else {
            // proyecto.CalcularTotal(codigo, perfilesTotal, vistaTotal,
            // negocioTotal, persistenciaTotal, cuTotal,integracionTotal);
        }
        // rows.get(index).apply(code, name, caseOfUse);
        // proyecto.setRows(rows);
        show = "";

        notificationType = "info";
        notification = "Se han aplicado los cambios";

        return "redirect:/load";

    }

    // discard changes
    @RequestMapping(value = "/criterios/discard", method = RequestMethod.POST)
    public String discard() {
        // Desplazar a clase para modelo por defecto
        show = "";
        notificationType = "info";
        notification = "Se han descartado los cambios";

        return "redirect:/load";
    }

    // Adds a table row
    @RequestMapping(value = "/criterios/{projectCode}/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model, @PathVariable("projectCode") int idProyecto) {

        module.createModulo(idProyecto);

        return "redirect:/load";
    }

    // Delete a table row
    @RequestMapping(value = "/criterios/{projectCode}/delete", method = RequestMethod.GET)
    public String deleteRow(@PathVariable("projectCode") int idProyecto, @PathVariable("code") int id) {
        module.deleteModuloByCode(id);

        show = "";
        notificationType = "info";
        notification = "Módulo " + id + " eliminada correctamente";

        return "redirect:/load";
    }

    // Shows the tables from the module
    @RequestMapping(value = "/criterios/{projectCode}/{code}/edit", method = RequestMethod.POST)
    public String editRow(ModelMap model, @PathVariable("projectCode") int idProyecto,
            @PathVariable("code") String id) {
        show = id;
        List<Tabla> tablasTemp = new ArrayList<Tabla>();
        // tablasTemp = module.findAllTablas(code);

        model.addAttribute("perfiles", tablasTemp.get(0));
        model.addAttribute("vista", tablasTemp.get(1));
        model.addAttribute("negocio", tablasTemp.get(2));
        model.addAttribute("persistencia", tablasTemp.get(3));
        if (true) { /* proyecto.isEditado() */
            model.addAttribute("cu", tablasTemp.get(4));
        }
        model.addAttribute("integracion", tablasTemp.get(5));

        return "redirect:/load";

    }

    // Displays the error message if the code it's not unique
    @RequestMapping(value = "/criterios/{projectCode}/ErrorSaveRow", method = RequestMethod.GET)
    public String ErrorSaveRow(ModelMap model, @PathVariable("projectCode") int idProyecto) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. El codigo esta repetido";
        return "redirect:/load";
    }

    @RequestMapping(value = "/criterios/ErrorSaveData", method = RequestMethod.GET)
    public String ErrorSaveData(ModelMap model) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo más tarde";
        return "redirect:/load";
    }

    @RequestMapping(value = "/criterios/ErrorSaveNull", method = RequestMethod.GET)
    public String ErrorSaveNull(ModelMap model) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo válido";
        return "redirect:/load";
    }
}