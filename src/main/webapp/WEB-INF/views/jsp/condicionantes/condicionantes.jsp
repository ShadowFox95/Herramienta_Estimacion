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
	         	 	Condicionantes de la estimación
	         	</div>	
	         	
	         		<table width="100%" class="table table-condensed table-striped table-bordered tableForm">
	         			<thead>
	         				<tr>
	         					<th class="col-xs-1">Nº</th>
	         					<th class="text-center col-xs-11">Descripción</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>1</td>
        						<td>
        						Para las entidades "Usuarios", "Obras de Arte", "Préstamos" y "Agrupaciones",
        						 se considera que la pantalla de presentación tendrá una complejidad "Normal", es decir,
        						 cuya pantalla constará de 6 a 8 campos.
        						</td>
	         				</tr>
         					<tr>
	         					<td>2</td>
        						<td>
        						Para las entidades "Usuarios", "Obras de Arte", "Préstamos" y "Agrupaciones",
        						 se considera que la complejidad de la lógica de presentación será "Normal",
        						  con comprobaciones simples en multitud de campos.
        						</td>
	         				</tr>
	         				<tr>
	         					<td>3</td>
        						<td>
        						La funcionalidad de "Generación etiqueta" para una obra de arte, se basará
        						 en una exportación en formato pdf de la información básica de la obra de arte
        						  para su posterior impresión. El identificador único de una obra de arte se limitará
        						   al id alfanumérico único generado por la aplicación.
        						</td>
	         				</tr>
	         				<tr>
	         					<td>4</td>
        						<td>
        						La funcionalidad de "Asociar documentos a obra de arte" , se basará en una
        						 búsqueda de documentos dentro del directorio del gestor documental proporcionado
        						  por el cliente. Una vez seleccionado el documento, se guardará la ruta de dicho
        						   fichero en los datos de la obra de arte.
        						</td>
	         				</tr>	
	         				
	         				<tr>
	         					<td>5</td>
        						<td>
        						La funcionalidad de "Visor de documentos" se basará en la apertura del documento
        						 seleccionado dentro de un iframe desarrollado dentro de la aplicación. 
        						 No se desarrollará ningún visor adicional.
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
	         					<th class="col-xs-1">Nº</th>
	         					<th class="text-center col-xs-11">Descripción</th>
	         				</tr>
	         			</thead>
	         			<tbody>
	         				<tr>
	         					<td>1</td>
        						<td>
        						El desarrollo de la aplicación se realizará siguiendo la metodología 
        						propia de la entidad e integrando los desarrollos en la arquitectura 
        						actual del cliente, por lo cual, se considera que el equipo que realizará 
        						estos desarrollos tendrán conocimientos previos de dicha metodología y arquitectura, 
        						no teniendo en cuenta ninguna curva de aprendizaje.
        						</td>
	         				</tr>
         					<tr>
	         					<td>2</td>
        						<td>
        						La nueva aplicación se conectará a la herramienta corporativa de gestión documental, 
        						donde ya existe el directorio estructurado con la información. La aplicación se limitará 
        						a acceder a dicho directorio para la obtención de las rutas de los documentos. 
        						No se encargará de la gestión de los documentos ni se desarrollará ningún visor adicional.
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