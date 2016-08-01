package org.mss.webservice.service;

import java.util.List;

import javax.ws.rs.Path;

import org.mss.webservice.model.Person;


@Path("/persons")
public interface PersonService {

	public List<Person> getPersons();
	public Person getPerson(List<Person> persons, String username);
	
	
	
	
}
