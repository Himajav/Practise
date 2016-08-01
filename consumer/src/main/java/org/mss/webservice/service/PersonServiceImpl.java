package org.mss.webservice.service;

import java.util.ArrayList;
import java.util.List;

import org.mss.webservice.model.Person;

public class PersonServiceImpl implements PersonService{

	@Override
	
	public List<Person> getPersons() {
		
		List<Person> persons = new ArrayList<Person>();
		Person santosh = new Person("Santhosh", "Dayton", "santosh", "sai225");
		Person himaja = new Person("Himaja", "Chicago", "himaja", "123456");
		Person ajay = new Person("Ajay", "Detroit", "ajay", "123456");
		
		persons.add(santosh);
		persons.add(himaja);
		persons.add(ajay);
		
		return persons;
		
		
	}

	@Override
	public Person getPerson(List<Person> persons, String username) {
		 Person person = null;
		for(int i=0; i<persons.size();i++){
			if(persons.get(i).getUsername().equals(username)){
				person = persons.get(i); 
			}
			
		}
		
		
		return person;
	}

}
