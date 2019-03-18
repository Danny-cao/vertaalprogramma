
function postSentence(){
	document.querySelector("#submit").addEventListener("click", function(){
        var formData = new FormData(document.querySelector("#translate"));
        var encData = new URLSearchParams(formData.entries());
        fetch("restservices/vertaal", { method: 'POST', body: encData })
            .then(response => response.json()).then( function(sentence){
            	
            	reset();
            	if(sentence.nederlands !== 'zin klopt niet'){
                	var rep2 = document.querySelector("#rep2");
                	
                	var p1 = document.createElement("p");
                	
                	p1.innerHTML = sentence.engels;
                	rep2.appendChild(p1);
            	} else {
            		console.log("kan de zin niet vertalen");
            	}

            }).then(getStructure(encData)).then(getImage(encData));
	});
} postSentence();


function getStructure(data){
	
	fetch("restservices/vertaal/structuur", {method: 'POST', body: data })
	.then(zin => zin.json()).then( function(zin){
		
		console.log(zin);
		
		var rep1 = document.querySelector("#rep1row");
		
		
		var eenvoudigezin = document.createElement("div");
		var naamwoordelijk = document.createElement("div");
		var werkwoord = document.createElement("div");
		var naamwoordelijk2 = document.createElement("div");
		var lidwoord = document.createElement("div");
		var zelfstandignaamwoord = document.createElement("div");
		var leeg = document.createElement("div");
		var lidwoord2 = document.createElement("div");
		var zelfstandignaamwoord2 = document.createElement("div");
		
		var l = document.createElement("div");
		var z = document.createElement("div");
		var w = document.createElement("div");
		var l2 = document.createElement("div");
		var z2 = document.createElement("div");
		
		// eerste deel 
		eenvoudigezin.className = "col-md-12 custom";
		eenvoudigezin.innerHTML = "<b>Eenvoudige zin</b>";
		//
		//tweede deel
		naamwoordelijk.className = "col-md-4 custom";
		naamwoordelijk.innerHTML = "<b>Naamwoordelijk deel</b>";
		
		werkwoord.className = "col-md-4 custom";
		werkwoord.innerHTML = "<b>Werkwoordelijk deel</b>";
		
		naamwoordelijk2.className = "col-md-4 custom";
		naamwoordelijk2.innerHTML = "<b>Naamwoordelijk deel</b>";
		//
		
		//Derde deel
		lidwoord.className = "col-md-2 custom";
		lidwoord.innerHTML = "<b>Lidwoord</b>";
		
		zelfstandignaamwoord.className = "col-md-2 custom";
		zelfstandignaamwoord.innerHTML = "<b>Zelfstandig naamwoord</b>";
		
		leeg.className = "col-md-4";
		
		lidwoord2.className = "col-md-2 custom";
		lidwoord2.innerHTML = "<b>Lidwoord</b>";
		
		zelfstandignaamwoord2.className = "col-md-2 custom";
		zelfstandignaamwoord2.innerHTML = "<b>Zelfstandig naamwoord</b>";
		//
		//response
		
		l.className = "col-md-2 custom";
		l.innerHTML = zin[0];
		
		z.className = "col-md-2 custom";
		z.innerHTML = zin[1];
		
		w.className = "col-md-4 custom";
		w.innerHTML = zin[2];
		
		l2.className = "col-md-2 custom";
		l2.innerHTML = zin[3];
		
		z2.className = "col-md-2 custom";
		z2.innerHTML = zin[4];
		//
    	
    	rep1.appendChild(eenvoudigezin);
    	rep1.appendChild(naamwoordelijk);
    	rep1.appendChild(werkwoord);
    	rep1.appendChild(naamwoordelijk2);
    	
    	rep1.appendChild(lidwoord);
    	rep1.appendChild(zelfstandignaamwoord);
    	rep1.appendChild(leeg);
    	rep1.appendChild(lidwoord2);
    	rep1.appendChild(zelfstandignaamwoord2);
    	
    	rep1.appendChild(l);
    	rep1.appendChild(z);
    	rep1.appendChild(w);
    	rep1.appendChild(l2);
    	rep1.appendChild(z2);
		
	});
}

function getImage(data){
	
	fetch("restservices/vertaal/image", {method: 'POST', body: data })
	.then(image => image.json()).then( function(image){
		
		console.log(image);
		
		if(image[0] !== 'zin klopt niet'){
			var rep3 = document.querySelector("#rep3");
			
			var img = document.createElement("img");
			img.src = image;
			
			rep3.appendChild(img);
		}
	});
}

function reset(){
	
	var rep1 = document.querySelector("#rep1row");
	var rep2 = document.querySelector("#rep2");
	var rep3 = document.querySelector("#rep3");
	
	rep1.innerHTML = "";
	rep2.innerHTML = "";
	rep3.innerHTML = "";
}
