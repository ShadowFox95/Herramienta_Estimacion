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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.becarios.proyecto_definitivo.dto.criterios.CasosDeUsoDto;
import com.becarios.proyecto_definitivo.dto.criterios.CasosDeUsoIdDto;
import com.becarios.proyecto_definitivo.dto.criterios.CuoriginalDto;
import com.becarios.proyecto_definitivo.dto.criterios.IntegracionDto;
import com.becarios.proyecto_definitivo.dto.criterios.NegocioDto;
import com.becarios.proyecto_definitivo.dto.criterios.PerfilesDto;
import com.becarios.proyecto_definitivo.dto.criterios.PersistenciaDto;
import com.becarios.proyecto_definitivo.dto.criterios.VistaDto;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUso;
import com.becarios.proyecto_definitivo.model.criterios.CasosDeUsoId;
import com.becarios.proyecto_definitivo.model.criterios.Cuoriginal;
import com.becarios.proyecto_definitivo.model.criterios.Integracion;
import com.becarios.proyecto_definitivo.model.criterios.Negocio;
import com.becarios.proyecto_definitivo.model.criterios.Perfiles;
import com.becarios.proyecto_definitivo.model.criterios.Persistencia;
import com.becarios.proyecto_definitivo.model.criterios.Vista;
import com.becarios.proyecto_definitivo.service.criterios.ModuleService;

@Controller
public class ControladorCriterios {

    @Autowired
    private String show = "";

    private String codigo;
    private String notification = "";
    private String notificationType = "info";

    private CasosDeUsoDto casoDeUsoActual;
    private CuoriginalDto cuActual;
    private IntegracionDto integracionActual;
    private NegocioDto negocioActual;
    private PerfilesDto perfilesActual;
    private PersistenciaDto persistenciaActual;
    private VistaDto vistaActual;

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

        // añadir parametros de addmodulo
        // moduleService.AddModulo(idProyecto, code, caseOfUse, name,
        // perfilesTotal, perfilesNro, perfilesComplejidad,
        // vistaTotal, vistaNro, vistaCampos, vistaComplejidad, vistaListados,
        // vistaBotones,
        // negocioTotal, negocioNro, negocioLogica,
        // persistenciaTotal, persistenciaNro, persistenciaAccesos,
        // cuTotal, cuDificultad,
        // integracionTotal, integracionNro, integracionComplejidad)

        // Cambiar '0' por 'idProyecto'
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

        // if (!show.isEmpty()) {
        // model.addAttribute("perfiles", tablasTemp.get(0));
        // model.addAttribute("vista", tablasTemp.get(1));
        // model.addAttribute("negocio", tablasTemp.get(2));
        // model.addAttribute("persistencia", tablasTemp.get(3));
        //
        // if (true) { /* proyecto.isEditado() */
        // model.addAttribute("cu", tablasTemp.get(4));
        // }
        //
        // model.addAttribute("integracion", tablasTemp.get(5));
        // }

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

        show = "";
        notificationType = "info";
        notification = "Módulo " + code + " eliminada correctamente";
        return "redirect:/";

    }

    @RequestMapping(value = "/criterios/{code}/edit", method = RequestMethod.POST)
    public String editRow(@PathVariable("code") String code) {
        show = code;

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

    // DTO METHODS
    private void passModuloToDto(CasosDeUso casoDeUso) {
        casoDeUsoActual.setId(new CasosDeUsoIdDto(casoDeUso.getId().getId(), casoDeUso.getId().getIdProyecto()));
        casoDeUsoActual.setCodigo(casoDeUso.getCodigo());
        casoDeUsoActual.setNombre(casoDeUso.getNombre());
        casoDeUsoActual.setTotalFila(casoDeUso.getTotalFila());
    }

    private void passPerfilesToDto(Perfiles perfiles) {
        perfilesActual.setCasosdeUsosCodigo(perfiles.getCasosdeUsosCodigo());
        perfilesActual.setNro(perfiles.getNro());
        perfilesActual.setComplejidad(perfiles.getComplejidad());
        perfilesActual.setTotal(perfiles.getTotal());
    }

    private void passVistaToDto(Vista vista) {
        vistaActual.setCasosdeUsosCodigo(vista.getCasosdeUsosCodigo());
        vistaActual.setNro(vista.getNro());
        vistaActual.setListados(vista.getListados());
        vistaActual.setBotones(vista.getBotones());
        vistaActual.setCampos(vista.getCampos());
        vistaActual.setComplejidad(vista.getComplejidad());
        vistaActual.setTotal(vista.getTotal());
    }

    private void passNegocioToDto(Negocio negocio) {
        negocioActual.setCasosdeUsosCodigo(negocio.getCasosdeUsosCodigo());
        negocioActual.setNro(negocio.getNro());
        negocioActual.setLogica(negocio.getLogica());
        negocioActual.setTotal(negocio.getTotal());
    }

    private void passIntegracionToDto(Integracion integracion) {
        integracionActual.setCasosdeUsosCodigo(integracion.getCasosdeUsosCodigo());
        integracionActual.setNro(integracion.getNro());
        integracionActual.setComplejidad(integracion.getComplejidad());
        integracionActual.setTotal(integracion.getTotal());
    }

    private void passCuToDto(Cuoriginal cu) {
        cuActual.setCasosdeUsosCodigo(cu.getCasosdeUsosCodigo());
        cuActual.setComplejidad(cu.getComplejidad());
        cuActual.setTotal(cu.getTotal());
    }

    private void passPersistenciaToDto(Persistencia persistencia) {
        persistenciaActual.setCasosdeUsosCodigo(persistencia.getCasosdeUsosCodigo());
        persistenciaActual.setNro(persistencia.getNro());
        persistenciaActual.setAccesos(persistencia.getAccesos());
        persistenciaActual.setTotal(persistencia.getTotal());
    }

    private void passDtoToModulo(CasosDeUso casoDeUso) {
        casoDeUso.setId(new CasosDeUsoId(casoDeUsoActual.getId().getId(), casoDeUsoActual.getId().getIdProyecto()));
        casoDeUso.setCodigo(casoDeUsoActual.getCodigo());
        casoDeUso.setNombre(casoDeUsoActual.getNombre());
        casoDeUso.setModulo(casoDeUsoActual.getModulo());
        casoDeUso.setTotalFila(casoDeUsoActual.getTotalFila());
    }

    private void passDtoToPerfiles(Perfiles perfiles) {
        perfiles.setCasosdeUsosCodigo(perfilesActual.getCasosdeUsosCodigo());
        perfiles.setNro(perfilesActual.getNro());
        perfiles.setComplejidad(perfilesActual.getComplejidad());
        perfiles.setTotal(perfilesActual.getTotal());
    }

    private void passDtoToVista(Vista vista) {
        vista.setCasosdeUsosCodigo(vistaActual.getCasosdeUsosCodigo());
        vista.setNro(vistaActual.getNro());
        vista.setListados(vistaActual.getListados());
        vista.setBotones(vistaActual.getBotones());
        vista.setCampos(vistaActual.getCampos());
        vista.setComplejidad(vistaActual.getComplejidad());
        vista.setTotal(vistaActual.getTotal());
    }

    private void passDtoToNegocio(Negocio negocio) {
        negocio.setCasosdeUsosCodigo(negocioActual.getCasosdeUsosCodigo());
        negocio.setNro(negocioActual.getNro());
        negocio.setLogica(negocioActual.getLogica());
        negocio.setTotal(negocioActual.getTotal());
    }

    private void passDtoToIntegracion(Integracion integracion) {
        integracion.setCasosdeUsosCodigo(integracionActual.getCasosdeUsosCodigo());
        integracion.setNro(integracionActual.getNro());
        integracion.setComplejidad(integracionActual.getComplejidad());
        integracion.setTotal(integracionActual.getTotal());
    }

    private void passDtoToCu(Cuoriginal cu) {
        cu.setCasosdeUsosCodigo(cuActual.getCasosdeUsosCodigo());
        cu.setComplejidad(cuActual.getComplejidad());
        cu.setTotal(cuActual.getTotal());
    }

    private void passDtoToPersistencia(Persistencia persistencia) {
        persistencia.setCasosdeUsosCodigo(persistenciaActual.getCasosdeUsosCodigo());
        persistencia.setNro(persistenciaActual.getNro());
        persistencia.setAccesos(persistenciaActual.getAccesos());
        persistencia.setTotal(persistenciaActual.getTotal());
    }

}