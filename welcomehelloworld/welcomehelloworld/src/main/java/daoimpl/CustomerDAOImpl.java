package daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Models.Cart;
import Models.Customer;
import Models.User;
import dao.CustomerDAO;
@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("adding customer in dao");
		Session session=sessionFactory.getCurrentSession();
		customer.getUser().setEnabled(true);
		
		User user=new User();
		String username=customer.getUser().getusername();
		user.setusername(username);
		user.setRole("ROLE_USER");
		
		Cart cart=new Cart();
		customer.setCart(cart);
		cart.setCustomer(customer);
		session.save(customer);
		session.save(user);
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
		Query query=session.createQuery("from User where username=?");
		query.setString(0, username);
		User user=(User) query.uniqueResult();
		Customer customer=user.getCustomer();
		return customer;
	}

}
