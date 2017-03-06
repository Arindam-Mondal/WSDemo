package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book/{bookType}")
public class Book { 
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML(@PathParam("bookType") String bookType){
		String response = "<?xml version='1.0'?>"+
				"<price>0</price>";
		if(bookType.equals("JAVA")){
			response = "<?xml version='1.0'?>"+
					"<price>500</price>";
		}else if(bookType.equals("PHP")){
			response = "<?xml version='1.0'?>"+
					"<price>400</price>";
		}
		
		return response;
	}
	
	/*@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(){
		
		String response = "<h1>Hello World</h1>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON(){
		
		String response = null;
		return response;
	}*/

}
