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
										<input class="form-control" type="text" value="${pro.nombre}" />
									</td>
									<td>
										<input class="form-control" type="text" value="${pro.codigo}" />
									</td>
									<td>
										<div class="col-xs-11">
											<input class="form-control" type="text" value="${pro.descripcion}" />
										</div>
										<spring:url value="/proyecto-definitivo/2/delete" var="deleteProjectUrl" />
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
			<div class="row">
			<div class="col-lg-12 width-fix1">
         	 <div class="panel panel-default">
	         	<div class="panel-heading">
	         	 	Ajustes Adicionales
	         	</div>	
	         	<div class="panel-body">
	         	<div class="col-xs-8">
<div class="panel panel-default ">
					<div class="panel-heading">
					<strong>¿Editado?</strong> 
					</div>
						<!-- /.panel-heading -->
						<table width="100%" class="table table-striped tableForm" id="dataTables-example">
							
							<tbody>
								<tr>
									<spring:url value="/criterios/saveRow" var="saveUrl" />
									<td>
										<select class="form-control" id="editado" name="editado">
                              		<option value="0">Si</option>
                              		<option value="1">No</option>
                           		</select>
									</td>


								</tr>
							</tbody>
						</table>
					</div>
					</div>
	         	
	         	<div class="col-xs-4">
					<div class="row">
                
             <div class="col-lg-3 col-md-6">
                <div class="panel panel-blue">
                        <div class="panel-heading config-panel">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="glyphicon glyphicon-wrench"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="config-box">
                                    ITR's
                                    </div>
                                </div>
                            </div>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">Configurar</span>
                                <span class="pull-right"><i class="glyphicon glyphicon-chevron-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                </div>
            </div>
        	 </div>
            </div>
			
					
					
			</div>
		</div>
		</div>
		<!-- /.page-wrapper -->
	</body>
</html>