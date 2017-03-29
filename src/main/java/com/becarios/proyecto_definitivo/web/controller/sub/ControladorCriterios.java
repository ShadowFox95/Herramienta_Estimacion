package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.becarios.proyecto_definitivo.model.Proyecto;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.service.criterios.ModuleService;

@Controller
public class ControladorCriterios {

    @Autowired
    private String show = "";

    private String codigo;
    private String notification = "";
    private String notificationType = "info";

    @Autowired
    private ModuleService moduleService;

    // Show main page
    @RequestMapping(value = "/testing", method = RequestMethod.POST)
    public @ResponseBody List<CasosDeUso> showTables(ModelMap model) {
        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(0);
    }

    @RequestMapping(value = "/testing/addRow", method = RequestMethod.POST)
    public @ResponseBody List<CasosDeUso> addRowAjax(ModelMap model) {
        
        //añadir parametros de addmodulo        
        moduleService.AddModulo(idProyecto, code, caseOfUse, name, 
                perfilesTotal, perfilesNro, perfilesComplejidad, 
                vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, vistaBotones, 
                negocioTotal, negocioNro, negocioLogica, 
                persistenciaTotal, persistenciaNro, persistenciaAccesos, 
                cuTotal, cuDificultad, 
                integracionTotal, integracionNro, integracionComplejidad)

        //Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(0);
    }

    @RequestMapping(value = "/testing/saveRow/{idToSave}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<CasosDeUso> saveRowAjax(ModelMap model, @PathVariable("idToSave") String code,
            @RequestBody CasosDeUso data) {
        moduleService.saveModulo(data);

        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(0);

    }

    @RequestMapping(value = "/testing/delete/{idToDelete}", method = RequestMethod.DELETE)
    public @ResponseBody List<CasosDeUso> deleteRowAjax(ModelMap model, @PathVariable("idToDelete") int id) {

        moduleService.deleteModuloByCode(id);

        // Cambiar '0' por 'idProyecto'
        return moduleService.findAllModulo(0);
    }

    @RequestMapping(value = "/testing/edit", method = RequestMethod.PUT)

    @ResponseBody
    public List<Object> editRowAjax(ModelMap model) {
        CasosDeUso row = new CasosDeUso();
        moduleService.updateModulo(row);
        // Cambiar '0' por 'id'
        return moduleService.findAllTablas(0);
    }

    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model) {
        // Cambiar '0' a 'id'
        List<CasosDeUso> rows = moduleService.findAllModulo(0);

        model.addAttribute("modules", rows);
        
//        if (!show.isEmpty()) {
//             model.addAttribute("perfiles", tablasTemp.get(0));
//             model.addAttribute("vista", tablasTemp.get(1));
//             model.addAttribute("negocio", tablasTemp.get(2));
//             model.addAttribute("persistencia", tablasTemp.get(3));
//
//            if (true) { /* proyecto.isEditado() */
//                 model.addAttribute("cu", tablasTemp.get(4));
//            }
//
//             model.addAttribute("integracion", tablasTemp.get(5));
//        }
        
        model.addAttribute("display", show);

        // Notifications
        if (!notification.isEmpty()) {
            model.addAttribute("altype", notificationType);
            model.addAttribute("notification", notification);
            notification = "";
        }

        // Loads default row when empty
        if (rows.isEmpty()) {
            moduleService.AddModulo(idProyecto, code, caseOfUse, name, 
                    perfilesTotal, perfilesNro, perfilesComplejidad, 
                    vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, vistaBotones, 
                    negocioTotal, negocioNro, negocioLogica, 
                    persistenciaTotal, persistenciaNro, persistenciaAccesos, 
                    cuTotal, cuDificultad, integracionTotal, integracionNro, integracionComplejidad)
        }

        return "forward:/factores-ajuste";

    }

    // saves the name changes
    @RequestMapping(value = "/criterios/saveRow", method = RequestMethod.POST)
    public String saveRow(@RequestParam("moduleCode") String code, @RequestParam("moduleName") String name,
            @RequestParam("moduleCaseOfUse") String caseOfUse, @RequestParam("perfilesTotal") int perfilesTotal,
            @RequestParam("perfilesNro") int perfilesNro, @RequestParam("perfilesComplejidad") int perfilesComplejidad,
            @RequestParam("vistaTotal") int vistaTotal, @RequestParam("vistaNro") int vistaNro,
            @RequestParam("vistaCampos") int vistaCampos, @RequestParam("vistaComplejidad") int vistaComplejidad,
            @RequestParam("vistaListados") int vistaListados, @RequestParam("vistaBotones") int vistaBotones,
            @RequestParam("negocioTotal") int negocioTotal, @RequestParam("negocioNro") int negocioNro,
            @RequestParam("negocioLogica") int negocioLogica, @RequestParam("persistenciaTotal") int persistenciaTotal,
            @RequestParam("persistenciaNro") int persistenciaNro,
            @RequestParam("persistenciaAccesos") int persistenciaAccesos,
            @RequestParam(value = "cuTotal", defaultValue = "0") int cuTotal,
            @RequestParam(value = "cuDificultad", defaultValue = "0") int cuDificultad,
            @RequestParam("integracionTotal") int integracionTotal,
            @RequestParam("integracionComplejidad") int integracionComplejidad,
            @RequestParam("integracionNro") int integracionNro) {

        int index = 0;
        code = code.trim();
        if (code.equals("")) {
            return "redirect:/criterios/ErrorSaveNull";
        }

        // if (!proyecto.GuardarDatos(codigo, perfilesTotal, perfilesNro,
        // perfilesComplejidad, vistaTotal, vistaNro,
        // vistaCampos, vistaComplejidad, vistaListados, vistaBotones,
        // negocioTotal, negocioNro, negocioLogica,
        // persistenciaTotal, persistenciaNro, persistenciaAccesos, cuTotal,
        // cuDificultad, integracionTotal,
        // integracionNro, integracionComplejidad)) {

        // } else {
        // proyecto.CalcularTotal(codigo, perfilesTotal, vistaTotal,
        // negocioTotal, persistenciaTotal, cuTotal,
        // integracionTotal);
        // }
        // rows.get(index).apply(code, name, caseOfUse);

        show = "";

        notificationType = "info";
        notification = "Se han aplicado los cambios";

        return "redirect:/";
    }

    // discard changes
    @RequestMapping(value = "/criterios/discard", method = RequestMethod.POST)
    public String discard() {
        // Desplazar a clase para modelo por defecto
        show = "";
        notificationType = "info";
        notification = "Se han descartado los cambios";
        return "redirect:/";
    }

    // Adds a table row
    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto

        return "redirect:/";
    }

    // Delete a table row
    @RequestMapping(value = "/criterios/{code}/delete", method = RequestMethod.GET)
    public String deleteRow(@PathVariable("code") String code) {
        // Desplazar a otra clase
        CasosDeUso row = new CasosDeUso();
        int c = 0;

        show = "";
        notificationType = "info";
        notification = "Módulo " + code + " eliminada correctamente";
        return "redirect:/";

    }

    @RequestMapping(value = "/criterios/{code}/edit", method = RequestMethod.POST)
    public String editRow(@PathVariable("code") String code) {
        show = code;
        CasosDeUso row = new CasosDeUso();
        int c = 0;

        codigo = code;
        return "redirect:/";

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