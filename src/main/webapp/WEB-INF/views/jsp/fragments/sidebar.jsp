<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<spring:url value="/resources/core/res/custom/custom.css" var="coreCss" />
	<spring:url value="/resources/core/res/bootstrap/css/bootstrap.min.css" var="bootstrapCss" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${coreCss}" rel="stylesheet" />
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<script src="/resources/core/js/datatable.js"></script>
</head>

<body>
<c:set var="url" value="${ pageContext.request.requestURI }" />
	<div id="wrapper">
    	<div class="nav-side-menu">
        	<div class="brand"><a href="/proyecto-definitivo/index/">Estimación funcionalidades</a></div>
         	<i class="glyphicon glyphicon-menu-hamburger toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
         	<div class="menu-list">
            	<ul id="menu-content" class="menu-content collapse out">
            <!-- 
            		<div class="panel-heading">
            	    	<h4 class="panel-title">
            	        	<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">Proyectos</a>
            	        </h4>
            	    </div>
                	<div id="collapseOne" class="panel-collapse collapse in">
                		<div class="panel-body" style="color: black;">
                    		<li>
                    	    	<a href="panels-wells.html">Proyecto 1</a>
                    	    </li>
                    	    <li>
                    	        <a href="panels-wells.html">Proyecto 2</a>
                    	    </li>
                    	    <li>
                    	        <a href="panels-wells.html">Proyecto 3</a>
                    	    </li>
                    	    <li>
                    	        <a href="panels-wells.html">Proyecto 4</a>
                    	    </li>
		
						</div>
					</div>-->
					<li>
    	                             
    	      			<a  href="#" id="collapsable" data-toggle="collapse" data-target="#toggleDemo" data-parent="#sidenav01" class="collapsed">
    	      				<b>Proyectos</b> <span class="fa arrow"></span>
    	      			</a>
    	      			<div class="collapse" id="toggleDemo" style="height: 0px;">
    	       				<ul class="expandibles">
    	       				<c:forEach var="proyecto" items="${projectes}">
    	          				<li><a href="${proyecto.codigo}/edit">${proyecto.nombre} (${proyecto.codigo})</a></li>
    	          			</c:forEach>
    	          			<form name="row" action="/proyecto-definitivo/index/addRow" method="POST">
    	          			<li>
                           <button type="submit" class="custom-color left-button corner-button">
                           <i class="glyphicon glyphicon-plus"></i> Crear Proyecto
                           </button>
                           </li>
                        </form>
        	    			</ul>
        	    		</div>
        			</li>
           			<!--<li <c:if test="${fn:contains(url, 'criterios')}"> class="active" </c:if>>
            			<a href="/proyecto-definitivo/criterios">Criterios</a>
            		</li>
            		<li <c:if test="${fn:contains(url, 'factores-ajuste')}"> class="active" </c:if>>
            			<a href="/proyecto-definitivo/factores-ajuste">Factores de ajuste</a>
            		</li>
            		<li <c:if test="${fn:contains(url, 'horas')}"> class="active" </c:if>>
                		<a href="/proyecto-definitivo/estimacion-horas">Estimación de horas y costes</a>
            		</li>
            		<li <c:if test="${fn:contains(url, 'condicionantes')}"> class="active" </c:if>>
                		<a href="/proyecto-definitivo/condicionantes">Condicionantes</a>
            		</li>
            		<li <c:if test="${fn:contains(url, 'costes')}"> class="active" </c:if>>
                		<a href="/proyecto-definitivo/costes">Costes</a>
            		</li>-->
        		</ul>
     		</div>
  		</div>
	</div>