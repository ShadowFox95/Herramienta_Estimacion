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
import com.becarios.proyecto_definitivo.service.criterios.ModuleService;
import com.becarios.proyecto_definitivo.web.controller.ControladorPrincipal;

@Controller
public class ControladorCriterios {

    @Autowired
    ModuleService module;

    private String show = "";
    private String notification = "";
    private String notificationType = "info";

    // Show main page
<<<<<<< Upstream, based on origin/marius
    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model ) {
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
    	
			
		
        model.addAttribute("projectCode", ControladorPrincipal.idProyecto);
        List<CasosDeUso> modulos = module.findAllModulo(ControladorPrincipal.idProyecto);
=======
<<<<<<< Upstream, based on origin/marius
    @RequestMapping(value = "/criterios/{projectCode}/", method = RequestMethod.GET)
    public String mainTables(ModelMap model, @PathVariable("projectCode") int idProyecto) {
=======
    @RequestMapping(value = "/criterios", method = RequestMethod.GET)
    public String mainTables(ModelMap model, @RequestParam("projectCode") String codigoProyecto) {
>>>>>>> efd4d37 Gestor de Proyectos

        model.addAttribute("projectCode", idProyecto);

        List<Modulo> modulos = module.findAllModulo(idProyecto);
>>>>>>> 345d489 Gestor de Proyectos

        model.addAttribute("modules", modulos);
    	
        model.addAttribute("display", show);

        // Notifications
        if (!notification.isEmpty()) {
            model.addAttribute("altype", notificationType);
            model.addAttribute("notification", notification);
            notification = "";
        }

        // Loads default row when empty
       /* if (modulos.isEmpty()) {
            module.createModulo(ControladorPrincipal.idProyecto);
        
    	}*/
        return "forward:/factores-ajuste";

    }
<<<<<<< Upstream, based on origin/marius

    // saves the name changes
=======

    // saves the changes
>>>>>>> 3188760 a
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

=======

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

>>>>>>> 9185c57 restored
>>>>>>> 3188760 a
            @RequestParam("persistenciaNro") int persistenciaNro,
            @RequestParam("persistenciaAccesos") int persistenciaAccesos,
            @RequestParam(value = "cuTotal", defaultValue = "0") int cuTotal,
            @RequestParam(value = "cuDificultad", defaultValue = "0") int cuDificultad,
            @RequestParam("integracionTotal") int integracionTotal,
            @RequestParam("integracionComplejidad") int integracionComplejidad,
            @RequestParam("integracionNro") int integracionNro) {

        code = code.trim();
        if (code.equals("")) {
<<<<<<< Upstream, based on origin/marius
            return "redirect:/criterios/" + idProyecto + "/ErrorSaveNull";
=======
            return "redirect:/criterios/ErrorSaveNull";
>>>>>>> efd4d37 Gestor de Proyectos
        }
<<<<<<< Upstream, based on origin/marius

        if (!module.AddModulo(idProyecto, code, caseOfUse, name, perfilesTotal, perfilesNro, perfilesComplejidad,
                vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, vistaBotones, negocioTotal,
                negocioNro, negocioLogica, persistenciaTotal, persistenciaNro, persistenciaAccesos, cuTotal,
                cuDificultad, integracionTotal, integracionNro, integracionComplejidad)) {
=======
<<<<<<< Upstream, based on origin/marius
        if (!module.AddModulo(idProyecto,id, code, caseOfUse, name, perfilesTotal, perfilesNro, 
        		perfilesComplejidad, vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, 
        		vistaBotones, negocioTotal, negocioNro, negocioLogica, persistenciaTotal, persistenciaNro, 
        		persistenciaAccesos, cuTotal, cuDificultad, integracionTotal, integracionNro, integracionComplejidad)) {
=======
        if (!module.isModuloCodeUnique(code)) {
            return "redirect:/criterios/ErrorSaveRow";
        }
>>>>>>> efd4d37 Gestor de Proyectos
>>>>>>> 345d489 Gestor de Proyectos

<<<<<<< Upstream, based on origin/marius
            return "redirect:/criterios/" + idProyecto + "/ErrorSaveData";
=======
        if (!module.AddModulo(codigoProyecto, editado, code, caseOfUse, name, perfilesTotal, perfilesNro,
                perfilesComplejidad, vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados, vistaBotones,
                negocioTotal, negocioNro, negocioLogica, persistenciaTotal, persistenciaNro, persistenciaAccesos,
                cuTotal, cuDificultad, integracionTotal, integracionNro, integracionComplejidad)) {

<<<<<<< Upstream, based on origin/marius
            return "redirect:/criterios/ErrorSaveData";
>>>>>>> efd4d37 Gestor de Proyectos
=======
            return "redirect:/load";
>>>>>>> 9185c57 restored

        } else {
            // proyecto.CalcularTotal(codigo, perfilesTotal, vistaTotal,
            // negocioTotal, persistenciaTotal, cuTotal,integracionTotal);
        }
        // rows.get(index).apply(code, name, caseOfUse);
        // proyecto.setRows(rows);
        show = "";

        notificationType = "info";
        notification = "Se han aplicado los cambios";

<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
        return "redirect:/load";
=======
=======

>>>>>>> 9185c57 restored
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos


        return "redirect:/load";

    }

    // discard changes
    @RequestMapping(value = "/criterios/discard", method = RequestMethod.POST)
<<<<<<< Upstream, based on origin/marius
    public String discard() {
<<<<<<< Upstream, based on origin/marius
        // Desplazar a clase para modelo por defecto
=======
=======
    public String discard(@RequestParam("projectCode") String codigoProyecto) {
>>>>>>> efd4d37 Gestor de Proyectos
>>>>>>> 345d489 Gestor de Proyectos
        show = "";
        notificationType = "info";
        notification = "Se han descartado los cambios";
<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
=======
=======

>>>>>>> 9185c57 restored
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos

<<<<<<< Upstream, based on origin/marius
        return "redirect:/load";
=======

        return "redirect:/load";

>>>>>>> 9185c57 restored
    }

    // Adds a table row
<<<<<<< Upstream, based on origin/marius
    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
=======
<<<<<<< Upstream, based on origin/marius
    @RequestMapping(value = "/criterios/{projectCode}/addRow", method = RequestMethod.POST)
=======

    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model, @RequestParam("projectCode") String codigoProyecto) {
>>>>>>> efd4d37 Gestor de Proyectos
>>>>>>> 345d489 Gestor de Proyectos

<<<<<<< Upstream, based on origin/marius
        module.AddModulo(ControladorPrincipal.idProyecto, "nombre", "nombre", "Nombre", 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0,
                0, 0, 0, 0);
=======
    public String addRow(ModelMap model, @PathVariable("projectCode") int idProyecto) {

<<<<<<< Upstream, based on origin/marius
        module.createModulo(idProyecto);
=======
        return "redirect:/criterios/" + codigoProyecto + "/";
    @RequestMapping(value = "/criterios/addRow", method = RequestMethod.POST)
    public String addRow(ModelMap model) {
        // Desplazar a clase para modelo por defecto
        proyecto.crearModulo();


        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos
>>>>>>> 345d489 Gestor de Proyectos

<<<<<<< Upstream, based on origin/marius
        return "redirect:/load";
=======

        return "redirect:/load";

>>>>>>> 9185c57 restored
    }

<<<<<<< Upstream, based on origin/marius
    // Delete a table row
    @RequestMapping(value = "/criterios/{projectCode}/delete", method = RequestMethod.GET)
=======
    // Delete a table row
    @RequestMapping(value = "/criterios/{projectCode}/{code}/delete", method = RequestMethod.POST)
<<<<<<< Upstream, based on origin/marius

>>>>>>> 345d489 Gestor de Proyectos
    public String deleteRow(@PathVariable("projectCode") int idProyecto, @PathVariable("code") int id) {
        module.deleteModuloByCode(id);

=======
    public String deleteRow(@PathVariable("projectCode") String codigoProyecto, @PathVariable("code") String code) {
        module.deleteModuloByCode(code);
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
>>>>>>> efd4d37 Gestor de Proyectos
        show = "";
        notificationType = "info";
<<<<<<< Upstream, based on origin/marius
        notification = "Módulo " + id + " eliminada correctamente";

        return "redirect:/load";
<<<<<<< Upstream, based on origin/marius
=======
=======
        notification = "Módulo " + code + " eliminada correctamente";
<<<<<<< Upstream, based on origin/marius
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos
=======
        return "redirect:/load";
>>>>>>> 9185c57 restored

>>>>>>> 345d489 Gestor de Proyectos
    }

    // Shows the tables from the module
    @RequestMapping(value = "/criterios/{projectCode}/{code}/edit", method = RequestMethod.POST)
    public String editRow(ModelMap model, @PathVariable("projectCode") int idProyecto,
            @PathVariable("code") String id) {
        show = id;
        List<Object> tablasTemp = new ArrayList<Object>();
        // tablasTemp = module.findAllTablas(code);

        model.addAttribute("perfiles", tablasTemp.get(0));
        model.addAttribute("vista", tablasTemp.get(1));
        model.addAttribute("negocio", tablasTemp.get(2));
        model.addAttribute("persistencia", tablasTemp.get(3));
        if (true) { /* proyecto.isEditado() */
            model.addAttribute("cu", tablasTemp.get(4));
        }
        model.addAttribute("integracion", tablasTemp.get(5));

<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
        return "redirect:/load";
=======
=======

>>>>>>> 9185c57 restored
        return "redirect:/criterios";
<<<<<<< Upstream, based on origin/marius
>>>>>>> efd4d37 Gestor de Proyectos
=======

        codigo = code;
        return "redirect:/load";

>>>>>>> 9185c57 restored

    }

    // Displays the error message if the code it's not unique
    @RequestMapping(value = "/criterios/{projectCode}/ErrorSaveRow", method = RequestMethod.GET)
    public String ErrorSaveRow(ModelMap model, @PathVariable("projectCode") int idProyecto) {
        notificationType = "danger";
        notification = "Los datos no han sido guardados correctamente. El codigo esta repetido";
<<<<<<< Upstream, based on origin/marius
<<<<<<< Upstream, based on origin/marius
        return "redirect:/load";
=======
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos
=======
        return "redirect:/load";
>>>>>>> 9185c57 restored
    }

    @RequestMapping(value = "/criterios/ErrorSaveData", method = RequestMethod.GET)
    public String ErrorSaveData(ModelMap model) {
        notificationType = "danger";
<<<<<<< Upstream, based on origin/marius
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo más tarde";
=======
<<<<<<< Upstream, based on origin/marius
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo mas tarde";

>>>>>>> 345d489 Gestor de Proyectos
        return "redirect:/load";
=======
        notification = "Los datos no han sido guardados correctamente. Intentelo de nuevo más tarde";
<<<<<<< Upstream, based on origin/marius
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos
=======
        return "redirect:/load";
>>>>>>> 9185c57 restored
    }

    @RequestMapping(value = "/criterios/ErrorSaveNull", method = RequestMethod.GET)
    public String ErrorSaveNull(ModelMap model) {
        notificationType = "danger";
<<<<<<< Upstream, based on origin/marius
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo válido";
=======
<<<<<<< Upstream, based on origin/marius
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo valido";

>>>>>>> 345d489 Gestor de Proyectos
        return "redirect:/load";
=======
        notification = "Los datos no han sido guardados correctamente. Introduzca un codigo válido";
<<<<<<< Upstream, based on origin/marius
        return "redirect:/criterios/";
>>>>>>> efd4d37 Gestor de Proyectos
=======
        return "redirect:/load";
>>>>>>> 9185c57 restored
    }
}