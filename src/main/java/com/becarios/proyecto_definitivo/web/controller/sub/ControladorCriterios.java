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

import com.becarios.proyecto_definitivo.model.criterios.Modulo;
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
    @RequestMapping(value = "/criterios/{projectCode}/", method = RequestMethod.GET)
    public String mainTables(ModelMap model, @PathVariable("projectCode") int idProyecto) {

        model.addAttribute("projectCode", idProyecto);

        List<Modulo> modulos = module.findAllModulo(idProyecto);

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

    // saves the changes
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

            return "redirect:/load";

        }

        show = "";

        notificationType = "info";
        notification = "Se han aplicado los cambios";

        return "redirect:/load";
    }

    // discard changes
    @RequestMapping(value = "/criterios/discard", method = RequestMethod.POST)
    public String discard() {
        show = "";
        notificationType = "info";
        notification = "Se han descartado los cambios";
        return "redirect:/load";

    }

    // Adds a table row

    @RequestMapping(value = "/criterios/{projectCode}/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model, @PathVariable("projectCode") int idProyecto) {

        module.createModulo(idProyecto);

        return "redirect:/criterios/" + idProyecto + "/";

    }

    // Delete a table row
    <<<<<<<Upstream,

    based on origin/vista @RequestMapping(value="/criterios/{code}/delete",method=RequestMethod.GET)

    public String deleteRow(@PathVariable("code") String code) {
        // Desplazar a otra clase
        Modulo row = new Modulo();
        int c = 0;
        while (c < rows.size()) {
            row = rows.get(c);
            if (code.equals(row.getCode())) {
                rows.remove(c);
                proyecto.setRows(rows);
            }
            c++;
        }
=======
    @RequestMapping(value = "/criterios/{projectCode}/{code}/delete", method = RequestMethod.POST)
<<<<<<< Upstream, based on origin/vista

    public String deleteRow(@PathVariable("projectCode") String codigoProyecto, @PathVariable("code") String code) {
        module.deleteModuloByCode(code);
>>>>>>> 04b980e DATABASE Configuration Implementation
=======

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

<<<<<<< Upstream, based on origin/vista
        codigo = code;
        return "redirect:/load";
=======
        return "redirect:/criterios/" + codigoProyecto + "/";
>>>>>>> 04b980e DATABASE Configuration Implementation

    }

    // Displays the error message if the code it's not unique
    @RequestMapping(value = "/criterios/{projectCode}/ErrorSaveRow", method = RequestMethod.GET)
    public String ErrorSaveRow(ModelMap model, @PathVariable("projectCode") int codigoProyecto) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. El codigo esta repetido";
<<<<<<< Upstream, based on origin/vista
        return "redirect:/load";
=======
        return "redirect:/criterios/" + codigoProyecto + "/";
>>>>>>> 04b980e DATABASE Configuration Implementation
    }

    @RequestMapping(value = "/criterios/ErrorSaveData", method = RequestMethod.GET)
    public String ErrorSaveData(ModelMap model) {
        notificationType = "danger";
<<<<<<< Upstream, based on origin/vista
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo más tarde";
<<<<<<< Upstream, based on origin/vista
=======
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo mas tarde";

>>>>>>> 4d88fc0 a
        return "redirect:/load";
=======
        return "redirect:/criterios/" + codigoProyecto + "/";
>>>>>>> 04b980e DATABASE Configuration Implementation
    }

    @RequestMapping(value = "/criterios/ErrorSaveNull", method = RequestMethod.GET)
    public String ErrorSaveNull(ModelMap model) {
        notificationType = "danger";
<<<<<<< Upstream, based on origin/vista
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo válido";
<<<<<<< Upstream, based on origin/vista
=======
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo valido";

>>>>>>> 4d88fc0 a
        return "redirect:/load";
=======
        return "redirect:/criterios/" + codigoProyecto + "/";
>>>>>>> 04b980e DATABASE Configuration Implementation
    }
}