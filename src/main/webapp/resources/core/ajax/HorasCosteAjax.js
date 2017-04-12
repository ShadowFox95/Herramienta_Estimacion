function doAjaxSaveHorasCoste() {

    var delivery1 = {};
    delivery1["nombre"] = "gestion";
    delivery1["porcentaje"] = 0; // document.getElementById('gestion_por').value;
    delivery1["internaPractica"] = 0;
    delivery1["horas"] = 0;
    delivery1["coste"] = 0;

    var delivery2 = {};
    delivery2["nombre"] = "evaluacion";
    delivery2["porcentaje"] = 0;
    delivery2["internaPractica"] = 0;
    delivery2["horas"] = 0;
    delivery2["coste"] = 0;

    var delivery3 = {};
    delivery3["nombre"] = "analisis";
    delivery3["porcentaje"] = 0;
    delivery3["internaPractica"] = 0;
    delivery3["horas"] = 0;
    delivery3["coste"] = 0;

    var delivery4 = {};
    delivery4["nombre"] = "diseno";
    delivery4["porcentaje"] = 0;
    delivery4["internaPractica"] = 0;
    delivery4["horas"] = 0;
    delivery4["coste"] = 0;

    var delivery5 = {};
    delivery5["nombre"] = "construccion";
    delivery5["porcentaje"] = 0;
    delivery5["internaPractica"] = 0;
    delivery5["horas"] = 0;
    delivery5["coste"] = 0;

    var delivery6 = {};
    delivery6["nombre"] = "testing";
    delivery6["porcentaje"] = 0;
    delivery6["internaPractica"] = 0;
    delivery6["horas"] = 0;
    delivery6["coste"] = 0;

    var gestion1 = {};
    gestion1["nombre"] = "calidad";
    gestion1["nivel"] = 0;
    gestion1["porcentaje"] = 0;
    gestion1["internaPractica"] = 0;
    gestion1["horas"] = 0;
    gestion1["coste"] = 0;

    var gestion2 = {};
    gestion2["nombre"] = "seguridad";
    gestion2["nivel"] = 0;
    gestion2["porcentaje"] = 0;
    gestion2["internaPractica"] = 0;
    gestion2["horas"] = 0;
    gestion2["coste"] = 0;

    var gestion3 = {};
    gestion3["nombre"] = "despliegues";
    gestion3["nivel"] = 0;
    gestion3["porcentaje"] = 0;
    gestion3["internaPractica"] = 0;
    gestion3["horas"] = 0;
    gestion3["coste"] = 0;

    var gobierno1 = {};
    gobierno1["nombre"] = "gestionproyecto";
    gobierno1["porcentaje"] = 0;
    gobierno1["internaPractica"] = 0;
    gobierno1["horas"] = 0;
    gobierno1["coste"] = 0;

    var gobierno2 = {};
    gobierno2["nombre"] = "dm";
    gobierno2["porcentaje"] = 0;
    gobierno2["internaPractica"] = 0;
    gobierno2["horas"] = 0;
    gobierno2["coste"] = 0;

    var riesgo = {};
    riesgo["nombre"] = "horascontingencia";
    riesgo["num"] = parseInt(document.getElementById('horascontingencia').innerHTML);

    var valoracionFinal = {};
    valoracionFinal["nombre"] = "totalADMDW";
    valoracionFinal["horas"] = parseInt(document.getElementById('totalhoras_admdw').innerHTML);
    valoracionFinal["coste"] = parseFloat(document.getElementById('totalcoste_admdw').innerHTML);

    var data = {};
    data["delivery1"] = delivery1;
    data["delivery2"] = delivery2;
    data["delivery3"] = delivery3;
    data["delivery4"] = delivery4;
    data["delivery5"] = delivery5;
    data["delivery6"] = delivery6;
    data["gestion1"] = gestion1;
    data["gestion2"] = gestion2;
    data["gestion3"] = gestion3;
    data["gobierno1"] = gobierno1;
    data["gobierno2"] = gobierno2;
    data["riesgo"] = riesgo;
    data["valoracionFinal"] = valoracionFinal;

    console.log(data);
    $.ajax({
        type : "POST",
        url : "costes/save",
        dataType : "json",
        contentType : "application/json; charset=utf-8",
        data : JSON.stringify(data),
        success : function() {

        },
    });
}