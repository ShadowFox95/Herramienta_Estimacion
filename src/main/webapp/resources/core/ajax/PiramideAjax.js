function doAjaxSavePiramide() {

    var delivery_gestion = {};
    delivery_gestion["nombre"] = "delivery_gestion";
    delivery_gestion["gdo1"] = document.getElementById('gestion_gdo1').value;
    delivery_gestion["gdo2"] = document.getElementById('gestion_gdo2').value; 
    delivery_gestion["gdo3"] = document.getElementById('gestion_gdo3').value;
    delivery_gestion["gdo4"] = document.getElementById('gestion_gdo4').value;
    delivery_gestion["gdo5"] = document.getElementById('gestion_gdo5').value;
    delivery_gestion["gdo6"] = document.getElementById('gestion_gdo6').value;
    delivery_gestion["gdo7"] = document.getElementById('gestion_gdo7').value;
    if	(document.getElementById('gestion_checker').value==0){
    	delivery_gestion["validez"]=false;
    }else{
    	delivery_gestion["validez"]=true;
    }
    
    delivery_gestion["itrmedio"] = document.getElementById('gestion_itrmedio').value;
    if(delivery_gestion["itrmedio"] == undefined){
    	delivery_gestion["itrmedio"] = 0;
    }
/*
    var piramide2 = {};
    piramide2["nombre"] = "evaluacion";
    piramide2["porcentaje"] = document.getElementById('evaluacion_por').value;
    piramide2["internaPractica"] = 0;
    piramide2["horas"] = parseInt(document.getElementById('evaluacion_horas').innerHTML);
    piramide2["coste"] = parseInt(document.getElementById('evaluacion_coste').innerHTML);

    var piramide3 = {};
    piramide3["nombre"] = "analisis";
    piramide3["porcentaje"] = parseInt(document.getElementById('analisis_por').innerHTML);
    if(document.getElementById('analisis_ip').value==0){
    	piramide3["internaPractica"] = false;
    }else{
    	piramide3["internaPractica"] = true;
    	
    }
    piramide3["horas"] = parseInt(document.getElementById('analisis_horas').innerHTML);
    piramide3["coste"] = parseInt(document.getElementById('analisis_coste').innerHTML);

    var piramide4 = {};
    piramide4["nombre"] = "diseno";
    piramide4["porcentaje"] = document.getElementById('diseno_por').value;
    piramide4["internaPractica"] = 0;
    piramide4["horas"] = parseInt(document.getElementById('diseno_horas').innerHTML);
    piramide4["coste"] = parseInt(document.getElementById('diseno_coste').innerHTML);

    var piramide5 = {};
    piramide5["nombre"] = "construccion";
    piramide5["porcentaje"] = document.getElementById('construccion_por').value;
    piramide5["internaPractica"] = 0;
    piramide5["horas"] = parseInt(document.getElementById('construccion_horas').innerHTML);
    piramide5["coste"] = parseInt(document.getElementById('construccion_coste').innerHTML);;

    var piramide6 = {};
    piramide6["nombre"] = "testing";
    piramide6["porcentaje"] = parseInt(document.getElementById('testing_por').innerHTML);
    if(document.getElementById('testing_ip').value==0){
    	piramide6["internaPractica"] = false;
    }else{
    	piramide6["internaPractica"] = true;
    }
    piramide6["horas"] = parseInt(document.getElementById('testing_horas').innerHTML);
    piramide6["coste"] = parseInt(document.getElementById('testing_coste').innerHTML);

    var gestion1 = {};
    gestion1["nombre"] = "calidad";
    gestion1["nivel"] = document.getElementById('calidad_niv').value;
    gestion1["porcentaje"] = parseInt(document.getElementById('calidad_por').innerHTML);
    if (document.getElementById('testing_ip').value==0) {
    	gestion1["internaPractica"] = false;
    }else{
    	gestion1["internaPractica"] = true;
    }
    gestion1["horas"] = parseInt(document.getElementById('calidad_horas').innerHTML);
    gestion1["coste"] = parseInt(document.getElementById('calidad_coste').innerHTML);

    var gestion2 = {};
    gestion2["nombre"] = "seguridad";
    gestion2["nivel"] = document.getElementById('seguridad_niv').value;
    gestion2["porcentaje"] = parseInt(document.getElementById('seguridad_por').innerHTML);
    if (document.getElementById('seguridad_ip').value==0){
    	gestion2["internaPractica"] = false;
    	
    }else{
    	gestion2["internaPractica"] = true;
    }
    gestion2["horas"] = parseInt(document.getElementById('seguridad_horas').innerHTML);
    gestion2["coste"] = parseInt(document.getElementById('seguridad_coste').innerHTML);

    var gestion3 = {};
    gestion3["nombre"] = "despliegues";
    gestion3["nivel"] = document.getElementById('despliegues_niv').value;
    gestion3["porcentaje"] = parseInt(document.getElementById('despliegues_por').innerHTML);
    if(document.getElementById('despliegues_ip').value==0){
    	gestion3["internaPractica"] = false;    	
    }else{
    	gestion3["internaPractica"] = true;
    }
    gestion3["horas"] =  parseInt(document.getElementById('despliegues_horas').innerHTML);
    gestion3["coste"] =  parseInt(document.getElementById('despliegues_coste').innerHTML);

    var gobierno1 = {};
    gobierno1["nombre"] = "gestionproyecto";
    gobierno1["porcentaje"] = document.getElementById('gestionproyecto_por').value;
    if(document.getElementById('gestionproyecto_ip').value==0){
    	gobierno1["internaPractica"] = false;
    	
    }else{
    	gobierno1["internaPractica"] = true;
    }
    gobierno1["horas"] = parseInt(document.getElementById('gestionproyecto_horas').innerHTML);
    gobierno1["coste"] = parseInt(document.getElementById('gestionproyecto_coste').innerHTML);

    var gobierno2 = {};
    gobierno2["nombre"] = "dm";
    gobierno2["porcentaje"] = document.getElementById('dm_por').value;
    gobierno2["internaPractica"] = 0;
    gobierno2["horas"] = parseInt(document.getElementById('dm_horas').innerHTML);
    gobierno2["coste"] = parseInt(document.getElementById('dm_coste').innerHTML);

    var riesgo = {};
    riesgo["nombre"] = "horascontingencia";
    riesgo["num"] = parseInt(document.getElementById('horascontingencia').innerHTML);

    var valoracionFinal = {};
    valoracionFinal["nombre"] = "totalADMDW";
    valoracionFinal["horas"] = parseInt(document.getElementById('totalhoras_admdw').innerHTML);
    valoracionFinal["coste"] = parseFloat(document.getElementById('totalcoste_admdw').innerHTML);
*/
    var data = {};
    data["delivery_gestion"] = delivery_gestion;
   /* data["evaluacion_gdo1"] = evaluacion_gdo1;
    data["gestion_gdo1"] = gestion_gdo1;
    data["piramide4"] = piramide4;
    data["piramide5"] = piramide5;
    data["piramide6"] = piramide6;
    data["gestion1"] = gestion1;
    data["gestion2"] = gestion2;
    data["gestion3"] = gestion3;
    data["gobierno1"] = gobierno1;
    data["gobierno2"] = gobierno2;
    data["riesgo"] = riesgo;
    data["valoracionFinal"] = valoracionFinal;
*/
    console.log(data);
    $.ajax({
        type : "POST",
        url : "piramide/save",
        dataType : "json",
        contentType : "application/json; charset=utf-8",
        data : JSON.stringify(data),
        success : function() {

        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}