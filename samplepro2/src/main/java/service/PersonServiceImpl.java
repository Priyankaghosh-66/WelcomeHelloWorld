package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonDao;
import model.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		
		
		return personDao.getAllPersons();
	}
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		
		return personDao.getPersonById(id);
	}
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		 personDao.savePerson(person);
		
	}
	public Person updatePerson(int id, Person person) {
		// TODO Auto-generated method stub
		return personDao.updatePerson(id, person);
	}

}
