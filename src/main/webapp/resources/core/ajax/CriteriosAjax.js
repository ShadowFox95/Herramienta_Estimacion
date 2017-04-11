function refreshTable(module) {
    var table = "";
    if (module.length == 0) {
        table = "<tr><td colspan='5'>No hay datos para mostrar</td></tr>";
        $("#showAtributos").hide();
    } else {
        for (i = 0; i < module.length; i++) {
            table += "<tr><td>" + module[i].nombre + "</td>";
            table += "<td>" + module[i].codigo + "</td>";
            table += "<td>" + module[i].modulo + "</td>";
            table += "<td>" + module[i].totalFila + "</td>";
            if (module[i].totalFila < 7.5) {
                table += "<td class='center info'>Muy Fácil";
            } else if (module[i].totalFila < 12.5) {
                table += "<td class='center success'>Fácil";
            } else if (module[i].totalFila < 17.5) {
                table += "<td class='center warning'>Normal";
            } else if (module[i].totalFila < 22.5) {
                table += "<td class='center danger'>Complicado";
            } else {
                table += "<td class='center danger2'>Muy Complicado";
            }
            table += "<div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-trash' id='"
                    + module[i].id.id
                    + "' onClick='doAjaxDelete(id)'/></div><div style='float:right'><button type='submit' class='button edit glyphicon glyphicon-pencil' id='"
                    + module[i].id.id + "' onClick='doAjaxEdit(id)'/></div>";
            table += "</td></tr>";
        }
    }

    $("#moduleTable").html(table);
}

function editTable(module, tablas) {
    var table = "";
    var selected = "";
    if (module.length == 0) {
        table = "<tr><td colspan='5'>No hay datos para mostrar</td></tr>";
        $("#showAtributos").hide();
    } else {
        for (i = 0; i < module.length; i++) {
            if (tablas[0].casosdeUsosCodigo == module[i].id.id) {
                table += "<tr class='active'><td><input type='text' class='altura form-control' id='selected_name' value='"
                        + module[i].nombre + "' maxlength='25'></td>";
                table += "<td><input type='text' class='altura form-control' id='selected_code' value='"
                        + module[i].codigo + "' maxlength='10'></td>";
                table += "<td><input type='text' class='altura form-control' id='selected_caseOfUse' value='"
                        + module[i].modulo + "' maxlength='30'></td>";
                table += "<td>" + module[i].totalFila + "</td>";
                if (module[i].totalFila < 7.5) {
                    table += "<td class='center info'>Muy Fácil";
                } else if (module[i].totalFila < 12.5) {
                    table += "<td class='center success'>Fácil";
                } else if (module[i].totalFila < 17.5) {
                    table += "<td class='center warning'>Normal";
                } else if (module[i].totalFila < 22.5) {
                    table += "<td class='center danger'>Complicado";
                } else {
                    table += "<td class='center danger2'>Muy Complicado";
                }
                table += "<div style='float:right'><div style='float:left'><button type='submit' class='button ok glyphicon glyphicon-ok' id='"
                        + module[i].id.id
                        + "' onClick='doAjaxSaveRow(id)'></button></div><div style='float:right'><button type='submit' class='button delete glyphicon glyphicon-remove' onClick='doAjaxEdit()'></button></div></div>";
                table += "</td></tr>";

                populateAtributos(tablas);
            } else {
                table += "<tr><td>" + module[i].nombre + "</td>";
                table += "<td>" + module[i].codigo + "</td>";
                table += "<td>" + module[i].modulo + "</td>";
                table += "<td>" + module[i].totalFila + "</td>";
                if (module[i].totalFila < 7.5) {
                    table += "<td class='center info'>Muy Fácil";
                } else if (module[i].totalFila < 12.5) {
                    table += "<td class='center success'>Fácil";
                } else if (module[i].totalFila < 17.5) {
                    table += "<td class='center warning'>Normal";
                } else if (module[i].totalFila < 22.5) {
                    table += "<td class='center danger'>Complicado";
                } else {
                    table += "<td class='center danger2'>Muy Complicado";
                }

                // table += "<div style='float:right'><button type='submit'
                // class='button delete glyphicon glyphicon-trash'
                // id='"+module[i].code
                // +"' onClick='doAjaxDelete(id)'/></div><div
                // style='float:right'><button type='submit' class='button edit
                // glyphicon glyphicon-pencil' id='"+module[i].code+"'
                // onClick='doAjaxEdit(id)'/></div>";
                table += "</td></tr>";
            }
        }
        // table = selected + table;
    }

    $("#moduleTable").html(table);
}

function populateAtributos(tabla) {
    document.getElementById('sel_perf').value = tabla[0].complejidad;
    $("#mult_perf").value = tabla[0].nro;
    $("#out_perf").html(tabla[0].total);

    document.getElementById('sel_pv_boto').value = tabla[1].botones;
    document.getElementById('sel_pv_camp').value = tabla[1].campos;
    document.getElementById('sel_pv_comp').value = tabla[1].complejidad;
    document.getElementById('sel_pv_list').value = tabla[1].listados;
    $("#mult_pv").value = tabla[1].nro;
    $("#out_pv").html(tabla[1].total);

    document.getElementById('sel_neg').value = tabla[2].logica;
    $("#mult_neg").value = tabla[2].nro;
    $("#out_neg").html(tabla[2].total);

    document.getElementById('sel_pers').value = tabla[3].accesos;
    $("#mult_pers").value = tabla[3].nro;
    $("#out_pers").html(tabla[3].total);

    document.getElementById('sel_cu').value = tabla[4].complejidad;
    $("#out_cu").html(tabla[4].total);

    document.getElementById('sel_inte').value = tabla[5].complejidad;
    $("#mult_inte").value = tabla[5].nro;
    $("#out_inte").html(tabla[5].total);
}

function doAjaxAddRow() {
    $.ajax({
        type : "POST",
        url : "criterios/addRow",
        success : function(module) {
            $("#showAtributos").hide();
            console.log(module);
            refreshTable(module);
        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });

}

function doAjaxGetTablas(tablas) {
    $.ajax({
        type : "POST",
        url : "criteriosAjax",
        success : function(module) {
            editTable(module, tablas);
        }
    });
}

function doAjaxEdit(id) {
    if (id == undefined) {
        $.ajax({
            type : "POST",
            url : "criteriosAjax",
            success : function(module) {
                refreshTable(module);
                $("#showAtributos").hide();
            },
            error : function(e) {
                console.log('Error: ' + e);
            }
        });
    } else {
        $.ajax({
            type : "POST",
            url : "criterios/edit/" + id,
            success : function(tablas) {
                console.log(tablas);
                doAjaxGetTablas(tablas);
                $("#showAtributos").show();
            },
            error : function(e) {
                console.log('Error: ' + e);
            }
        });
    }
}

function doAjaxSaveRow(id) {
    auxid = parseInt(id);
    var aux = {};
    aux["id"] = auxid;
    aux["idProyecto"] = 1;
    var casosUso = {};
    casosUso["id"] = aux;
    casosUso["nombre"] = document.getElementById('selected_name').value;
    casosUso["codigo"] = document.getElementById('selected_code').value;
    casosUso["modulo"] = document.getElementById('selected_caseOfUse').value;
    
    
    var perfiles = {};
    perfiles["casosdeUsosCodigo"] = auxid;
    perfiles["complejidad"] = document.getElementById('sel_perf').value;
    perfiles["nro"] = document.getElementById('mult_perf').value;
    perfiles["total"] = parseInt(document.getElementById('out_perf').innerHTML);
    
    var vista = {};
    vista["casosdeUsosCodigo"] = auxid;
    vista["complejidad"] = document.getElementById('sel_pv_comp').value;
    vista["nro"] = document.getElementById('mult_pv').value;
    vista["botones"] = document.getElementById('sel_pv_boto').value;
    vista["campos"] = document.getElementById('sel_pv_camp').value;
    vista["listados"] = document.getElementById('sel_pv_list').value;
    vista["total"] =  parseInt(document.getElementById('out_pv').innerHTML);

    var negocio = {};
    negocio["casosdeUsosCodigo"] = auxid;
    negocio["logica"] = document.getElementById('sel_neg').value;
    negocio["nro"] = document.getElementById('mult_neg').value;
    negocio["total"] = parseInt(document.getElementById('out_neg').innerHTML);
    
    var persistencia = {};
    persistencia["casosdeUsosCodigo"] = auxid;
    persistencia["accesos"] = document.getElementById('sel_pers').value;
    persistencia["nro"] = document.getElementById('mult_pers').value;
    persistencia["total"] = parseInt(document.getElementById('out_pers').innerHTML);

    var cuoriginal = {};
    cuoriginal["casosdeUsosCodigo"] = auxid;
    cuoriginal["complejidad"] = document.getElementById('sel_cu').value;
    cuoriginal["total"] = parseInt(document.getElementById('out_cu').innerHTML);
    
    var integracion = {};
    integracion["casosdeUsosCodigo"] = auxid;
    integracion["complejidad"] = document.getElementById('sel_inte').value;
    integracion["nro"] = document.getElementById('mult_inte').value;
    integracion["total"] = parseInt(document.getElementById('out_inte').innerHTML);

    var auxtotal = (perfiles["total"] + vista["total"] + negocio["total"] + persistencia["total"] + cuoriginal["total"]) / 7;
    if (auxtotal == 0) {
        auxtotal = 0;
    } else if (auxtotal < 7.5) {
        auxtotal = 5;
    } else if (auxtotal < 12.5) {
        auxtotal = 10;
    } else if (auxtotal < 17.5) {
        auxtotal = 15;
    } else if (auxtotal < 22.5) {
        auxtotal = 20;
    } else {
        auxtotal = 25;
    }
    casosUso["totalFila"] = auxtotal;
    
    var data = {casosUso, perfiles, vista, negocio, persistencia, cuoriginal, integracion};

    console.log(data);
    $.ajax({
        type : "POST",
        url : "criterios/saveRow/" + id,
        dataType : "json",
        contentType : "application/json; charset=utf-8",
        data : JSON.stringify(data),
        success : function(module) {
            refreshTable(module);
            $("#showAtributos").hide();
        },
        error : function(e) {
            console.log('Error: ' + e);
        }

    });
}

function doAjaxDelete(id) {
    $.ajax({
        type : "DELETE",
        url : "criterios/delete/" + id,
        success : function(module) {
            console.log(module);
            refreshTable(module);
        },
        error : function(e) {
            console.log('Error: ' + e);
        }
    });
}