<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>EF - Condicionantes</title>
      <jsp:include page="../fragments/sidebar.jsp" />
      <div id="page-wrapper">
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Condicionantes</h1>
            </div>
            <!-- /.col-lg-12 -->
         </div>
         <!-- /.row -->
        <div class="row">
         	 <div class="panel panel-default">
         	 	<div class="panel-heading">
	         	 	Condicionantes de la estimaci�n
	         	</div>	
	         	
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-1">N�</th>
	         					<th class="text-center col-xs-11">Descripci�n</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>1</td>
        						<td>
        						Para las entidades "Usuarios", "Obras de Arte", "Pr�stamos" y "Agrupaciones",
        						 se considera que la pantalla de presentaci�n tendr� una complejidad "Normal", es decir,
        						 cuya pantalla constar� de 6 a 8 campos.
        						</td>
	         				</tr>
         					<tr>
	         					<td>2</td>
        						<td>
        						Para las entidades "Usuarios", "Obras de Arte", "Pr�stamos" y "Agrupaciones",
        						 se considera que la complejidad de la l�gica de presentaci�n ser� "Normal",
        						  con comprobaciones simples en multitud de campos.
        						</td>
	         				</tr>
	         				<tr>
	         					<td>3</td>
        						<td>
        						La funcionalidad de "Generaci�n etiqueta" para una obra de arte, se basar�
        						 en una exportaci�n en formato pdf de la informaci�n b�sica de la obra de arte
        						  para su posterior impresi�n. El identificador �nico de una obra de arte se limitar�
        						   al id alfanum�rico �nico generado por la aplicaci�n.
        						</td>
	         				</tr>
	         				<tr>
	         					<td>4</td>
        						<td>
        						La funcionalidad de "Asociar documentos a obra de arte" , se basar� en una
        						 b�squeda de documentos dentro del directorio del gestor documental proporcionado
        						  por el cliente. Una vez seleccionado el documento, se guardar� la ruta de dicho
        						   fichero en los datos de la obra de arte.
        						</td>
	         				</tr>	
	         				
	         				<tr>
	         					<td>5</td>
        						<td>
        						La funcionalidad de "Visor de documentos" se basar� en la apertura del documento
        						 seleccionado dentro de un iframe desarrollado dentro de la aplicaci�n. 
        						 No se desarrollar� ning�n visor adicional.
        						</td>
	         				</tr>	
	         				
	         			</tbody>
	         		</table>
      </div>
      </div>
      <div class="row">
         	 <div class="panel panel-default">
         	 	<div class="panel-heading">
	         	 	Otros condicionantes
	         	</div>	
	         	
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-1">N�</th>
	         					<th class="text-center col-xs-11">Descripci�n</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>1</td>
        						<td>
        						El desarrollo de la aplicaci�n se realizar� siguiendo la metodolog�a 
        						propia de la entidad e integrando los desarrollos en la arquitectura 
        						actual del cliente, por lo cual, se considera que el equipo que realizar� 
        						estos desarrollos tendr�n conocimientos previos de dicha metodolog�a y arquitectura, 
        						no teniendo en cuenta ninguna curva de aprendizaje.
        						</td>
	         				</tr>
         					<tr>
	         					<td>2</td>
        						<td>
        						La nueva aplicaci�n se conectar� a la herramienta corporativa de gesti�n documental, 
        						donde ya existe el directorio estructurado con la informaci�n. La aplicaci�n se limitar� 
        						a acceder a dicho directorio para la obtenci�n de las rutas de los documentos. 
        						No se encargar� de la gesti�n de los documentos ni se desarrollar� ning�n visor adicional.
        						</td>
	         				</tr>
	         				
	         			</tbody>
	         		</table>
	      </div>
      </div>
      <!-- /.page-wrapper -->
      <jsp:include page="../fragments/footer.jsp" />
      </body>
</html>