package dao;

import java.util.List;

import model.Person;

public interface PersonDao {

	List<Person>getAllPersons();
	Person getPersonById(int id);
	void savePerson(Person person);
	Person updatePerson(int id,Person person);
}
