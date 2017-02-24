<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Estimacion Funcionalidades</title>
      <jsp:include page="./fragments/sidebar.jsp" />
      <div id="page-wrapper-menu">
         <div class="row">
            <div class="col-lg-12">

            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
         <input type="hidden" id="position" value="${control}"/>
         <div class="row">
         <div class="col-lg-12">
<<<<<<< Upstream, based on origin/marius
          <div class="page-header-menu">
             <!-- Nav tabs -->           
             <c:choose>
             	<c:when test="${control == ''}">
             		<jsp:include page="./bienvenida.jsp"/>
             		</div>
             	</c:when>
             	<c:otherwise>
             	             <ul class="nav nav-tabs ">
                    <li id="proyectoLi" class=""><a href="#proyecto" data-toggle="tab" aria-expanded="true">Proyectos</a>          
                    </li>
                    <li id="criteriosLi" class=""><a href="#criterios" data-toggle="tab" aria-expanded="false">Criterios</a>
                    </li>
                    <li id="factores-ajusteLi" class=""><a href="#factores-ajuste" data-toggle="tab" aria-expanded="false">Factores de Ajuste</a>
                    </li>
                    <li id="horasLi" class=""><a href="#horas" data-toggle="tab" aria-expanded="false">Horas y Costes</a>
                    </li>
                    <li id="condicionantesLi" class=""><a href="#condicionantes" data-toggle="tab" aria-expanded="false">Condicionantes</a>
                    </li>
				</li>
			</ul>
			<form name="row" action="/proyecto-definitivo/criterios/saveProject" method="POST">
                     <button type="submit" class="custom-color button-tab">
                     <i class="glyphicon glyphicon-floppy-save"></i>
                     </button>
                </form>
  		
		</div> 
                            <!-- Tab panes -->
                            <div class="tab-content">
                            
                                <div class="tab-pane fade" id="proyecto">
                                    <jsp:include page="./proyectos/proyectos.jsp" />
                                </div>
                                
                                <div class="tab-pane fade" id="criterios">
                                	<div id="content">
                                    <jsp:include page="./criterios/criterios.jsp" />
                                    </div>
                                </div>
                                <div class="tab-pane fade" id="horas">
                                    <jsp:include page="./estimacion-horas/horas.jsp" />
                                </div>
                                <div class="tab-pane fade" id="factores-ajuste">
                                    <jsp:include page="./factores-ajuste/factores-ajuste.jsp" />
                                </div>
                                <div class="tab-pane fade" id="condicionantes">
                                    <jsp:include page="./condicionantes/condicionantes.jsp" />
                                </div>
                            </div>
             	
             	</c:otherwise>
             </c:choose>        
             
=======
                   <div class="page-header-menu">

                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#proyecto" data-toggle="tab" aria-expanded="true">Proyecto</a>
                                </li>
                                <li class=""><a href="#criterios" data-toggle="tab" aria-expanded="false">Criterios</a>
                                </li>
                                <li class=""><a href="#horas" data-toggle="tab" aria-expanded="false">Horas y Costes</a>
                                </li>
                                <li class=""><a href="#factores-ajuste" data-toggle="tab" aria-expanded="false">Factores de Ajuste</a>
                                </li>
                                <li class=""><a href="#condicionantes" data-toggle="tab" aria-expanded="false">Condicionantes</a>
                                </li>
                            </ul>
</div> 
                            <!-- Tab panes -->
                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="proyecto">
                                    <jsp:include page="./proyectos/proyectos.jsp" />
                                </div>
                                <div class="tab-pane fade" id="criterios">
                                    <jsp:include page="./criterios/criterios.jsp" />
                                </div>
                                <div class="tab-pane fade" id="horas">
                                    <jsp:include page="./estimacion-horas/horas.jsp" />
                                </div>
                                <div class="tab-pane fade" id="factores-ajuste">
                                    <jsp:include page="./factores-ajuste/factores-ajuste.jsp" />
                                </div>
                                <div class="tab-pane fade" id="condicionantes">
                                    <jsp:include page="./condicionantes/condicionantes.jsp" />
                                </div>
                            </div>
>>>>>>> efd4d37 Gestor de Proyectos

                   
                </div>
            
         </div>
         <!-- /.row -->
      </div>
      <!-- /.page-wrapper -->


      <jsp:include page="./fragments/footer.jsp" />

     
      </body>
</html>