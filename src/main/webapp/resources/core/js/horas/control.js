var gest=0;
var ev=0;
var an=0;
var dis=0;
var cons=0;
var func=0;
var total=0;

function setGest() {
    gest = document.getElementById('gest_por').value;
	if (gest == '' || gest == null){
		gest = 0;
	}
	var test = parseInt(window.total) + parseInt(gest);
	if (test >= 100){
		gest = 100 - parseInt(test) + parseInt(gest); 
		document.getElementById('gest_por').value = gest;
	}
	refreshTotal();
    //var res = '';
    /*if (!(0 < nro && nro < 100)) {
        document.getElementById('gest_por').value = '';
    }*/
    //res = nro;
    //document.getElementById('out_por').innerHTML = res;
    //document.getElementById('out_por').setAttribute('value', res);
}

function setEv() {
    ev = document.getElementById('ev_por').value;
	if (ev == '' || ev == null){
		ev = 0;
	}
	var total = 0;
	var test = total + ev;
	if (test >= 100){
		ev = 100 - test + ev; 
		document.getElementById('ev_por').value = ev;
	}
	refreshTotal();
}

function setAn() {
    an = document.getElementById('an_por').value;
	if (an == '' || an == null){
		an = 0;
	}
	var total = 0;
	var test = total + an;
	if (test >= 100){
		an = 100 - test + an; 
		document.getElementById('an_por').value = an;
	}
	refreshTotal();
}

function setDis() {
    dis = document.getElementById('dis_por').value;
	if (dis == '' || dis == null){
		dis = 0;
	}
	var test = total + dis;
	var total = 0;
	if (test >= 100){
		dis = 100 - test + dis; 
		document.getElementById('dis_por').value = dis;
	}
	refreshTotal();
}

function setCons() {
    cons = document.getElementById('cons_por').value;
	if (cons == '' || cons == null){
		cons = 0;
	}
	var total = 0;
	var test = total + cons;
	if (test >= 100){
		cons = 100 - test + ev; 
		document.getElementById('cons_por').value = cons;
	}
	refreshTotal();
}

function setFunc() {
    func = document.getElementById('func_por').value;
	if (func == '' || func == null){
		func = 0;
	}
	var total = 0;
	var test = total + func;
	if (test >= 100){
		func = 100 - test + ev; 
		document.getElementById('func_por').value = func;
	}
	refreshTotal();
}

function refreshTotal(){
	total = parseInt(gest) + parseInt(ev) + parseInt(an) + parseInt(dis) + parseInt(cons) + parseInt(func);
	document.getElementById('out_por').innerHTML = total + "%";
}