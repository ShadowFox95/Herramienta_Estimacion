function calculate2(fila) {
	
	var row = "solucion_aplica";
	row = fila+"_aplica";
	var aplica=document.getElementById(row).value;
	
	if(aplica==0) {
		row = fila+"_definido";
		document.getElementById(row).disabled = true;
		
		row = fila+"_conocimiento";
		document.getElementById(row).disabled = true;
		
		row = fila+"_impacto";
		document.getElementById(row).innerHTML = 0;
		
		row = fila+"_impacto_hidden";
		document.getElementById(row).value = 0;
		
		row = fila+"_riesgo";
		document.getElementById(row).innerHTML = 0;
		
		row = fila+"_riesgo_hidden";
		document.getElementById(row).value = 0;
	}
}