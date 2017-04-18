function doAjaxSaveFactores() {
    // Factores Ajuste
    var factoresAjuste = {};
    factoresAjuste["factorProductividad"] = document.getElementById('factorProductividad').value;

    var aux1;
    var aux2;
    var boolean;
    var aux11;
    // Factores Complejidad Tecnica
    var factoresComplejidadTecnica1 = {};
    factoresComplejidadTecnica1["nombre"] = "rendimiento";
    if (document.getElementById('rendimiento_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    factoresComplejidadTecnica1["aplica"] = boolean;
    if (!document.getElementById('rendimiento_definicion').disabled) {
        aux1 = document.getElementById('rendimiento_definicion').value;
        aux2 = document.getElementById('rendimiento_exigencia').value;
    } else {
        aux1 = 0;
        aux2 = 0;
    }
    factoresComplejidadTecnica1["gradoDefinicion"] = aux1;
    factoresComplejidadTecnica1["gradoExigencia"] = aux2;
    factoresComplejidadTecnica1["impacto"] = parseInt(document.getElementById('rendimiento_impacto').innerHTML);
    factoresComplejidadTecnica1["riesgo"] = parseInt(document.getElementById('rendimiento_riesgo').innerHTML);

    var factoresComplejidadTecnica2 = {};
    factoresComplejidadTecnica2["nombre"] = "usabilidad";
    if (document.getElementById('usabilidad_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    factoresComplejidadTecnica2["aplica"] = boolean;
    if (!document.getElementById('usabilidad_definicion').disabled) {
        aux1 = document.getElementById('usabilidad_definicion').value;
        aux2 = document.getElementById('usabilidad_exigencia').value;
    } else {
        aux1 = 0;
        aux2 = 0;
    }
    factoresComplejidadTecnica2["gradoDefinicion"] = aux1;
    factoresComplejidadTecnica2["gradoExigencia"] = aux2;
    factoresComplejidadTecnica2["impacto"] = parseInt(document.getElementById('usabilidad_impacto').innerHTML);
    factoresComplejidadTecnica2["riesgo"] = parseInt(document.getElementById('usabilidad_riesgo').innerHTML);

    var factoresComplejidadTecnica3 = {};
    factoresComplejidadTecnica3["nombre"] = "portabilidad";
    if (document.getElementById('portabilidad_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    factoresComplejidadTecnica3["aplica"] = boolean;
    if (!document.getElementById('portabilidad_definicion').disabled) {
        aux1 = document.getElementById('portabilidad_definicion').value;
        aux2 = document.getElementById('portabilidad_exigencia').value;
    } else {
        aux1 = 0;
        aux2 = 0;
    }
    factoresComplejidadTecnica3["gradoDefinicion"] = aux1;
    factoresComplejidadTecnica3["gradoExigencia"] = aux2;
    factoresComplejidadTecnica3["impacto"] = parseInt(document.getElementById('portabilidad_impacto').innerHTML);
    factoresComplejidadTecnica3["riesgo"] = parseInt(document.getElementById('portabilidad_riesgo').innerHTML);

    var factoresComplejidadTecnica4 = {};
    factoresComplejidadTecnica4["nombre"] = "concurrencia";
    if (document.getElementById('concurrencia_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    factoresComplejidadTecnica4["aplica"] = boolean;
    if (!document.getElementById('concurrencia_definicion').disabled) {
        aux1 = document.getElementById('concurrencia_definicion').value;
        aux2 = document.getElementById('concurrencia_exigencia').value;
    } else {
        aux1 = 0;
        aux2 = 0;
    }
    factoresComplejidadTecnica4["gradoDefinicion"] = aux1;
    factoresComplejidadTecnica4["gradoExigencia"] = aux2;
    factoresComplejidadTecnica4["impacto"] = parseInt(document.getElementById('concurrencia_impacto').innerHTML);
    factoresComplejidadTecnica4["riesgo"] = parseInt(document.getElementById('concurrencia_riesgo').innerHTML);

    var factoresComplejidadTecnica5 = {};
    factoresComplejidadTecnica5["nombre"] = "seguridad";
    if (document.getElementById('seguridad_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    factoresComplejidadTecnica5["aplica"] = boolean;
    if (!document.getElementById('seguridad_definicion').disabled) {
        aux1 = document.getElementById('seguridad_definicion').value;
        aux2 = document.getElementById('seguridad_exigencia').value;
    } else {
        aux1 = 0;
        aux2 = 0;
    }
    factoresComplejidadTecnica5["gradoDefinicion"] = aux1;
    factoresComplejidadTecnica5["gradoExigencia"] = aux2;
    factoresComplejidadTecnica5["impacto"] = parseInt(document.getElementById('seguridad_impacto').innerHTML);
    factoresComplejidadTecnica5["riesgo"] = parseInt(document.getElementById('seguridad_riesgo').innerHTML);

    // Arquitecturas de Referencia

    var arquitecturaReferencia1 = {};
    arquitecturaReferencia1["nombre"] = "solucion";
    if (document.getElementById('solucion_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    arquitecturaReferencia1["aplica"] = boolean;
    if (!document.getElementById('solucion_definido').disabled) {
        if(document.getElementById('solucion_definido').value == 0){
        	aux1=false;
        }else{
        	aux1=true
        }
        if (!document.getElementById('solucion_conocimiento').disabled) {
            aux2 = document.getElementById('solucion_conocimiento').value;
        } else {
            aux2=false;
        }
    } else {
        aux1 = false;
    }
    arquitecturaReferencia1["definido"] = aux1;
    arquitecturaReferencia1["gradoConocimento"] = aux2;
    arquitecturaReferencia1["impacto"] = parseInt(document.getElementById('solucion_impacto').innerHTML);
    arquitecturaReferencia1["riesgo"] = parseInt(document.getElementById('solucion_riesgo').innerHTML);

    var arquitecturaReferencia2 = {};
    arquitecturaReferencia2["nombre"] = "integracion";
    if (document.getElementById('integracion_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    arquitecturaReferencia2["aplica"] = boolean;
    if (!document.getElementById('integracion_definido').disabled) {
        if(document.getElementById('solucion_definido').value == 0){
        	aux1=false;
        }else{
        	aux1=true
        }
        if (!document.getElementById('integracion_conocimiento').disabled) {
            aux2 = document.getElementById('integracion_conocimiento').value;
        } else {
            aux2 = 0;
        }
    } else {
        aux1 = false;
    }
    arquitecturaReferencia2["definido"] = aux1;
    arquitecturaReferencia2["gradoConocimento"] = aux2;
    arquitecturaReferencia2["impacto"] = parseInt(document.getElementById('integracion_impacto').innerHTML);
    arquitecturaReferencia2["riesgo"] = parseInt(document.getElementById('integracion_riesgo').innerHTML);

    var arquitecturaReferencia3 = {};
    arquitecturaReferencia3["nombre"] = "logica";
    if (document.getElementById('logica_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    arquitecturaReferencia3["aplica"] = boolean;
    if (!document.getElementById('logica_definido').disabled) {
        if(document.getElementById('solucion_definido').value == 0){
        	aux1=false;
        }else{
        	aux1=true
        }
        if (!document.getElementById('logica_conocimiento').disabled) {
            aux2 = document.getElementById('logica_conocimiento').value;
        } else {
            aux2 = 0;
        }
    } else {
        aux1 = false;
    }
    arquitecturaReferencia3["definido"] = aux1;
    arquitecturaReferencia3["gradoConocimento"] = aux2;
    arquitecturaReferencia3["impacto"] = parseInt(document.getElementById('logica_impacto').innerHTML);
    arquitecturaReferencia3["riesgo"] = parseInt(document.getElementById('logica_riesgo').innerHTML);

    var arquitecturaReferencia4 = {};
    arquitecturaReferencia4["nombre"] = "despliegue";
    if (document.getElementById('despliegue_aplica').value == 0) {
        boolean = false;
    } else {
        boolean = true;
    }
    arquitecturaReferencia4["aplica"] = boolean;
    if (!document.getElementById('despliegue_definido').disabled) {
        if(document.getElementById('solucion_definido').value == 0){
        	aux1=false;
        }else{
        	aux1=true
        }
        if (!document.getElementById('despliegue_conocimiento').disabled) {
            aux2 = document.getElementById('despliegue_conocimiento').value;
        } else {
            aux2 = 0;
        }
    } else {
        aux1 = false;
    }
    arquitecturaReferencia4["definido"] = aux1;
    arquitecturaReferencia4["gradoConocimento"] = aux2;
    arquitecturaReferencia4["impacto"] = parseInt(document.getElementById('despliegue_impacto').innerHTML);
    arquitecturaReferencia4["riesgo"] = parseInt(document.getElementById('despliegue_riesgo').innerHTML);

    // Factores Complejidad Ambiental

    var factoresComplejidadAmbiental1 = {};
    factoresComplejidadAmbiental1["nombre"] = "experiencia";
    factoresComplejidadAmbiental1["valoracion"] = document.getElementById('experiencia_valoracion').value;
    factoresComplejidadAmbiental1["factorCalculado"] = parseInt(document.getElementById('experiencia_calculado').innerHTML);

    var factoresComplejidadAmbiental2 = {};
    factoresComplejidadAmbiental2["nombre"] = "capacidades";
    factoresComplejidadAmbiental2["valoracion"] = document.getElementById('capacidades_valoracion').value;
    factoresComplejidadAmbiental2["factorCalculado"] = parseInt(document.getElementById('capacidades_calculado').innerHTML);

    var factoresComplejidadAmbiental3 = {};
    factoresComplejidadAmbiental3["nombre"] = "calidad";
    factoresComplejidadAmbiental3["valoracion"] = document.getElementById('calidad_valoracion').value;
    factoresComplejidadAmbiental3["factorCalculado"] = parseInt(document.getElementById('calidad_calculado').innerHTML);

    var data = {};
    data["factorAjuste"] = factoresAjuste;
    data["factorComplejidadTecnica1"] = factoresComplejidadTecnica1;
    data["factorComplejidadTecnica2"] = factoresComplejidadTecnica2;
    data["factorComplejidadTecnica3"] = factoresComplejidadTecnica3;
    data["factorComplejidadTecnica4"] = factoresComplejidadTecnica4;
    data["factorComplejidadTecnica5"] = factoresComplejidadTecnica5;
    data["arquitecturaReferencia1"] = arquitecturaReferencia1;
    data["arquitecturaReferencia2"] = arquitecturaReferencia2;
    data["arquitecturaReferencia3"] = arquitecturaReferencia3;
    data["arquitecturaReferencia4"] = arquitecturaReferencia4;
    data["factorComplejidadAmbiental1"] = factoresComplejidadAmbiental1;
    data["factorComplejidadAmbiental2"] = factoresComplejidadAmbiental2;
    data["factorComplejidadAmbiental3"] = factoresComplejidadAmbiental3;

    console.log(data);
    $.ajax({
        type : "POST",
        url : "factores/save",
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