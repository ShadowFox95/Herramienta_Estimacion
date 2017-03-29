<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

  <div class="col-lg-6 width-fix1">
         	 <div class="panel panel-default">
	         	<div class="panel-heading">
	         	 	Centro ADM-DW
	         	</div>	
	         	<div class="panel-body">
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

>>>>>>> 0fb152a a
	         					<td class="center col-xs-1 align-fix text-right" id="analisis_por">0</td>
	         					<td><select class="form-control form-custom" id="analisis_ip" onchange="selectDelivery('analisis')">
=======
	         					<td class="center col-xs-1 text-right">0</td>
	         					<td><select class="form-control form-custom" disabled="disabled" id="" name="" onchange="">
>>>>>>> e535554 EstimaciÃ³n Horas - 28/02/2017
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

>>>>>>> 0fb152a a
	         					<td class="center col-xs-1 text-right align-fix" id="testing_por">0</td>
	         					<td><select class="form-control form-custom"  id="testing_ip" onchange="selectDelivery('testing')">
=======
	         					<td class="center col-xs-1 text-right">0</td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
>>>>>>> e535554 EstimaciÃ³n Horas - 28/02/2017
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
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

>>>>>>> 0fb152a a
	         					<td id="calidad_por" class="center col-xs-1 text-right align-fix">0</td>
	         					<td><select class="form-control form-custom"  id="calidad_ip" onchange="selectExtras('calidad')">
=======
	         					<td class="center col-xs-1"><input type="text"  placeholder="0" class="form-control form-custom text-right" id="cal_por" oninput="setCal()" onfocusout="calcCal()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
>>>>>>> e535554 EstimaciÃ³n Horas - 28/02/2017
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

>>>>>>> 0fb152a a
	         					<td id="seguridad_por" class="center col-xs-1 text-right align-fix">0</td>
	         					<td><select class="form-control form-custom"  id="seguridad_ip" onchange="selectExtras('seguridad')">
=======
	         					<td class="center col-xs-1"><input type="text" placeholder="0" class="form-control form-custom text-right" id="seg_por" oninput="setSeg()" onfocusout="calcSeg()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
>>>>>>> e535554 EstimaciÃ³n Horas - 28/02/2017
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
<<<<<<< Upstream, based on origin/marius
=======
<<<<<<< Upstream, based on origin/marius

>>>>>>> 0fb152a a
	         					<td id="despliegues_por" class="center col-xs-1 text-right align-fix">0</td>
	         					<td><select class="form-control form-custom"  id="despliegues_ip" onchange="selectExtras('despliegues')">
=======
	         					<td class="center col-xs-1"><input type="text"  placeholder="0" class="form-control form-custom text-right" id="desp_por" oninput="setDesp()" onfocusout="calcDesp()" maxlength="3" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
	         					<td><select class="form-control form-custom"  id="" name="" onchange="">
>>>>>>> e535554 EstimaciÃ³n Horas - 28/02/2017
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
					<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
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