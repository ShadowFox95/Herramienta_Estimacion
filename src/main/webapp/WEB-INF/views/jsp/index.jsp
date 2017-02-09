<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>EF - Home</title>
      <jsp:include page="./fragments/sidebar.jsp" />
      <div id="page-wrapper">
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Gestor de proyectos</h1>
            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
         <div class="row">
            <div class="col-lg-12">
               <div class="panel panel-default ">
                  <!--  <div class="panel-heading ">
                    Lista de proyectos 
                  </div>-->
                  <!-- /.panel-heading -->
                  
                     <table width="100%" class="table table-striped tableForm" id="dataTables-example">
                        <thead >
	                       <tr class="custom-color panel-heading-custom">
								<th colspan="3">Gestor de proyectos</th>
						   </tr>
                           <tr>
                              <th class="col-xs-4">Nombre de proyecto</th>
                              <th class="col-xs-2">Código</th>
                              <th class="col-xs-5">Descripción</th>
                           </tr>
                        </thead>
                        <tbody>
                           <c:forEach var="proyecto" items="${projectes}">
                              <tr>
                                 <spring:url value="/criterios/saveRow" var="saveUrl"/>
                                 <td>${proyecto.nombre}</td>
                                 <td>${proyecto.codigo}</td>
                                 <td>${proyecto.descripcion}
                                  
                                       <spring:url value="/index/${proyecto.codigo}/delete" var="deleteProjectUrl" />
                                       <spring:url value="/index/${proyecto.codigo}/edit" var="editProjectUrl" />
                                       
                                       <div style="float:right">
                                          <form name="deleteRow" action="${deleteProjectUrl}" method="POST"><button type="submit" class="button delete glyphicon glyphicon-trash"/></form>
                                       </div>
                                       <div style="float:right">
                                          <form name="editRow" action="${editProjectUrl}" method="POST"><button type="submit" class="button edit glyphicon glyphicon-pencil"/></form>
                                       </div>
                                  
                                 </td>
                              </tr>
                           </c:forEach>
                        </tbody>
                     </table>
                  <!-- </div>
                   /.panel-body -->
                  
                  <div class="panel-footer table-footer-fix clearfix">
                     <span style="float:left">
                        <form name="row" action="/proyecto-definitivo/index/addRow" method="POST">
                           <button type="submit" class="custom-color left-button corner-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Proyecto
                           </button>
                        </form>
                     </span>
                  </div>
                  <!--  /.panel-footer -->	
               </div>
               <!--  /.panel-default -->	
            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
      </div>
      <!-- /.page-wrapper -->
      <jsp:include page="./fragments/footer.jsp" />
      </body>
</html>