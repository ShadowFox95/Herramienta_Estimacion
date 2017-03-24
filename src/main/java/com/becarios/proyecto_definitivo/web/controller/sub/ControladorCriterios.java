package com.becarios.proyecto_definitivo.web.controller.sub;

import java.util.ArrayList;
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

import com.becarios.proyecto_definitivo.model.Modulo;
import com.becarios.proyecto_definitivo.model.Proyecto;
import com.becarios.proyecto_definitivo.model.Tabla;
import com.becarios.proyecto_definitivo.service.ModuleService;

@Controller
public class ControladorCriterios {
    private Proyecto proyecto = new Proyecto("test", 0, "Descripcion");
    private String show = "";
    private List<Modulo> rows = proyecto.getRows();
    private List<Tabla> tablasTemp = new ArrayList<Tabla>();
    private String codigo;
    private String notification = "";
    private String notificationType = "info";

    @Autowired
    private ModuleService moduleService;

    // Show main page
    @RequestMapping(value = "/testing", method = RequestMethod.POST)
    public @ResponseBody List<Modulo> showTables(ModelMap model) {
        rows = proyecto.getRows();
        return rows;
    }

    @RequestMapping(value = "/testing/addRow", method = RequestMethod.POST)
    public @ResponseBody List<Modulo> addRowAjax(ModelMap model) {
        proyecto.crearModulo();
        rows = proyecto.getRows();
        return rows;
    }

    @RequestMapping(value = "/testing/saveRow/{idToSave}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Modulo> saveRowAjax(ModelMap model, @PathVariable("idToSave") String code,
            @RequestBody Modulo data) {
        System.out.println(data.getTablas().get(0) + " " + "TEST");

        rows = proyecto.getRows();
        return rows;
    }

    @RequestMapping(value = "/testing/delete/{idToDelete}", method = RequestMethod.DELETE)
    public @ResponseBody List<Modulo> deleteRowAjax(ModelMap model, @PathVariable("idToDelete") String code) {
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
        rows = proyecto.getRows();
        return rows;
    }

    /*
     * @RequestMapping(value = "/testing/edit", method = RequestMethod.PUT)
     * 
     * @ResponseBody public List<Tabla> editRowAjax(ModelMap model) { Modulo row
     * = new Modulo(); int c = 0; while (c < rows.size()) { row = rows.get(c);
     * if (code.equals(row.getCode())) { tablasTemp = row.getTablas(); break; }
     * c++; } rows = proyecto.getRows(); return tablasTemp; }
     */

    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model) {
        model.addAttribute("modules", rows);
        if (!show.isEmpty()) {
            model.addAttribute("perfiles", tablasTemp.get(0));
            model.addAttribute("vista", tablasTemp.get(1));
            model.addAttribute("negocio", tablasTemp.get(2));
            model.addAttribute("persistencia", tablasTemp.get(3));

            if (true) { /* proyecto.isEditado() */
                model.addAttribute("cu", tablasTemp.get(4));
            }

            model.addAttribute("integracion", tablasTemp.get(5));
        }
        model.addAttribute("display", show);

        // Notifications
        if (!notification.isEmpty()) {
            model.addAttribute("altype", notificationType);
            model.addAttribute("notification", notification);
            notification = "";
        }

        // Loads default row when empty
        if (rows.isEmpty()) {
            proyecto.crearModulo();
        }

        return "forward:/factores-ajuste";

    }

    @RequestMapping(value = "/criterios/load/", method = RequestMethod.GET)
    public String Tables(ModelMap model, @ModelAttribute("proyecto") Proyecto project) {
        proyecto = project;
        rows = proyecto.getRows();

        return "redirect:/load";

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
        Modulo row = new Modulo();
        int index = 0;
        code = code.trim();
        if (code.equals("")) {
            return "redirect:/criterios/ErrorSaveNull";
        }
        for (int i = 0; i < rows.size(); i++) {
            row = rows.get(i);
            if (code.equals(row.getCode()) && !code.equals(codigo)) {
                return "redirect:/criterios/ErrorSaveRow";
            }

            if (codigo.equals(row.getCode())) {
                index = i;

            }
        }

        if (!proyecto.GuardarDatos(codigo, perfilesTotal, perfilesNro, perfilesComplejidad, vistaTotal, vistaNro,
                vistaCampos, vistaComplejidad, vistaListados, vistaBotones, negocioTotal, negocioNro, negocioLogica,
                persistenciaTotal, persistenciaNro, persistenciaAccesos, cuTotal, cuDificultad, integracionTotal,
                integracionNro, integracionComplejidad)) {

            return "redirect:/load";

        } else {
            proyecto.CalcularTotal(codigo, perfilesTotal, vistaTotal, negocioTotal, persistenciaTotal, cuTotal,
                    integracionTotal);
        }
        rows.get(index).apply(code, name, caseOfUse);
        proyecto.setRows(rows);
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
    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto
        proyecto.crearModulo();
        return "redirect:/load";
    }

    // Delete a table row
    @RequestMapping(value = "/criterios/{code}/delete", method = RequestMethod.GET)
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
        show = "";
        notificationType = "info";
        notification = "Módulo " + code + " eliminada correctamente";
        return "redirect:/load";

    }

    @RequestMapping(value = "/criterios/{code}/edit", method = RequestMethod.POST)
    public String editRow(@PathVariable("code") String code) {
        show = code;
        Modulo row = new Modulo();
        int c = 0;
        while (c < rows.size()) {
            row = rows.get(c);
            if (code.equals(row.getCode())) {
                tablasTemp = row.getTablas();
            }
            c++;
        }

        codigo = code;
        return "redirect:/load";

    }

    // Displays the error message if the code it's not unique
    @RequestMapping(value = "/criterios/ErrorSaveRow", method = RequestMethod.GET)
    public String ErrorSaveRow(ModelMap model) {
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