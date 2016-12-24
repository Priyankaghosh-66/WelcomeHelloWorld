package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Person");
		/*org.hibernate.Query query=session.createQuery("from Person");*/
		List<Person> persons=query.list();
		session.close();
		return persons;
	}
	//public SessionFactory getSessionFactory() {
		//return sessionFactory;
	//}
	//public void setSessionFactory(SessionFactory sessionFactory) {
		//this.sessionFactory = sessionFactory;
	//}

	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Person person=(Person) session.get(Person.class, id);
		session.close();
		return person;
	}

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.save(person);
		session.flush();
		session.close();
		
	}

	public Person updatePerson(int id, Person person) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Person currentPerson=(Person) session.get(Person.class, id);
		if(currentPerson==null)
		return null;
		session.merge(person);
		Person updatedPerson=(Person) session.get(Person.class, id);
		session.flush();
		session.close();
		return updatedPerson;
	}

}
