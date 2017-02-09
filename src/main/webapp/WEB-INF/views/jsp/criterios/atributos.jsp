<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test="${not empty display}">
   <div class="row">
      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               Perfiles
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th class="text-center">NRO</th>
                        <th>
                        	Complejidad 
                        	<span style="float:right">
                        	<spring:url value="/resources/core/images/perfiles.png" var="image_perf" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_perf}' height='91' width='739'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span></a></span>
                        </th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
						<c:if test="${empty perfiles.nro}">
							<c:set target="perfiles.nro" value="1"></c:set>
						</c:if>
                        <td class="center col-xs-1"><input type="text" form="save" name="perfilesNro" class="form-control text-center" value="${perfiles.nro}" id="mult_perf" oninput="func_perf2()" maxlength="2" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
                        <td class="center">
                        <c:choose>
                        	<c:when test="${perfiles.complejidad eq 5}">

                        		<select class="form-control" form="save" id="sel_perf" name="perfilesComplejidad" onchange="func_perf()">
                              		<option selected value="5">Fácil</option>
                              		<option value="10">Normal</option>
                              		<option value="15">Complejo</option>
                           		</select>
                        	</c:when>
                        	<c:when test="${perfiles.complejidad eq 10}">
                        		<select class="form-control" form="save" id="sel_perf" name="perfilesComplejidad" onchange="func_perf()">
                              		<option value="5">Fácil</option>
                              		<option selected value="10">Normal</option>
                              		<option value="15">Complejo</option>
                           		</select>
                        	</c:when>
                        	<c:when test="${perfiles.complejidad eq 15}">
                        		<select class="form-control" form="save" id="sel_perf" name="perfilesComplejidad" onchange="func_perf()">
                              		<option selected value="5">Fácil</option>
                              		<option value="10">Normal</option>
                              		<option selected value="15">Complejo</option>
                           		</select>
                        	</c:when>
                        </c:choose>
                           
                        </td>
                        <td class="info col-xs-2 center">
						<c:if test="${empty perfiles.total}">
							<c:set target="perfiles.total" value="5"></c:set>
						</c:if>
                           <h5 id="out_perf">${perfiles.total}</h5>
                           <input type="hidden" form="save" id="out_perf2" name="perfilesTotal" value="${perfiles.total}"/>
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->

      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               Pantalla/Vista
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th class="text-center">NRO</th>
                        <th>Campos
                            <span style="float:right">
                        	<spring:url value="/resources/core/images/vista/campos.png" var="image_pv1" />
                        	<a  href="#" title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_pv1}' height='127' width='610'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span></a></span>
                        </th>
                        <th>Complejidad
                            <span style="float:right">
                        	<spring:url value="/resources/core/images/vista/logica.png" var="image_pv2" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_pv2}' height='127' width='493'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span></a></span>
                        </th>
                        <th>Listados
                            <span style="float:right">
                        	<spring:url value="/resources/core/images/vista/listados.png" var="image_pv3" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_pv3}' height='127' width='610'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span></a></span></th>
                        <th>Botones                        	
                        	<span style="float:right">
                        	<spring:url value="/resources/core/images/vista/acciones.png" var="image_pv4" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_pv4}' height='127' width='493'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span></a></span></th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
						<c:if test="${empty vista.nro}">
							<c:set target="vista.nro" value="1"></c:set>
						</c:if>
                        <td class="center col-xs-1"><input type="text" form="save" name="vistaNro" class="form-control text-center" value="${vista.nro}" id="mult_pv" oninput="func_pv2()" maxlength="2" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
                        
                        <td class="center">
                        <select class="form-control" form="save" id="sel_pv_camp" name="vistaCampos" onchange="func_pv()">
                        <c:choose>
                        	<c:when test="${vista.campos eq 5}">
                        		<option selected value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.campos eq 10}">
                        		<option value="5">Muy Fácil</option>
                              	<option selected value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.campos eq 15}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option selected value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.campos eq 20}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option selected value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.campos eq 25}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                           </select>
                        </td>
                        
                        
                        <td class="center">
                        <select class="form-control" form="save" id="sel_pv_comp" name="vistaComplejidad" onchange="func_pv()">
                        <c:choose>
                        	<c:when test="${vista.complejidad eq 5}">
                        	  <option selected value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.complejidad eq 10}">
                        	  <option value="5">Muy Fácil</option>
                              <option selected value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.complejidad eq 15}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option selected value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.complejidad eq 20}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option selected value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.complejidad eq 25}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                           
                              
                           </select>
                        </td>
                        
                        
                        <td class="center">
                        <select class="form-control" form="save" id="sel_pv_list" name="vistaListados" onchange="func_pv()">
                        <c:choose>
                        	<c:when test="${vista.listados eq 5}">
                        	  <option selected value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.listados eq 10}">
                        	  <option value="5">Muy Fácil</option>
                              <option selected value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.listados eq 15}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option selected value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.listados eq 20}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option selected value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${vista.listados eq 25}">
                        	  <option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                        </select>
                        </td>
                        
                        
                        <td class="center">
                        <select class="form-control" form="save" id="sel_pv_boto" name="vistaBotones" onchange="func_pv()">
                        	<c:choose>
                        		<c:when test="${vista.botones eq 5}">
                        			<option selected value="5">Muy Fácil</option>
                            		<option value="10">Fácil</option>
	                            	<option value="15">Normal</option>
	                            	<option value="20">Complejo</option>
	                            	<option value="25">Muy Complejo</option>
                        		</c:when>
                        		<c:when test="${vista.botones eq 10}">
                        			<option value="5">Muy Fácil</option>
                            		<option selected value="10">Fácil</option>
	                            	<option value="15">Normal</option>
	                            	<option value="20">Complejo</option>
	                            	<option value="25">Muy Complejo</option>
                        		</c:when>
                        		<c:when test="${vista.botones eq 15}">
                        			<option value="5">Muy Fácil</option>
                            		<option value="10">Fácil</option>
	                            	<option selected value="15">Normal</option>
	                            	<option value="20">Complejo</option>
	                            	<option value="25">Muy Complejo</option>
                        		</c:when>
                        		<c:when test="${vista.botones eq 20}">
                        			<option value="5">Muy Fácil</option>
                            		<option value="10">Fácil</option>
	                            	<option value="15">Normal</option>
	                            	<option selected value="20">Complejo</option>
	                            	<option value="25">Muy Complejo</option>
                        		</c:when>
                        		<c:when test="${vista.botones eq 25}">
                        			<option value="5">Muy Fácil</option>
                            		<option value="10">Fácil</option>
	                            	<option value="15">Normal</option>
	                            	<option value="20">Complejo</option>
	                            	<option selected value="25">Muy Complejo</option>
                        		</c:when>
                        	</c:choose>
                           
                            
                           </select>
                        </td>
                        <td class="info center col-xs-2">
                    	    <c:if test="${empty vista.total}">
								<c:set target="vista.total" value="5"></c:set>
							</c:if>
                        	<h5 id="out_pv">${vista.total}</h5>
                        	<input type="hidden" form="save" id="out_pv2" name="vistaTotal" value ="${vista.total}"/>
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->
   </div>
   <!-- /.row -->

   <div class="row">
      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               Negocio
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th class="text-center">NRO</th>
                        <th>Logica
                        <span style="float:right">
                        	<spring:url value="/resources/core/images/negocio.png" var="image_neg" />
                        	<a href="#" title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_neg}' height='127' width='737'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span>
                        	</a>
                        </span>
                        </th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                     <c:if test="${empty negocio.nro}">
							<c:set target="negocio.nro" value="1"></c:set>
						</c:if>
                        <td class="center col-xs-1"><input type="text" form="save" name="negocioNro"class="form-control text-center" value="${negocio.nro}" id="mult_neg" oninput="func_neg2()" maxlength="2" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
                        <td class="center">
                        <select class="form-control" form="save" id="sel_neg" name="negocioLogica" onchange="func_neg()">
                        <c:choose>
                        	<c:when test="${negocio.logica eq 5}">
                        		<option selected value="5">Muy Fácil</option>
                            	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${negocio.logica eq 10}">
                        		<option value="5">Muy Fácil</option>
                            	<option selected value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${negocio.logica eq 15}">
                        		<option value="5">Muy Fácil</option>
                            	<option value="10">Fácil</option>
                              	<option selected value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${negocio.logica eq 20}">
                        		<option value="5">Muy Fácil</option>
                            	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option selected value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${negocio.logica eq 25}">
                        		<option value="5">Muy Fácil</option>
                            	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                           
                           </select>
                        </td>
                        <td class="info center col-xs-2">
                        <c:if test="${empty negocio.total}">
							<c:set target="negocio.total" value="5"></c:set>
						</c:if>
                           <h5 id="out_neg">${negocio.total}</h5>
                           <input type="hidden" form="save" id="out_neg2" name="negocioTotal" value ="${negocio.total}"/>
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->

      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               Persistencia
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th class="text-center">NRO</th>
                        <th>Accesos
                        <span style="float:right">
                        	<spring:url value="/resources/core/images/persistencia.png" var="image_pers" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_pers}' height='127' width='540'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span>
                        	</a>
                        </span>
                        </th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                     	<c:if test="${empty persistencia.nro}">
							<c:set target="persistencia.nro" value="1"></c:set>
						</c:if>
                        <td class="center col-xs-1"><input form="save" type="text" name="persistenciaNro" class="form-control text-center" value="${persistencia.nro}" id="mult_pers" oninput="func_pers2()" maxlength="2" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
                        <td class="center">
                        <select class="form-control" form="save" id="sel_pers" name="persistenciaAccesos" onchange="func_pers()">
                        <c:choose>
                        	<c:when test="${persistencia.accesos eq 5}">
                        		<option selected value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${persistencia.accesos eq 10}">
                        		<option value="5">Muy Fácil</option>
                              	<option selected value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${persistencia.accesos eq 15}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option selected value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${persistencia.accesos eq 20}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option selected value="20">Complejo</option>
                              	<option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${persistencia.accesos eq 25}">
                        		<option value="5">Muy Fácil</option>
                              	<option value="10">Fácil</option>
                              	<option value="15">Normal</option>
                              	<option value="20">Complejo</option>
                              	<option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                           
                              
                           </select>
                        </td>
                        <td class="info center col-xs-2">
                        <c:if test="${empty persistencia.total}">
							<c:set target="persistencia.total" value="5"></c:set>
						</c:if>
                           <h5 id="out_pers">${persistencia.total}</h5>
                           <input form="save" type="hidden" id="out_pers2" name="persistenciaTotal" value ="${persistencia.total}"/>
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->
   </div>
   <!-- /.row -->
	
   <div class="row">
   <c:if test="${not empty cu}">
      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               CU Original
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th>Dificultad
                        <span style="float:right">
                        	<spring:url value="/resources/core/images/cu.png" var="image_cu" />
                        	<a href="#"  title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_cu}' height='127' width='512'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span>
                        	</a>
                        </span>
                        </th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                        <td>
                        <select class="form-control" form="save" id="sel_cu" name="cuDificultad" onchange="func_cu()">
                        <c:choose>
                        	<c:when test="${cu.dificultad eq 5}">
                        	<option selected value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${cu.dificultad eq 10}">
                        	<option value="5">Muy Fácil</option>
                              <option selected value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${cu.dificultad eq 15}">
                        	<option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option selected value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${cu.dificultad eq 20}">
                        	<option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option selected value="20">Complejo</option>
                              <option value="25">Muy Complejo</option>
                        	</c:when>
                        	<c:when test="${cu.dificultad eq 25}">
                        	<option value="5">Muy Fácil</option>
                              <option value="10">Fácil</option>
                              <option value="15">Normal</option>
                              <option value="20">Complejo</option>
                              <option selected value="25">Muy Complejo</option>
                        	</c:when>
                        </c:choose>
                           </select>
                        </td>
                        <td class="center info col-xs-2">
                        	<c:if test="${empty cu.total}">
								<c:set target="cu.total" value="5"></c:set>
							</c:if>
                           <h5 id="out_cu">${cu.total}</h5>
                           <input form="save" type="hidden" id="out_cu2" name="cuTotal" value ="${cu.total}"/>
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->
</c:if>
      <div class="col-lg-6">
         <div class="panel panel-default">
            <div class="panel-heading">
               Integración
            </div>
            <!-- /.panel-heading -->
            <div class="table-responsive">
               <table class="table table-striped table-bordered tableForm">
                  <thead>
                     <tr>
                        <th class="text-center">NRO</th>
                        <th>Complejidad
                        <span style="float:right">
                        	<spring:url value="/resources/core/images/integracion.png" var="image_inte" />
                        	<a href="#" title="" data-toggle="popover" data-placement="top" data-html="true" data-delay='{"show":"500", "hide":"150"}' data-trigger="focus" html=true data-content="<img src='${image_inte}' height='91' width='396'>">
                        	<span class="blu glyphicon glyphicon-info-sign"></span>
                        	</a>
                        </span>
                        </th>
                        <th>Total</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                     	<c:if test="${empty integracion.nro}">
							<c:set target="integracion.nro" value="1"></c:set>
						</c:if>
                        <td class="center col-xs-1"><input type="text" form="save" name="integracionNro" class="form-control text-center" value="${integracion.nro}" id="mult_inte" oninput="func_inte2()" maxlength="2" onkeypress='return event.charCode >= 48 && event.charCode <= 57'></td>
                        <td>
                        <select class="form-control" form="save" id="sel_inte" name="integracionComplejidad" onchange="func_inte()">
                        <c:choose>
                        	<c:when test="${integracion.complejidad eq 2}">
                        	 <option selected value="2">Fácil</option>
                              <option value="5">Normal</option>
                              <option value="10">Complejo</option>
                            </c:when>
                            <c:when test="${integracion.complejidad eq 5}">
                             <option value="2">Fácil</option>
                              <option selected value="5">Normal</option>
                              <option value="10">Complejo</option>
                            </c:when>
                            <c:when test="${integracion.complejidad eq 10}">
                             <option value="2">Fácil</option>
                              <option value="5">Normal</option>
                              <option selected value="10">Complejo</option>
                            </c:when>
                        </c:choose>
                           
                             
                           </select>
                        </td>
                        <td class="info col-xs-2">
                        	<c:if test="${empty integracion.total}">
								<c:set target="integracion.total" value="2"></c:set>
							</c:if>
                           <h5 id="out_inte">+${integracion.total}</h5>
                           <input type="hidden" form="save" id="out_inte2" name="integracionTotal" value ="${integracion.total}">
                        </td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <!-- /.table-responsive -->
         </div>
         <!-- /.panel -->
      </div>
      <!-- /.col-lg-6 -->
   </div>
   <!-- /.row -->

   </form>

</c:if>