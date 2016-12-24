package controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import model.Person;
import service.PersonService;

@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/person",method=RequestMethod.GET)
	public ResponseEntity<List<Person>>getAllPersons(){
		System.out.println(personService.getAllPersons());
		List<Person>persons=personService.getAllPersons();
		if(persons.isEmpty())
			return new ResponseEntity<List<Person>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Person>>(persons,HttpStatus.OK);
	}
	@RequestMapping(value="/person/{id}",method=RequestMethod.GET)
	public ResponseEntity<Person> getPersonById(@PathVariable(value="id")int id){
		Person person=personService.getPersonById(id);
		if(person==null)
			return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Person>(HttpStatus.OK);
		
	}

	/*public ResponseEntity<Void>createPerson(@RequestBody Person person,UriComponentBuilder build){
		
	}*/

	@RequestMapping(value="/person",method=RequestMethod.POST)
	public ResponseEntity<Void>createPerson(@RequestBody Person person,UriComponentsBuilder build){
		personService.savePerson(person);
		HttpHeaders headers=new HttpHeaders();
		URI urilocation=build.path("/person/")
				.path(String.valueOf(person.getPersonId()))
				.build()
				.toUri();
		headers.setLocation(urilocation);
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/person/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Person> updatePerson(@PathVariable int id,@RequestBody Person person){
		Person updatedPerson=personService.updatePerson(id, person);
		if(person==null)
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Person>(updatedPerson,HttpStatus.OK);
	}
}
