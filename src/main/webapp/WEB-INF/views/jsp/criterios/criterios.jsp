<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>EF - Criterios</title>
      <script type="text/javascript">
      	$( "#moduleTable" ).ready(function() {
      	 $.ajax({
             type: "POST",
             url: "testing",
             success: function(module){
                refreshTable(module);
                $("#showAtributos").hide();
             },
              error: function(e){
              	console.log('Error: ' + e);
              }
         });
        });
      	function refreshTable(module){
	      	 var table = "";
	      	 if(module.length == 0) {
	      	     table = "<tr><td colspan='5'>No hay datos para mostrar</td></tr>";
	      	     $("#showAtributos").hide();
	      	 } else {
		      	 for(i=0; i < module.length; i++){
			            table += "<tr><td>"+module[i].name+"</td>";
			            table += "<td>"+module[i].code+"</td>";
			            table += "<td>"+module[i].caseOfUse+"</td>";
			            table += "<td>"+module[i].total+"</td>";
						if(module[i].total < 7.5){
						    table += "<td class='center info'>Muy Fácil";
						} else if(module[i].total < 12.5){
						    table += "<td class='center success'>Fácil";
						} else if(module[i].total < 17.5) {
						    table += "<td class='center warning'>Normal";
						} else if(module[i].total < 22.5){
						    table += "<td class='center danger'>Complicado";
						} else {
						    table += "<td class='center danger2'>Muy Complicado";
						} 
			            table += "<div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-trash' id='"+module[i].code
			      	     	+"' onClick='doAjaxDelete(id)'/></div><div style='float:right'><button type='submit' class='button edit glyphicon glyphicon-pencil' id='"+module[i].code+"' onClick='doAjaxEdit(id)'/></div>";
			         	table += "</td></tr>";
			      }
	      	 }
	        
	         $("#moduleTable").html(table); 
      	}
      	
      	function editTable(module, id){
	      	 var table = "";
	      	 var selected = "";
	      	 console.log(id);
	      	 if(module.length == 0) {
	      	     table = "<tr><td colspan='5'>No hay datos para mostrar</td></tr>";
	      	     $("#showAtributos").hide();
	      	 } else {
		      	 for(i=0; i < module.length; i++){
		      	     	if (id == module[i].code){
	      	     	    	table += "<tr class='active'><td><input type='text' class='altura form-control' id='selected_name' value='"+module[i].name+"' maxlength='25'></td>";
			      	     	table += "<td><input type='text' class='altura form-control' id='selected_code' value='"+module[i].code+"' maxlength='10'></td>";
					      	table += "<td><input type='text' class='altura form-control' id='selected_caseOfUse' value='"+module[i].caseOfUse+"' maxlength='30'></td>";
					      	table += "<td>"+module[i].total+"</td>";
					      	if(module[i].total < 7.5){
					      	table += "<td class='center info'>Muy Fácil";
							} else if(module[i].total < 12.5){
							    table += "<td class='center success'>Fácil";
							} else if(module[i].total < 17.5) {
							    table += "<td class='center warning'>Normal";
							} else if(module[i].total < 22.5){
							    table += "<td class='center danger'>Complicado";
							} else {
							    table += "<td class='center danger2'>Muy Complicado";
							} 
					      	table += "<div style='float:right'><div style='float:left'><button type='submit' class='button ok glyphicon glyphicon-ok' id='"+module[i].code
				      	     	+"' onClick='doAjaxSaveRow(id)'></button></div><div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-remove' onClick='doAjaxEdit()'></button></div></div>";
				      	  	table += "</td></tr>";
					      	populateAtributos(module[i].tablas);
		      	     	} else{
			      	      	table += "<tr><td>"+module[i].name+"</td>";
				            table += "<td>"+module[i].code+"</td>";
				            table += "<td>"+module[i].caseOfUse+"</td>";
				            table += "<td>"+module[i].total+"</td>";
							if(module[i].total < 7.5){
							    table += "<td class='center info'>Muy Fácil";
							} else if(module[i].total < 12.5){
							    table += "<td class='center success'>Fácil";
							} else if(module[i].total < 17.5) {
							    table += "<td class='center warning'>Normal";
							} else if(module[i].total < 22.5){
							    table += "<td class='center danger'>Complicado";
							} else {
							    table += "<td class='center danger2'>Muy Complicado";
							} 
							
				            //table += "<div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-trash' id='"+module[i].code
				      	    // 	+"' onClick='doAjaxDelete(id)'/></div><div style='float:right'><button type='submit' class='button edit glyphicon glyphicon-pencil' id='"+module[i].code+"' onClick='doAjaxEdit(id)'/></div>";
				         	table += "</td></tr>";
		      	     	}
			      }
		      	 // table = selected + table;
	      	 }
	        
	         $("#moduleTable").html(table); 
 	}
      	function populateAtributos(tabla){
      		document.getElementById('sel_perf').value=tabla[0].complejidad;
      		$("#mult_perf").value=tabla[0].nro;
      		$("#out_perf").html(tabla[0].total);
      		
      		document.getElementById('sel_pv_boto').value=tabla[1].botones;
      		document.getElementById('sel_pv_camp').value=tabla[1].campos;
      		document.getElementById('sel_pv_comp').value=tabla[1].complejidad;
      		document.getElementById('sel_pv_list').value=tabla[1].listados;
      		$("#mult_pv").value=tabla[1].nro;
      		$("#out_pv").html(tabla[1].total);
      		
      		document.getElementById('sel_neg').value=tabla[2].logica;
      		$("#mult_neg").value=tabla[2].nro;
      		$("#out_neg").html(tabla[2].total);
      		
      		document.getElementById('sel_pers').value=tabla[3].accesos;
      		$("#mult_pers").value=tabla[3].nro;
      		$("#out_pers").html(tabla[3].total);
      		
      		document.getElementById('sel_cu').value=tabla[4].dificultad;
      		$("#out_cu").html(tabla[4].total);
      		
      		document.getElementById('sel_inte').value=tabla[5].complejidad;
      		$("#mult_inte").value=tabla[5].nro;
      		$("#out_inte").html(tabla[5].total);
 		}
	      function doAjaxAddRow() {
                $.ajax({
                    type: "POST",
                    url: "testing/addRow",
                    success: function(module){      
                       console.log(module);
                       refreshTable(module);
                    },
	                error: function(e){
	                	console.log('Error: ' + e);
	                }
                });
               
            }
	      function doAjaxEdit(id){
	          $.ajax({
	                    type: "POST",
	                    url: "testing",
	                    success: function(module){     
	                        if(id == undefined){
	                            refreshTable(module);
	                        } else {
	                            editTable(module, id);
	                        }
	                        $("#showAtributos").show();
	                    },
		                error: function(e){
		                    console.log('Error: ' + e);
		                }
	                });
	      }
	      function doAjaxSaveRow(id){
	          var perfiles = {};
	          perfiles["complejidad"] = 0;
	          perfiles["nro"] = 0;
	          perfiles["total"] = 5;
	          var data = {};
	          data["name"] = "test52";
	          data["caseOfUse"] = "test123";
	          data["code"] = "test";
	          data["tablas"] = [perfiles];
	          $.ajax({
	                    type: "POST",
	                    url: "testing/saveRow/"+id,
	                    dataType: "json",
		                contentType: "application/json; charset=utf-8",
	                    data: JSON.stringify(data),
	                    success: function(module){     
	                        refreshTable(module);
	                        $("#showAtributos").hide();
	                    },
		                error: function(e){
		                    console.log('Error: ' + e);
		                }
		                
	                });
	      }
	      function doAjaxDelete(id){
	          $.ajax({
	                    type: "DELETE",
	                    url: "testing/delete/"+id,
	                    success: function(module){      
	                        console.log(module);
							refreshTable(module);
	                    },
		                error: function(e){
		                    console.log('Error: ' + e);
		                }
	                });
	      }
		</script>
    </head>
      <body>
      <div id="page-wrapper">
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Criterios</h1>
            </div>
            <!-- /.col-lg-12 -->
         </div>

         <!-- /.row -->
         <div class="row">
               <div class="panel panel-default">
                  <div class="panel-heading">
                     Módulos 
                  </div>
                  <!-- /.panel-heading -->
                  <div class="panel-body">
                     <table width="100%" class="table table-responsive table-striped table-bordered table-hover tableForm" id="dataTables-example">
                        <thead>
                           <tr>
                              <th class="col-xs-2">Nombre</th>
                              <th class="col-xs-2">Código</th>
                              <th class="col-xs-2">Caso de uso</th>
                              <th class="col-xs-1">Total</th>
                              <th class="col-xs-2">Valoración</th>
                           </tr>
                        </thead>
					    <tbody id="moduleTable">
                           <!--<c:forEach var="module" items="${modules}">
                          			<c:choose>
                            		<c:when test="${module.code eq display}"> 
	                           			<tr class="odd active">
	                           			<spring:url value="/criterios/saveRow" var="saveUrl"/>
	                           			<form name="SaveRow" action="${saveUrl}" id="save" method="POST">
	                               			<td><input type="text" name="moduleName" class="altura form-control" value="${module.name}" maxlength="25"></td>
	                               			<td><input type="text" name="moduleCode" class="altura form-control" value="${module.code}" maxlength="10"></td>
	                               			<td><input type="text" name="moduleCaseOfUse" class="altura form-control" value="${module.caseOfUse}" maxlength="30"></td>
	                               			<td>${module.total}</td>
	                               			<c:choose>
                            		        	<c:when test="${module.total < 7.5}"> 
		                               				<td class="center info">
		                                   				Muy Fácil
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 12.5}"> 
		                               				<td class="center success">
		                                   				Fácil
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 17.5}"> 
		                               				<td class="center warning">
		                                   				Normal
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 22.5}"> 
		                               				<td class="center danger">
		                                   				Complicado
	                                	   		</c:when>
	                                	   		<c:when test="${module.total > 22.5}"> 
		                               				<td class="center danger2">
		                                   				Muy Complicado
	                                	   		</c:when>
	                                	   	</c:choose>
	                                	   	</form>
                                 	  			<div style="float:right">
	                             	      			<div style="float:left">
	                             	      				<button type="submit" class="button ok glyphicon glyphicon-ok"></button>
	                     	             			</div>
	                   		               			
	                   		               			<spring:url value="/criterios/discard" var="discardUrl" />
	                    	           				<div style="float:right">
	                     	   	           				<form name="deleteRow" action="${discardUrl}" method="POST">
	                           	        				<button type="submit" class="button delete glyphicon glyphicon-remove"></button>
														</form>
	                                  				</div>
                                  				</div>
	                                  			
	                              			</td>
	                           			</tr>
                            		</c:when>
                            		<c:when test="${module.code ne display}">
                            			 <tr class="odd" onclick="func_test('${module.code}')">
			                           		<td>${module.name}</td>
				                            <td>${module.code}</td>
				                            <td>${module.caseOfUse}</td>
				                            <td>${module.total}</td>
				                            <c:choose>
                            		        	<c:when test="${module.total < 7.5}"> 
		                               				<td class="center info">
		                                   				Muy Fácil
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 12.5}"> 
		                               				<td class="center success">
		                                   				Fácil
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 17.5}"> 
		                               				<td class="center warning">
		                                   				Normal
	                                	   		</c:when>
	                                	   		<c:when test="${module.total < 22.5}"> 
		                               				<td class="center danger">
		                                   				Complicado
	                                	   		</c:when>
	                                	   		<c:when test="${module.total > 22.5}"> 
		                               				<td class="center danger2">
		                                   				Muy Complicado
	                                	   		</c:when>
	                                	   	</c:choose>
	                                	   	<c:choose>
	                                	   
	                                	   	<c:when test="${empty display}">
			                                	
			                                  	<spring:url value="/criterios/${module.code}/edit" var="editUrl" />
			                                   	<spring:url value="/criterios/${module.code}/delete" var="deleteUrl" />
			                                   	
			                                   	<div style="float:right">
			                                   		<form name="deleteRow" action="${deleteUrl}" method="POST"><button type="submit" class="button delete glyphicon glyphicon-trash"/></form>
			                                   	</div>
			                                   	<div style="float:right">
			                                   		<form name="editRow" action="${editUrl}" method="POST"><button type="submit" class="button edit glyphicon glyphicon-pencil"/></form>
			                                  	</div>
			                                  	
			                                </c:when>
			                                	</c:choose>
			                               </td>
			                           	</tr>
                            		</c:when>
                          			</c:choose>
                           </c:forEach>-->
                        </tbody>
                     </table>
                     <!-- /.table-responsive -->
                     
                     <!-- Notification -->
                     <c:if test="${not empty notification}">
                     	<div class="alert alert-${altype} alert-dismissable">
                     		<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                     		${notification}
                     	</div>
                     </c:if>
                     
 					</div>
                    <!-- Button -->
                    <div class="panel-footer table-footer-fix clearfix">	
                    	<span style="float:left">
                        <!-- <form name="row" action="/proyecto-definitivo/goto/criterios/addRow" method="POST">
                           <button type="submit" class="custom-color left-button corner-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Módulo
                           </button>
                        </form> -->
                         <button type="submit" class="custom-color left-button corner-button" onClick='doAjaxAddRow()'>
                           <i class="glyphicon glyphicon-plus"></i> Crear Módulo
                           </button>
                   	</span> 
					

                  </div>
                  <!-- /.panel-body -->
               </div>
               <!-- /.panel -->

         </div>
         <!-- /.row -->
         <hr>
		<div id="showAtributos">
       		<jsp:include page="./atributos.jsp" />
		</div>
		
      </div>
      <!-- /#page-wrapper -->
		<script>
			$(document).ready(function(){
			    $('[data-toggle="popover"]').popover();   
			});
		</script>
      </body>
</html>