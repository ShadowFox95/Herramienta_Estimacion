function calculate(aplica) {
		var apl = 0; 
		apl = aplica;
	
	if(aplica == 0){
		document.getElementById("rendimiento_definicion").disabled = true;
		document.getElementById("rendimiento_definicion").disabled = true;
		
		document.getElementById("rendimiento_impacto").value = parseInt(0);
		document.getElementById("rendimiento_riesgo").value = parseInt(0);
		document.getElementById("rendimiento_impacto").innerHTML = parseInt(0);
		document.getElementById("rendimiento_riesgo").innerHTML = parseInt(0);
		
	} else {
		document.getElementById("rendimiento_definicion").disabled = false;
		document.getElementById("rendimiento_exigencia").disabled = false;
		
		var definicion = 0;
		definicion= parseInt(document.getElementById("rendimiento_definicion").value);
		var exigencia = 0;
		exigencia = parseInt(document.getElementById("rendimiento_exigencia").value);
				
		document.getElementById("rendimiento_impacto").value = parseInt(2+(exigencia*2));
		document.getElementById("rendimiento_riesgo").value = parseInt(15-(definicion*5));
		document.getElementById("rendimiento_impacto").innerHTML = parseInt(2+(exigencia*2));
		document.getElementById("rendimiento_riesgo").innerHTML = parseInt(15-(definicion*5));
	}
	
}
