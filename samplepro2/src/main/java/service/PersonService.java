package service;

import java.util.List;

import model.Person;

public interface PersonService {
	List<Person>getAllPersons();
	Person getPersonById(int id);
	void savePerson(Person person);
	Person updatePerson(int id,Person person);

}
