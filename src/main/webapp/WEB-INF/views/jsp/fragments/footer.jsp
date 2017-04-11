<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- Menu Toggle Script -->

<!-- Custom Theme JavaScript -->
<spring:url value="/resources/core/js/custom.min.js" var="coreJs" />

<!-- Selectors -->
<spring:url value="/resources/core/js/criterios/selectors.js" var="selectors" />
<spring:url value="/resources/core/js/horas/horasycoste.js" var="control" />
<spring:url value="/resources/core/js/factores/factores.js" var="factoresJs" />
<spring:url value="/resources/core/js/piramide/piramide.js" var="piramideJs" />
<spring:url value="/resources/core/js/control.js" var="controlJs" />

<spring:url value="/resources/core/js/lib/big.js/big.min.js" var="bigDecimal" />

<!-- Ajax -->
<spring:url value="/resources/core/ajax/CriteriosAjax.js" var="CriteriosAjax" />
<spring:url value="/resources/core/ajax/ProyectoAjax.js" var="ProyectoAjax" />

<script src="${controlJs}"></script>
<script src="${bigDecimal}"></script>
<script src="${coreJs}"></script>

<script src="${selectors}"></script>
<script src="${control}"></script>
<script src="${factoresJs}"></script>
<script src="${piramideJs}"></script>

<script src="${CriteriosAjax}"></script>
<script src="${ProyectoAjax}"></script>