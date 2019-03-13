
function postSentence(){
	document.querySelector("#submit").addEventListener("click", function(){
        var formData = new FormData(document.querySelector("#translate"));
        var encData = new URLSearchParams(formData.entries());
        fetch("restservices/vertaal", { method: 'POST', body: encData })
            .then(response => response.json()).then( zin => console.log(zin));
	});
} postSentence();