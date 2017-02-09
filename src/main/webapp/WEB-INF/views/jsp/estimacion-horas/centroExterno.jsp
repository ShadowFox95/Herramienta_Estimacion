<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  
  <div class="col-lg-6 ">
         	 <div class="panel panel-default col-fix">
	         	<div class="panel-heading">
	         	 	Externo a ADM-DW
	         	</div>	
	         	<div class="panel-body">
	         		<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-9">Delivery</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Centro de Testing</td>
	         					<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t0</td>
         						<td></td>
	         				</tr>
	         				<tr>
	         					<td>Análisis</td>
	         				<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Delivery</strong></td>
	         					<td class="text-right">t0%</td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
	         		<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-9">Gestión de la Calidad/Seguridad/Despliegues</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Gestión de Calidad</td>
	         				<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t72</td>
	         				 	<td></td>
	         				</tr>
	         				<tr>
	         					<td>Gestión de Seguridad</td>
	         			<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t50</td>
	         					<td></td>
	         				</tr>
	         				<tr>
	         					<td>Gestión de Despliegues</td>
	         					<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t0</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Extras</strong></td>
	         					<td class="text-right">i17%</td>
	         					<td>t122</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
					<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-9">Gobierno</th>
	         					<th class="col-xs-1">Dist. (%)</th>
	         					<th class="col-xs-1">Horas</th>
	         					<th class="col-xs-1 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Gestión del Proyecto</td>
	         					<td class="center col-xs-1"><input type="text" form="save" class="form-control form-custom text-right" id="gest_por" oninput="" maxlength="2" onkeypress='return event.charCode >= 46 && event.charCode <= 57'></td>
	         					<td>t72</td>
	         					<td></td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total Gobierno</strong></td>
	         					<td class="text-right"></td>
	         					<td>t72</td>
	         					<td></td>
	         				</tr>
	         			</tbody>
	         		</table>
	         	</div>
        	 </div>
         </div>