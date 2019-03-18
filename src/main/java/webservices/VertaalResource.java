package webservices;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Zin;
import persistence.ZinDao;
import persistence.ZinDaoImpl;

@Path("/vertaal")
public class VertaalResource {
	
	ZinDao zdao = new ZinDaoImpl();
	
	@POST
    @Produces("application/json")
    public Response translateSentence(@FormParam("sentence") String sentence){
		
		Zin vertaling = zdao.Representatie2(sentence);
    	
    	System.out.println(vertaling);
        return Response.ok(vertaling).build();
	}
	
	@POST
	@Path("/structuur")
    @Produces("application/json")
    public Response showStructure(@FormParam("sentence") String sentence){
		
		ArrayList<String> lijst = zdao.Representatie1(sentence);
    	
    	System.out.println(lijst);
        return Response.ok(lijst).build();
	}
	
	@POST
	@Path("/image")
    @Produces("application/json")
    public Response showImage(@FormParam("sentence") String sentence){
		
		String image = zdao.Representatie3(sentence);
    	
		ArrayList<String> img = new ArrayList<>();
		img.add(image);
    	System.out.println(img);
        return Response.ok(img).build();
	}
}
