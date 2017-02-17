<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <table width="100%" class="table table-condensed table-striped table-bordered tableForm">
        <thead>
            <tr>
                <th colspan="6">Factores de Complejidad Técnica</th>
            </tr>
            <tr>
                <th>Factor</th>
                <th>¿Aplica?</th>
                <th>Grado de definición</th>
                <th>Grado de exigencia</th>
                <th>Impacto</th>
                <th>Riesgo</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="col-xs-5">Rendimiento</td>
                <td class="col-xs-1">
                    <select id="rendimiento_aplica" onchange="calculate('rendimiento')" class="form-control">
                        <option selected value="0">No</option>
                        <option  value="1">Sí</option>
                    </select>
                </td>
                <td class="col-xs-1">
                    <select id="rendimiento_definicion" disabled="disabled" onchange="calculate('rendimiento')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td class="col-xs-1">
                    <select id="rendimiento_exigencia" disabled="disabled" onchange="calculate('rendimiento')" class="form-control">
                        <option value="0">Muy Bajo</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                        <option value="4">Muy Alto</option>
                    </select>
                </td>
                <td id="rendimiento_impacto" class="col-xs-1">0</td>
                <input type="hidden" id="rendimiento_impacto_hidden" value="0"/>
                
                <td id="rendimiento_riesgo" class="col-xs-1">0</td>
                <input type="hidden" id="rendimiento_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Usabilidad</td>
                <td>
                    <select id="usabilidad_aplica" onchange="calculate('usabilidad')" class="form-control">
                        <option selected value="0">No</option>
                        <option  value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="usabilidad_definicion" disabled="disabled" onchange="calculate('usabilidad')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td>
                    <select id="usabilidad_exigencia" disabled="disabled" onchange="calculate('usabilidad')" class="form-control">
                        <option value="0">Muy Bajo</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                        <option value="4">Muy Alto</option>
                    </select>
                </td>
                <td id="usabilidad_impacto" >0</td>
                <input type="hidden" id="usabilidad_impacto_hidden" value="0"/>
                
                <td id="usabilidad_riesgo" >0</td>
                <input type="hidden" id="usabilidad_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Portabilidad</td>
                <td>
                    <select id="portabilidad_aplica" onchange="calculate('portabilidad')" class="form-control">
                        <option selected value="0">No</option>
                        <option  value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="portabilidad_definicion" disabled="disabled" onchange="calculate('portabilidad')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td>
                    <select id="portabilidad_exigencia" disabled="disabled" onchange="calculate('portabilidad')" class="form-control">
                        <option value="0">Muy Bajo</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                        <option value="4">Muy Alto</option>
                    </select>
                </td>
                <td id="portabilidad_impacto" >0</td>
                <input type="hidden" id="portabilidad_impacto_hidden" value="0"/>
                
                <td id="portabilidad_riesgo" >0</td>
                <input type="hidden" id="portabilidad_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Concurrencia</td>
                <td>
                    <select id="concurrencia_aplica" onchange="calculate('concurrencia')" class="form-control">
                        <option selected value="0">No</option>
                        <option  value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="concurrencia_definicion" disabled="disabled" onchange="calculate('concurrencia')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td>
                    <select id="concurrencia_exigencia" disabled="disabled" onchange="calculate('concurrencia')" class="form-control">
                        <option value="0">Muy Bajo</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                        <option value="4">Muy Alto</option>
                    </select>
                </td>
                <td id="concurrencia_impacto" >0</td>
                <input type="hidden" id="concurrencia_impacto_hidden" value="0"/>
                
                <td id="concurrencia_riesgo" >0</td>
                <input type="hidden" id="concurrencia_riesgo_hidden" value="0"/>
                
            </tr>
            <tr>
                <td>Seguridad</td>
                <td>
                    <select id="seguridad_aplica" onchange="calculate('seguridad')" class="form-control">
                        <option selected value="0">No</option>
                        <option  value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="seguridad_definicion" disabled="disabled" onchange="calculate('seguridad')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td>
                    <select id="seguridad_exigencia" disabled="disabled" onchange="calculate('seguridad')" class="form-control">
                        <option value="0">Muy Bajo</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                        <option value="4">Muy Alto</option>
                    </select>
                </td>
                <td id="seguridad_impacto" >0</td>
                <input type="hidden" id="seguridad_impacto_hidden" value="0"/>
                
                <td id="seguridad_riesgo" >0</td>
                <input type="hidden" id="seguridad_riesgo_hidden" value="0"/>
            </tr>

        </tbody>
        <tfoot>
            <tr>
                <td colspan="3"></td>
                <td><strong>TOTAL</strong>
                </td>
                <td id="total_impacto">0</td>
                <input type="hidden" id="total_impacto_hidden" value="0"/>
                
                <td id="total_riesgo">0</td>
                <input type="hidden" id="total_riesgo_hidden" value="0"/>
            </tr>
            <tr class="active">
                <td colspan="3"></td>
                <td><strong>TCF</strong>
                </td>
                <td  id="tcf_impacto">0</td>
                <input type="hidden" id="tcf_impacto_hidden" value="0"/>
                
                <td id="tcf_riesgo">0</td>
                <input type="hidden" id="tcf_riesgo_hidden" value="0"/>
            </tr>
        </tfoot>
    </table>
    <table width="100%" class="table table-condensed table-striped table-bordered tableForm">
        <thead>
            <tr>
                <th colspan="6">Arquitectura de referencia</th>
            </tr>
            <tr>
                <th>Factor</th>
                <th>¿Aplica?</th>
                <th>¿Está definido?</th>
                <th>Grado de conocimiento</th>
                <th>Impacto</th>
                <th>Riesgo</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="col-xs-5">Arquitectura de Solución de Software</td>
                <td class="col-xs-1">
                    <select id="solucion_aplica" onchange="calculate2('solucion')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td class="col-xs-1">
                    <select id="solucion_definido" disabled="disabled" onchange="calculate2('solucion')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td class="col-xs-1">
                    <select id="solucion_conocimiento" disabled="disabled" onchange="calculate2('solucion')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td id="solucion_impacto" class="col-xs-1">0</td>
                <input type="hidden" id="solucion_impacto_hidden" value="0"/>
                
                <td id="solucion_riesgo" class="col-xs-1">0</td>
                <input type="hidden" id="solucion_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Artquitectura de Integración de Software</td>
                <td>
                    <select id="integracion_aplica" onchange="calculate2('integracion')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="integracion_definido" disabled="disabled" onchange="calculate2('integracion')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="integracion_conocimiento" disabled="disabled" onchange="calculate2('integracion')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td id="integracion_impacto">0</td>
                <input type="hidden" id="integracion_impacto_hidden" value="0"/>
                
                <td id="integracion_riesgo">0</td>
                <input type="hidden" id="integracion_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Arquitectura Lógica de Datos</td>
                <td>
                    <select id="logica_aplica" onchange="calculate2('logica')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="logica_definido" disabled="disabled" onchange="calculate2('logica')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="logica_conocimiento" disabled="disabled" onchange="calculate2('logica')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td id="logica_impacto">0</td>
                <input type="hidden" id="logica_impacto_hidden" value="0"/>
                <td id="logica_riesgo">0</td>
                <input type="hidden" id="logica_riesgo_hidden" value="0"/>
            </tr>
            <tr>
                <td>Arquitectura de Despliegue</td>
                <td>
                    <select id="despliegue_aplica" onchange="calculate2('despliegue')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="despliegue_definido" disabled="disabled" onchange="calculate2('despliegue')" class="form-control">
                        <option selected value="0">No</option>
                        <option value="1">Sí</option>
                    </select>
                </td>
                <td>
                    <select id="despliegue_conocimiento" disabled="disabled" onchange="calculate2('despliegue')" class="form-control">
                        <option value="0">Ninguno</option>
                        <option value="1">Bajo</option>
                        <option value="2">Medio</option>
                        <option value="3">Alto</option>
                    </select>
                </td>
                <td id="despliegue_impacto">0</td>
                <input type="hidden" id="despliegue_impacto_hidden" value="0"/>
                <td id="despliegue_riesgo">0</td>
                <input type="hidden" id="despliegue_riesgo_hidden" value="0"/>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td colspan="3"></td>
                <td><strong>TOTAL</strong>
                </td>
                <td id="total_impacto2">0</td>
                <input type="hidden" id="total_impacto2_hidden" value="0"/>
                <td id="total_riesgo2">0</td>
                <input type="hidden" id="total_riesgo2_hidden" value="0"/>
            </tr>
            <tr class="active">
                <td colspan="3"></td>
                <td><strong>TCF</strong>
                </td>
                <td id="tcf_impacto2">0</td>
                <input type="hidden" id="tcf_impacto2_hidden" value="0"/>
                <td id="tcf_riesgo2">0</td>
                <input type="hidden" id="tcf_riesgo2_hidden" value="0"/>
            </tr>
        </tfoot>
    </table>
    <table width="100%" class="table table-condensed table-striped table-bordered tableForm">
        <thead>
            <tr>
                <th colspan="6">Factores de Complejidad Ambiental</th>
            </tr>
            <tr>
                <th>Factor</th>
                <th>Valoración</th>
                <th>Factor calculado</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="col-xs-5">Experiencia en la aplicación actual</td>
                <td class="col-xs-1">
                    <select id="experiencia_valoracion" onchange="calculate3('experiencia')" class="form-control">
                        <option value="10">Muy Bajo</option>
                        <option value="5">Bajo</option>
                        <option value="0">Medio</option>
                        <option value="-5">Alto</option>
                        <option value="-10">Muy Alto</option>
                    </select>
                </td>
                <td id="experiencia_calculado" class="col-xs-1">10</td>
                <input type="hidden" id="experiencia_calculado_hidden" value="10"/>
            </tr>
            <tr>
                <td>Capacidades de líder técnico</td>
                <td>
                    <select id="capacidades_valoracion" onchange="calculate3('capacidades')" class="form-control">
                        <option value="10">Muy Bajo</option>
                        <option value="5">Bajo</option>
                        <option value="0">Medio</option>
                        <option value="-5">Alto</option>
                        <option value="-10">Muy Alto</option>
                    </select>
                </td>
                <td id="capacidades_calculado">10</td>
				<input type="hidden" id="capacidades_calculado_hidden" value="10"/>
            </tr>
            <tr>
                <td>Calidad de requisitos de negocio</td>
                <td>
                    <select id="calidad_valoracion" onchange="calculate3('calidad')" class="form-control">
                        <option value="20">Nula</option>
                        <option value="15">Muy Bajo</option>
                        <option value="10">Bajo</option>
                        <option value="5">Medio</option>
                        <option value="-5">Alto</option>
                        <option value="-10">Muy Alto</option>
                    </select>
                </td>
                <td id="calidad_calculado">20</td>
                <input type="hidden" id="calidad_calculado_hidden" value="20"/>

            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td></td>
                <td><strong>TOTAL</strong>
                </td>
                <td id="total">0</td>
				<input type="hidden" id="total_hidden" value="0"/>
            </tr>
            <tr class="active">
                <td></td>
                <td><strong>ECF</strong>
                </td>
                <td id="ecf">0</td>
                <input type="hidden" id="ecf_hidden" value="0"/>
            </tr>
        </tfoot>
    </table>