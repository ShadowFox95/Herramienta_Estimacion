<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

  <div class="col-lg-6">
         	 <div class="panel panel-default col-fix">
	         	<div class="panel-heading">
	         	 	Centro ADM-DW
	         	</div>	
	         	<div class="panel-body">
	         		<table width="100%" class="table table-fix table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-8 v-align-center">Delivery</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Interna Práctica</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Gestión de la Configuración, Entornos locales y desarrollo</td>
	         					<td class="center col-xs-1"><input type="text"  placeholder="0" class="form-control form-custom text-right" id="gest_por" oninput="setGest()" onfocusout="calcGest()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td></td>
	         					<td>t23</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Fase de Evaluación y Diseño de la Arquitectura</td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="ev_por" oninput="setEv()" onfocusout="calcEv()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td></td>
	         					<td>t38</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Fase de Análisis</td>
	         					<td class="center col-xs-1 text-right">0</td>
	         					<td><select class="form-control form-custom" disabled="disabled" id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t84</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Fase de Diseño</td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="dis_por" oninput="setDis()" onfocusout="calcDis()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td></td>
	         					<td>t137</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Fase de Construcción y pruebas unitarias</td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="cons_por" oninput="setCons()" onfocusout="calcCons()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td></td>
	         					<td>t358</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Fase de Pruebas de Funcionamiento</td>
	         					<td class="center col-xs-1 text-right">0</td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t76</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Delivery</strong></td>
	         					<td class="text-right"><strong id="del_por">0%</strong></td>
	         					<td></td>
	         					<td >t716</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
	         		<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-6">Gestión de la Calidad/Seguridad/Despliegues</th>
	         					<th class="col-xs-2">Nivel</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Interna Práctica</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Gestión de Calidad</td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">N/A</option>
                              		<option value="5">Nivel Bajo</option>
                              		<option value="7">Nivel Medio</option>
                              		<option value="12">Nivel Alto</option>
                           		</select></td>
	         					<td class="center col-xs-1"><input type="text"  placeholder="0" class="form-control form-custom text-right" id="cal_por" oninput="setCal()" onfocusout="calcCal()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Gestión de Seguridad</td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">N/A</option>
                              		<option value="5">Nivel Bajo</option>
                              		<option value="7">Nivel Medio</option>
                              		<option value="12">Nivel Alto</option>
                           		</select></td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="seg_por" oninput="setSeg()" onfocusout="calcSeg()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Gestión de Despliegues</td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">N/A</option>
                              		<option value="5">Nivel Bajo</option>
                              		<option value="7">Nivel Medio</option>
                              		<option value="12">Nivel Alto</option>
                           		</select></td>
	         					<td class="center col-xs-1"><input type="text"  placeholder="0" class="form-control form-custom text-right" id="desp_por" oninput="setDesp()" onfocusout="calcDesp()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t14</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Extras</strong></td>
	         					<td></td>
	         					<td class="text-right"><strong id="extra_por">0%</strong></td>
	         					<td></td>
	         					<td>t14</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
					<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-8">Gobierno</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Interna Práctica</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Gestión del Proyecto</td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="proy_por" oninput="setProy()" onfocusout="calcProy()" maxlength="3" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Gestión del DM</td>
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="dm_por" oninput="setDM()" onfocusout="calcDM()" maxlength="3" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
                              		<option selected value="0">No</option>
                              		<option value="1">Sí</option>
                           		</select></td>
	         					<td>t21</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Gobierno</strong></td>
	         					<td class="text-right"><strong id="gob_por">0%</strong></td>
	         					<td></td>
	         					<td>t21</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
	         	</div>
        	 </div>
            </div>