<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- Menu Toggle Script -->


<!-- Custom Theme JavaScript -->
<spring:url value="/resources/core/js/custom.min.js" var="coreJs" />

<!-- Bootstrap Core JavaScript -->
<spring:url value="/resources/core/res/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />

<spring:url value="/resources/core/res/jquery/jquery.min.js" var="jQuery" />


<!-- Selectors -->
<spring:url value="/resources/core/js/criterios/selectors.js" var="selectors" />
<spring:url value="/resources/core/js/horas/testing.js" var="control" />
<!-- DataTables JavaScript 
<spring:url value="/resources/core/res/metisMenu/metisMenu.min.js" var="metisMenus" />
<spring:url value="/resources/core/res/datatables/js/jquery.dataTables.min.js" var="dataTables" />
<spring:url value="/resources/core/res/datatables-plugins/dataTables.bootstrap.min.js" var="dataTablesBS" />
<spring:url value="/resources/core/res/datatables-responsive/dataTables.responsive.js" var="dataTablesRes" />-->

<script src="${coreJs}"></script>
<script src="${jQuery}"></script>
<script src="${bootstrapJs}"></script>
<script src="${selectors}"></script>
<script src="${control}"></script>

<!-- <script src="${metisMenu}"></script>
<script src="${dataTables}"></script>
<script src="${dataTablesBS}"></script>
<script src="${dataTablesRes}"></script>
 -->