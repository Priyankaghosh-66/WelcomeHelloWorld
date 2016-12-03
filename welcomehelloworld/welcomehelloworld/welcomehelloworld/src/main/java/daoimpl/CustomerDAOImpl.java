package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Models.Customer;
import dao.CustomerDAO;
@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.close();
		
	}

	public void getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		
		
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Customer>customerList=session.createQuery("from Customer").list();
		return customerList;
	}

	public Customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.close();
		return null;
	}

}
