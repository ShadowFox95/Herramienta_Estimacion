function doAjaxSaveAll() {
    doAjaxSaveFactores();
    doAjaxSaveHorasCoste();
    doAjaxSavePiramide();
    // Implementar SavePiramide
}

// function refreshTableProject(project) {
// var table = "";
// if (project.length == 0) {
// table = "<tr><td colspan='3'>No hay datos para mostrar</td></tr>";
// } else {
// for (i = 0; i < project.length; i++) {
// table += "<tr><td>" + project[i].nombre + "</td>";
// table += "<td>" + project[i].codigoProyecto + "</td>";
// table += "<td>" + project[i].descripcion;
// table += "<div style='float:right'><button type='submit' class='button delete
// glyphicon glyphicon-trash' id='"
// + project[i].id
// + "' onClick='doAjaxDeleteProject(id)'/></div><div
// style='float:right'><button type='submit' class='button edit glyphicon
// glyphicon-pencil' id='"
// + project[i].id + "' onClick='doAjaxEditProject(id)'/></div>";
// table += "</td></tr>";
// }
// }
function refreshTableProject(project) { // Project es una lista
    var table = "";
    if (project.length == 0) {
        table = "";
    } else {
        for (i = 0; i < project.length; i++) {
            table += "<li><a onclick='doAjaxEditProject("+project[i].id+")'>" + project[i].nombre +" ("+project[i].codigoProyecto+")"+ "</a></li>";

    $("#projectList").html(table);
}
}}


function refreshProjectInfo(project){ // Project es un objeto
    var table = "";
	table += "<tr><td>" + project.nombre + "</td>";
    table += "<td>" + project.codigoProyecto + "</td>";
    table += "<td>" + project.descripcion;
    table += "<div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-trash' id='"
		+ project.id
        + "' onClick='doAjaxDeleteProject(id)'/></div><div style='float:right'><button type='submit' class='button edit glyphicon glyphicon-pencil' id='"
        + project.id + "' onClick='doAjaxEditProject(id)'/></div>";
    table += "</td></tr>";

    $("#projectTable").html(table);
}

//table += "<td>" + project[i].codigoProyecto + "</td>";


     

   /*
    * 
    * table += "<td>" + project[i].descripcion; table += "<div
    * style='float:right'><button type='submit' class='button delete glyphicon
    * glyphicon-trash' id='" + project[i].id + "'
    * onClick='doAjaxDeleteProject(id)'/></div><div style='float:right'><button
    * type='submit' class='button edit glyphicon glyphicon-pencil' id='" +
    * project[i].id + "' onClick='doAjaxEditProject(id)'/></div>"; table += "</td></tr>";
    * 
    */


function editProject(project, id) {
    var tabla = "";
}
/*
 * function editTable(module, tablas) { var table = ""; var selected = ""; if
 * (module.length == 0) { table = "<tr><td colspan='5'>No hay datos para
 * mostrar</td></tr>"; $("#showAtributos").hide(); } else { for (i = 0; i <
 * module.length; i++) { if (tablas[0].casosdeUsosCodigo == module[i].id.id) {
 * table += "<tr class='active'><td><input type='text' class='altura
 * form-control' id='selected_name' value='" + module[i].nombre + "'
 * maxlength='25'></td>"; table += "<td><input type='text' class='altura
 * form-control' id='selected_code' value='" + module[i].codigo + "'
 * maxlength='10'></td>"; table += "<td><input type='text' class='altura
 * form-control' id='selected_caseOfUse' value='" + module[i].modulo + "'
 * maxlength='30'></td>"; table += "<td>" + module[i].totalFila + "</td>";
 * if (module[i].totalFila < 7.5) { table += "<td class='center info'>Muy
 * F�cil"; } else if (module[i].totalFila < 12.5) { table += "<td class='center success'>F�cil"; }
 * else if (module[i].totalFila < 17.5) { table += "<td class='center warning'>Normal"; }
 * else if (module[i].totalFila < 22.5) { table += "<td class='center danger'>Complicado"; }
 * else { table += "<td class='center danger2'>Muy Complicado"; } table += "<div
 * style='float:right'><div style='float:left'><button type='submit'
 * class='button ok glyphicon glyphicon-ok' id='" + module[i].id.id + "'
 * onClick='doAjaxSaveRow(id)'></button></div><div style='float:right'><button
 * type='submit' class='button delete glyphicon glyphicon-remove'
 * onClick='doAjaxEdit()'></button></div></div>"; table += "</td></tr>";
 * 
 * populateAtributos(tablas); } else { table += "<tr><td>" + module[i].nombre + "</td>";
 * table += "<td>" + module[i].codigo + "</td>"; table += "<td>" +
 * module[i].modulo + "</td>"; table += "<td>" + module[i].totalFila + "</td>";
 * if (module[i].totalFila < 7.5) { table += "<td class='center info'>Muy
 * F�cil"; } else if (module[i].totalFila < 12.5) { table += "<td class='center success'>F�cil"; }
 * else if (module[i].totalFila < 17.5) { table += "<td class='center warning'>Normal"; }
 * else if (module[i].totalFila < 22.5) { table += "<td class='center danger'>Complicado"; }
 * else { table += "<td class='center danger2'>Muy Complicado"; } // table += "<div
 * style='float:right'><button type='submit' // class='button delete glyphicon
 * glyphicon-trash' // id='"+module[i].code // +"' onClick='doAjaxDelete(id)'/></div><div //
 * style='float:right'><button type='submit' class='button edit // glyphicon
 * glyphicon-pencil' id='"+module[i].code+"' // onClick='doAjaxEdit(id)'/></div>";
 * table += "</td></tr>"; } } // table = selected + table; }
 * 
 * $("#moduleTable").html(table); }
 */

/*
 * function populateAtributos(tabla) { document.getElementById('sel_perf').value =
 * tabla[0].complejidad; $("#mult_perf").value = tabla[0].nro;
 * $("#out_perf").html(tabla[0].total);
 * 
 * document.getElementById('sel_pv_boto').value = tabla[1].botones;
 * document.getElementById('sel_pv_camp').value = tabla[1].campos;
 * document.getElementById('sel_pv_comp').value = tabla[1].complejidad;
 * document.getElementById('sel_pv_list').value = tabla[1].listados;
 * $("#mult_pv").value = tabla[1].nro; $("#out_pv").html(tabla[1].total);
 * 
 * document.getElementById('sel_neg').value = tabla[2].logica;
 * $("#mult_neg").value = tabla[2].nro; $("#out_neg").html(tabla[2].total);
 * 
 * document.getElementById('sel_pers').value = tabla[3].accesos;
 * $("#mult_pers").value = tabla[3].nro; $("#out_pers").html(tabla[3].total);
 * 
 * document.getElementById('sel_cu').value = tabla[4].dificultad;
 * $("#out_cu").html(tabla[4].total);
 * 
 * document.getElementById('sel_inte').value = tabla[5].complejidad;
 * $("#mult_inte").value = tabla[5].nro; $("#out_inte").html(tabla[5].total); }
 * 
 * function doAjaxAddRow() { $.ajax({ type : "POST", url : "criterios/addRow",
 * success : function(module) { $("#showAtributos").hide(); console.log(module);
 * refreshTable(module); }, error : function(e) { console.log('Error: ' + e); }
 * }); }
 * 
 * function doAjaxGetTablas(tablas) { $.ajax({ type : "POST", url :
 * "criteriosAjax", success : function(module) { editTable(module, tablas); }
 * }); }
 */
function doAjaxEditProject(id) {
    $.ajax({
        type : "POST",
        url : "project/edit/" + id,
        success : function(project) {
            console.log(project);
            refreshProjectInfo(project);
        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}
/*
 * function doAjaxSaveRow(id) { var perfiles = {}; perfiles["complejidad"] = 0;
 * perfiles["nro"] = 0; perfiles["total"] = 5; var data = {}; data["name"] =
 * "test52"; data["caseOfUse"] = "test123"; data["code"] = "test";
 * data["tablas"] = [ perfiles ]; $.ajax({ type : "POST", url :
 * "criterios/saveRow/" + id, dataType : "json", contentType :
 * "application/json; charset=utf-8", data : JSON.stringify(data), success :
 * function(module) { refreshTable(module); $("#showAtributos").hide(); }, error :
 * function(e) { console.log('Error: ' + e); }
 * 
 * }); }
 */
function doAjaxDeleteProject(id) {
    $.ajax({
        type : "DELETE",
        url : "projecte/delete/" + id,
        success : function(project) {
            console.log(project);
            refreshTableProject(project);
        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}

function doAjaxLoadProjectTables() {
    $.ajax({
        type : "POST",
        url : "projectAjax",
        success : function(project) {
            console.log(project);
            refreshTableProject(project);
        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}