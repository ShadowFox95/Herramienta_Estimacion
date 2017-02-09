<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>EF - Factores de Ajuste</title>
      <jsp:include page="../fragments/sidebar.jsp" />
      <div id="page-wrapper">
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Factores de Ajuste</h1>
            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
        	<div class="row">
         	 <div class="panel panel-default col-fix">
         	 	<div class="panel-heading">
	         	 	
	         	</div>	
	         	<div class="panel-body">
	         	 <div class="col-lg-12">
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th colspan="6">Factores de Complejidad T�cnica</th>		
	         				</tr>
	         				<tr>
	         					<th>Factor</th>
	         					<th>�Aplica?</th>
	         					<th>Grado de definici�n</th>
	         					<th>Grado de exigencia</th>
	         					<th>Impacto</th>
	         					<th>Riesgo</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td class="col-xs-5">Rendimiento</td>
        						<td class="col-xs-1">S�</td>
       							<td class="col-xs-1">Ninguno</td>
								<td class="col-xs-1">Muy Bajo</td>
								<td class="col-xs-1">2</td>
								<td class="col-xs-1">0</td>
	         				</tr>
	         				<tr>
	         					<td>Usabilidad</td>
        						<td>S�</td>
       							<td>Bajo</td>
								<td>Bajo</td>
								<td>4</td>
								<td>2</td>
	         				</tr>
	         				<tr>
	         					<td>Portabilidad</td>
        						<td>S�</td>
       							<td>Medio</td>
								<td>Medio</td>
								<td>6</td>
								<td>5</td>
	         				</tr>
	         				<tr>
	         					<td>Concurrencia</td>
        						<td>S�</td>
       							<td>Alto</td>
								<td>Alto</td>
								<td>8</td>
								<td>7</td>
	         				</tr>
	         				<tr>
	         					<td>Seguridad</td>
        						<td>S�</td>
       							<td>Alto</td>
								<td>Muy alto</td>
								<td>10</td>
								<td>7</td>
	         				</tr>
         					
	         			</tbody>
	         			<tfoot>
		         			<tr>
	       						<td colspan="3"></td>
								<td><strong>TOTAL</strong></td>
								<td>28</td>
								<td>21</td>
	         				</tr>
	         				<tr class="active">
	         					<td colspan="3"></td>
								<td><strong>TCF</strong></td>
								<td>1,2</td>
								<td>1,02</td>
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
	         					<th>�Aplica?</th>
	         					<th>�Est� definido?</th>
	         					<th>Grado de conocimiento</th>
	         					<th>Impacto</th>
	         					<th>Riesgo</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td class="col-xs-5">Arquitectura de Soluci�n de Software</td>
        						<td class="col-xs-1">S�</td>
       							<td class="col-xs-1">S�</td>
								<td class="col-xs-1">Ninguno</td>
								<td class="col-xs-1">0</td>
								<td class="col-xs-1">5</td>
	         				</tr>
	         				<tr>
	         					<td>Artquitectura de Integraci�n de Software</td>
        						<td>S�</td>
       							<td>No</td>
								<td>Bajo</td>
								<td>0</td>
								<td>0</td>
	         				</tr>
	         				<tr>
	         					<td>Arquitectura L�gica de Datos</td>
        						<td>S�</td>
       							<td>No</td>
								<td>Medio</td>
								<td>0</td>
								<td>0</td>
	         				</tr>
	         				<tr>
	         					<td>Arquitectura de Despliegue</td>
        						<td>S�</td>
       							<td>No</td>
								<td>Alto</td>
								<td>0</td>
								<td>0</td>
	         				</tr>
	         			</tbody>
	         			<tfoot>
		         			<tr>
	       						<td colspan="3"></td>
								<td><strong>TOTAL</strong></td>
								<td>0</td>
								<td>5</td>
	         				</tr>
	         				<tr class="active">
	         					<td colspan="3"></td>
								<td><strong>TCF</strong></td>
								<td>1,2</td>
								<td>1,02</td>
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
	         					<th>Valoraci�n</th>
	         					<th>Factor calculado</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td class="col-xs-5">Experiencia en la aplicaci�n actual</td>
        						<td class="col-xs-1">Muy alta</td>
       							<td class="col-xs-1">-10</td>
	         				</tr>
	         				<tr>
	         					<td>Capacidades de l�der t�cnico</td>
        						<td>Nula</td>
       							<td>20</td>
							
	         				</tr>
	         				<tr>
	         					<td>Calidad de requisitos de negocio</td>
        						<td>Muy alta</td>
       							<td>-10</td>
								
	         				</tr>
	         			</tbody>
	         			<tfoot>
		         			<tr>
	       						<td></td>
								<td><strong>TOTAL</strong></td>
								<td>0</td>

	         				</tr>
	         				<tr class="active">
	         					<td></td>
								<td><strong>ECF</strong></td>
								<td>0,93</td>
	         				</tr>
         				</tfoot>
	         		</table>
	         		</div>
	         	</div>
	         	<div class="panel-footer table-footer-fix clearfix">
	         		<span style="float:right">
                        <form name="row" action="/proyecto-definitivo/estimacion-horas/saveHoras" method="POST">
                           <button type="submit" class="custom-color right-button corner-button">
                           <i class="glyphicon glyphicon-floppy-save"></i> Guardar Proyecto
                           </button>
                        </form>
                     </span> 
	         	</div>
        	 </div>
         </div>
         
        
      </div>
      <!-- /.page-wrapper -->
      <jsp:include page="../fragments/footer.jsp" />
      </body>
</html>