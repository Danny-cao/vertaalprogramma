package webservices;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/vertaal")
public class VertaalResource {
	

	@POST
    @Produces("application/json")
    public Response translateSentence(@FormParam("sentence") String sentence){
    	
    	System.out.println(sentence);
        return Response.ok(sentence).build();
	}
	
	@GET
    @Produces("application/json")
    public Response testGet(){
    	String zin = "test";
        return Response.ok(zin).build();
	}
	
	
}
