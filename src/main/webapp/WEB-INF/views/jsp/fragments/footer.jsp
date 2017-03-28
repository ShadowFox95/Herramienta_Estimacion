<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- Menu Toggle Script -->

<!-- Custom Theme JavaScript -->
<spring:url value="/resources/core/js/custom.min.js" var="coreJs" />

<!-- Selectors -->
<spring:url value="/resources/core/js/criterios/selectors.js" var="selectors" />
<spring:url value="/resources/core/js/horas/horasycoste.js" var="control" />

<spring:url value="/resources/core/js/factores/factores.js" var="factoresJs" />
<spring:url value="/resources/core/js/control.js" var="controlJs" />

<spring:url value="/resources/core/js/lib/big.js/big.min.js" var="bigDecimal" />

<script src="${controlJs}"></script>
<script src="${bigDecimal}"></script>
<script src="${coreJs}"></script>

<script src="${selectors}"></script>
<script src="${control}"></script>
<script src="${factoresJs}"></script>


 