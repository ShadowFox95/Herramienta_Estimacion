var pregest=0;
var gest=0;
var preev=0;
var ev=0;
var prean=0;
var an=0;
var predis=0;
var dis=0;
var precons=0;
var cons=0;
var prefunc=0;
var func=0;
var totaldelivery=0;

var cal=0;
var precal=0;
var seg=0;
var preseg=0;
var desp=0;
var predesp=0;
var totalextras=0;

var proy=0;
var preproy=0;
var dm=0;
var predm=0;
var totalgobierno=0; 

function setDel(attr) {
	console.log("HEY");
	if (gest == '' || gest == null || gest == '0'){
		console.log("HEY2");
		attr = '';
	} else if (gest > 100){
		console.log("HEY3");
		attr = 100;
	}
	return attr;
}

function setGest() {
	/*gest = document.getElementById('gest_por').value;
	setDel(gest);*/
    gest = parseInt(document.getElementById('gest_por').value);
	if (gest == '' || gest == null || gest == '0'){
		gest = 0;
		document.getElementById('gest_por').value = '';
	} else if (gest > 100){
		gest = 100;
		document.getElementById('gest_por').value = 100;
	}
	
}

function calcGest(){
	var aux = window.totaldelivery - pregest;
	//console.log("gest1: "+pregest);
	gest = parseInt(document.getElementById('gest_por').value);
	//console.log("gest2: "+gest);
	var test = aux + gest;
	//console.log("test: "+test);
	if (test > 100){
		gest = (100 - parseInt(test)) + parseInt(gest);
		//console.log("gest: "+gest+" = 100 - test: "+test+" + gest: "+gest);
		document.getElementById('gest_por').value = gest;
		//console.log("gest: "+gest);
	}
	pregest = gest;
	refreshTotalDelivery();
}
//
function setEv() {
    ev = document.getElementById('ev_por').value;
	if (ev == '' || ev == null){
		ev = 0;
		document.getElementById('ev_por').value = '';
	}  else if (ev > 100){
		ev = 100;
		document.getElementById('ev_por').value = 100;
	}
}

function calcEv(){
	var aux = window.totaldelivery - preev;
	//console.log("ev1: "+preev);
	ev = parseInt(document.getElementById('ev_por').value);
	//console.log("ev2: "+ev);
	var test = parseInt(aux) + ev;
	//console.log("test: " +test +" = aux: "+aux + " + ev2: "+ev);
	if (test > 100){
		ev = (100 - parseInt(test)) + parseInt(ev);
		//console.log("ev2: "+ev+" = 100 - test: "+test+" + ev2: "+ev);
		document.getElementById('ev_por').value = ev;	
	}
	preev = ev;
	refreshTotalDelivery();
}
//
function setAn() {
    an = document.getElementById('an_por').value;
	if (an == '' || an == null){
		an = 0;
		document.getElementById('an_por').value = '';
	} else if (an > 100){
		an = 100;
		document.getElementById('an_por').value = 100;
	}
	
}

function calcAn(){
	var aux = window.totaldelivery - prean;
	//console.log("an1: "+prean);
	an = parseInt(document.getElementById('an_por').value);
	//console.log("an2: "+an);
	var test = parseInt(aux) + an;
	//console.log("test: " +test +" = aux: "+aux + " + an2: "+an);
	if (test > 100){
		an = (100 - parseInt(test)) + parseInt(an);
		//console.log("an2: "+an+" = 100 - test: "+test+" + an2: "+an);
		document.getElementById('an_por').value = an;	
	}
	prean = an;
	refreshTotalDelivery();
}
//
function setDis() {
    dis = document.getElementById('dis_por').value;
	if (dis == '' || dis == null){
		dis = 0;
		document.getElementById('dis_por').value = '';
	} else if (dis > 100){
		dis = 100;
		document.getElementById('dis_por').value = 100;
	}
	
}

function calcDis(){
	var aux = window.totaldelivery - predis;
	//console.log("dis1: "+predis);
	dis = parseInt(document.getElementById('dis_por').value);
	//console.log("dis2: "+dis);
	var test = parseInt(aux) + dis;
	//console.log("test: " +test +" = aux: "+aux + " + dis2: "+dis);
	if (test > 100){
		dis = (100 - parseInt(test)) + parseInt(dis);
		//console.log("dis2: "+dis+" = 100 - test: "+test+" + dis2: "+dis);
		document.getElementById('dis_por').value = dis;	
	}
	predis = dis;
	refreshTotalDelivery();
}
//
function setCons() {
    cons = document.getElementById('cons_por').value;
	if (cons == '' || cons == null){
		cons = 0;
		document.getElementById('cons_por').value = '';
	} else if (cons > 100){
		cons = 100;
		document.getElementById('cons_por').value = 100;
	}
}

function calcCons(){
	var aux = window.totaldelivery - precons;
	//console.log("cons1: "+precons);
	cons = parseInt(document.getElementById('cons_por').value);
	//console.log("cons2: "+cons);
	var test = parseInt(aux) + cons;
	//console.log("test: " +test +" = aux: "+aux + " + cons2: "+cons);
	if (test > 100){
		cons = (100 - parseInt(test)) + parseInt(cons);
		//console.log("cons2: "+cons+" = 100 - test: "+test+" + cons2: "+cons);
		document.getElementById('cons_por').value = cons;	
	}
	precons = cons;
	refreshTotalDelivery();
}
//
function setFunc() {
    func = document.getElementById('func_por').value;
	if (func == '' || func == null){
		func = 0;
		document.getElementById('func_por').value = '';
	} else if (func > 100){
		func = 100;
		document.getElementById('func_por').value = 100;
	}
	
}

function calcFunc(){
	var aux = window.totaldelivery - prefunc;
	//console.log("func1: "+prefunc);
	func = parseInt(document.getElementById('func_por').value);
	//console.log("func2: "+func);
	var test = parseInt(aux) + func;
	//console.log("test: " +test +" = aux: "+aux + " + func2: "+func);
	if (test > 100){
		func = (100 - parseInt(test)) + parseInt(func);
		//console.log("func2: "+func+" = 100 - test: "+test+" + func2: "+func);
		document.getElementById('func_por').value = func;	
	}
	prefunc = func;
	refreshTotalDelivery();
}
//
function refreshTotalDelivery(){
	window.totaldelivery = parseInt(gest) + parseInt(ev) + parseInt(an) + parseInt(dis) + parseInt(cons) + parseInt(func);
	if(totaldelivery == null) {
		window.totaldelivery = 0;
	}
	document.getElementById('del_por').innerHTML = totaldelivery + "%";
}
////
function setCal(){
	cal = document.getElementById('cal_por').value;
	if (cal == '' || cal == null){
		cal = 0;
		document.getElementById('cal_por').value = '';
	} else if (cal > 100){
		cal = 100;
		document.getElementById('cal_por').value = 100;
	}
}
//
function calcCal(){
	var aux = window.totalextras - precal;
	//console.log("cal1: "+precal);
	cal = parseInt(document.getElementById('cal_por').value);
	//console.log("cal2: "+cal);
	var test = parseInt(aux) + cal;
	//console.log("test: " +test +" = aux: "+aux + " + cal2: "+cal);
	if (test > 100){
		cal = (100 - parseInt(test)) + parseInt(cal);
		//console.log("cal2: "+cal+" = 100 - test: "+test+" + cal2: "+cal);
		document.getElementById('cal_por').value = cal;	
	}
	precal = cal;
	refreshTotalExtras();
}
//
function setSeg(){
	seg = document.getElementById('seg_por').value;
	if (seg == '' || seg == null){
		seg = 0;
		document.getElementById('seg_por').value = '';
	} else if (seg > 100){
		seg = 100;
		document.getElementById('seg_por').value = 100;
	}
}
//
function calcSeg(){
	var aux = window.totalextras - preseg;
	//console.log("seg1: "+preseg);
	seg = parseInt(document.getElementById('seg_por').value);
	//console.log("seg2: "+seg);
	var test = parseInt(aux) + seg;
	//console.log("test: " +test +" = aux: "+aux + " + seg2: "+seg);
	if (test > 100){
		seg = (100 - parseInt(test)) + parseInt(seg);
		//console.log("seg2: "+seg+" = 100 - test: "+test+" + seg2: "+seg);
		document.getElementById('seg_por').value = seg;	
	}
	preseg = seg;
	refreshTotalExtras();
}
//
function setDesp(){
	desp = document.getElementById('desp_por').value;
	if (desp == '' || desp == null){
		desp = 0;
		document.getElementById('desp_por').value = '';
	} else if (desp > 100){
		desp = 100;
		document.getElementById('desp_por').value = 100;
	}
}
//
function calcDesp(){
	var aux = window.totalextras - predesp;
	//console.log("desp1: "+predesp);
	desp = parseInt(document.getElementById('desp_por').value);
	//console.log("desp2: "+desp);
	var test = parseInt(aux) + desp;
	//console.log("test: " +test +" = aux: "+aux + " + desp2: "+desp);
	if (test > 100){
		desp = (100 - parseInt(test)) + parseInt(desp);
		//console.log("desp2: "+desp+" = 100 - test: "+test+" + desp2: "+desp);
		document.getElementById('desp_por').value = desp;	
	}
	predesp = desp;
	refreshTotalExtras();
}
//
function refreshTotalExtras() {
	window.totalextras = parseInt(cal) + parseInt(seg) + parseInt(desp);
	document.getElementById('extra_por').innerHTML = totalextras + "%";
}
////
function setProy() {
    proy = parseInt(document.getElementById('proy_por').value);
	if (proy == '' || proy == null || proy == '0'){
		proy = 0;
		document.getElementById('proy_por').value = '';
	} else if (proy > 100){
		proy = 100;
		document.getElementById('proy_por').value = 100;
	}
	
}

function calcProy(){
	var aux = window.totalgobierno - preproy;
	//console.log("proy1: "+preproy);
	proy = parseInt(document.getElementById('proy_por').value);
	//console.log("proy2: "+proy);
	var test = aux + proy;
	//console.log("test: "+test);
	if (test > 100){
		proy = (100 - parseInt(test)) + parseInt(proy);
		//console.log("proy: "+proy+" = 100 - test: "+test+" + proy: "+proy);
		document.getElementById('proy_por').value = proy;
		//console.log("proy: "+proy);
	}
	preproy = proy;
	refreshTotalGobierno();
}
//
function setDM() {
    dm = parseInt(document.getElementById('dm_por').value);
	if (dm == '' || dm == null || dm == '0'){
		dm = 0;
		document.getElementById('dm_por').value = '';
	} else if (dm > 100){
		dm = 100;
		document.getElementById('dm_por').value = 100;
	}
	
}

function calcDM(){
	var aux = window.totalgobierno - predm;
	//console.log("dm1: "+predm);
	dm = parseInt(document.getElementById('dm_por').value);
	//console.log("dm2: "+dm);
	var test = aux + dm;
	//console.log("test: "+test);
	if (test > 100){
		dm = (100 - parseInt(test)) + parseInt(dm);
		//console.log("dm: "+dm+" = 100 - test: "+test+" + dm: "+dm);
		document.getElementById('dm_por').value = dm;
		//console.log("dm: "+dm);
	}
	predm = dm;
	refreshTotalGobierno();
}
//
function refreshTotalGobierno(){
	window.totalgobierno = parseInt(proy) + parseInt(dm);
	document.getElementById('gob_por').innerHTML = totalgobierno + "%";
}
//
