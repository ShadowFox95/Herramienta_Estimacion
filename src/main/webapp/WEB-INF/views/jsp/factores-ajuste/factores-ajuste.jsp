<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>EF - Factores de Ajuste</title>
</head>
<body>
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
			<div class="panel-heading"></div>
			<div class="panel-body">
				<div class="col-lg-12">
					
					<jsp:include page="./data.jsp"></jsp:include>
					

				</div>
			</div>
			<div class="panel-footer table-footer-fix clearfix">
				<span style="float: right">
					<form name="row"
						action="/proyecto-definitivo/estimacion-horas/saveHoras"
						method="POST">
						<button type="submit"
							class="custom-color right-button corner-button">
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