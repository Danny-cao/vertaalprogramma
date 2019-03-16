package webservices;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Lidwoord;
import persistence.LidwoordDao;
import persistence.LidwoordDaoImpl;
import persistence.ZinDao;
import persistence.ZinDaoImpl;

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
		
		String nederlands = "de";
		String test = "de boer eet een brood";
		
		LidwoordDao lidwoordDao = new LidwoordDaoImpl();
		ZinDao zdao = new ZinDaoImpl();
		
		//Lidwoord lidwoord = lidwoordDao.findTranslation(nederlands);
		//String zin = zdao.Representatie2(test);
		//boolean test = lidwoordDao.exist("op");
		String zin = zdao.Representatie1(test);
		
		
    	//System.out.println(lidwoord);
        return Response.ok(zin).build();
	}
	
	
}
