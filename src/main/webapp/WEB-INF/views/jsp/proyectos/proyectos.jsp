<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>EF - Proyectos</title>
	</head>
	<body>
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Gestor de proyectos</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
					<div class="panel panel-default ">
					<div class="panel-heading custom-color">
						Gestor de proyectos 
					</div>
						<!-- /.panel-heading -->
						<table width="100%" class="table table-striped tableForm" id="dataTables-example">
							<thead>
								<tr>
									<th class="col-xs-4">Nombre de proyecto</th>
									<th class="col-xs-2">Código</th>
									<th class="col-xs-5">Descripción</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<spring:url value="/criterios/saveRow" var="saveUrl" />
									<td>
										<input class="form-control" type="text" value="nombre" />
									</td>
									<td>
										<input class="form-control" type="text" value="2" />
									</td>
									<td>
										<div class="col-xs-11">
											<input class="form-control" type="text" value="descripcion" />
										</div>
										<spring:url value="/index/2/delete" var="deleteProjectUrl" />
										<div class="col-xs-1">
											<form name="deleteRow" action="${deleteProjectUrl}" method="POST">
												<button type="submit" class="button delete glyphicon glyphicon-trash" />
											</form>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
			</div>
		</div>
		<!-- /.page-wrapper -->
		<jsp:include page="../fragments/footer.jsp" />
	</body>
</html>