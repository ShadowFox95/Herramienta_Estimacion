<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>EF - Estimación de horas</title>
      <jsp:include page="../fragments/sidebar.jsp" />
      <div id="page-wrapper">
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Estimación de horas y costes</h1>
            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
         
         <div class="row">
         	 <div class="panel panel-default col-fix">
         	 <div class="panel-heading">
         	 </div>
	         	<div class="panel-body">
	         	 <div class="col-lg-7">
	         		<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-8">Valoración final</th>
	         					<th class="col-xs-2 text-right">Horas</th>
	         					<th class="col-xs-2 text-right">Coste</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>Total ADM-DW</td>
	         					<td id="totalhoras_admdw" class="text-right">0</td>
	         					<td id="totalcoste_admdw" class="text-right">0.00</td>
	         				</tr>
	         				<tr>
	         					<td >Total Centro de Testing</td>
	         					<td id="totalhoras_centrotesting" class="text-right">0</td>
	         					<td id="totalcoste_centrotesting" class="text-right">0.00</td>
	         				</tr>
	         				<tr>
	         					<td>Total OnSite</td>
	         					<td id="totalhoras_onsite" class="text-right">0</td>
	         					<td id="totalcoste_onsite" class="text-right">0.00</td>
	         				</tr>
	         				<tr class="active">
	         					<td><strong>Total</strong></td>
	         					<td class="text-right"><strong id="totalhoras_valorfinal">0</strong></td>
	         					<td class="text-right"><strong id="totalcoste_valorfinal">&euro; 0.00</strong></td>
	         				</tr>
	         			</tbody>
	         		</table>
	         		</div>
	         		 <div class="col-lg-5">
	         		<table width="100%" class="table table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th colspan="2">Riesgo</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td class="col-xs-2">Horas de Contingencia</td>
	         					<td id="horascontingencia" class="text-right col-xs-1">0.00</td>
	         				</tr>
	         			</tbody>
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
         
         <hr>
       	
		<div class="row">      	
         <jsp:include page="./centroInterno.jsp"></jsp:include>
         <jsp:include page="./centroExterno.jsp"></jsp:include>
 		</div> 
      </div>
      <!-- /.page-wrapper -->
      <jsp:include page="../fragments/footer.jsp" />
      </body>
</html>