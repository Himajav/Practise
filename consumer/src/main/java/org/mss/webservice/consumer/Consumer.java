package org.mss.webservice.consumer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;





@Path("myconsumer")

public class Consumer {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/plain")
    public String consumeIt() {
    	
    	Client client = ClientBuilder.newClient();
    	
    	WebTarget target = client.target("http://localhost:9090/EPFRestConsumer/rest/UserService/santhosh");
    	
    	return target.request(MediaType.TEXT_PLAIN).get(String.class);
       
    }
	@GET
	@Path("/XmltoJson")
    @Produces(MediaType.APPLICATION_JSON)
    public String XmltoJson(){
    		
    	Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("http://localhost:9090/consumer/webapi/persons");
    	String personsInXMLString = target.request(MediaType.APPLICATION_XML).get(String.class);		
    	JSONObject personsInJson = XML.toJSONObject(personsInXMLString);
    	String XmltoJson = personsInJson.toString(4);
    	return XmltoJson;
    	
    }
	
	
	@GET
	@Path("/JsontoXml")
    @Produces(MediaType.APPLICATION_XML)
    public String JsontoXml(){
    		
    	Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("http://localhost:9090/consumer/webapi/persons");
    	String personsInJsonString = target.request(MediaType.APPLICATION_JSON).get(String.class);		
    	JSONArray personsInJson = new JSONArray(personsInJsonString);
    	String JsontoXml = XML.toString(personsInJson);
    	return JsontoXml;
    }
	
	

	@GET
	@Path("/TexttoJson")
    @Produces(MediaType.APPLICATION_JSON)
    public String TexttoJson(){
    		
    	Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("http://localhost:9090/consumer/webapi/persons/santosh");
    	String nameInJsonString = target.request(MediaType.TEXT_PLAIN).get(String.class);		
    	System.out.println("nameInJsonString-->"+nameInJsonString);
    	
    	
    	return "";
    }
	
	
	
	
    
    
}
