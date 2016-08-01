package org.mss.webservice.consumer;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mss.webservice.model.Person;
import org.mss.webservice.service.PersonService;
import org.mss.webservice.service.PersonServiceImpl;

@Path("/persons")
public class PersonResource {
	
	PersonService personService = new PersonServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getPersons(){
		
		return personService.getPersons();
		
	}
	
	
	@GET
	@Path("/{username}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPerson(@PathParam("username") String username){
		
		return personService.getPerson(personService.getPersons(), username).getUsername();
		
	}
	
	
	
	

}
