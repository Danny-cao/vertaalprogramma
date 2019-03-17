
function postSentence(){
	document.querySelector("#submit").addEventListener("click", function(){
        var formData = new FormData(document.querySelector("#translate"));
        var encData = new URLSearchParams(formData.entries());
        fetch("restservices/vertaal", { method: 'POST', body: encData })
            .then(response => response.json()).then( function(sentence){
            	
            	var select = document.querySelector("#rep2");
            	
            	var p1 = document.createElement("p");
            	
            	p1.innerHTML = sentence.engels;
            	select.appendChild(p1);
            });
	});
} postSentence();