package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Models.Customer;
import dao.CustomerDAO;

@Service
@Transactional
public class CustomerServicesImpl implements CustomerServices{

	@Autowired(required=true)
	private CustomerDAO customerDAO;
	
	public void addCustomer(Customer customer) {
	
		customerDAO.addCustomer(customer);
		// TODO Auto-generated method stub
		
	}

	public List<Customer> getAllCustomers() {
		List<Customer>customerList=customerDAO.getAllCustomers();
		return customerList;
	}

	public Customer getCustomerByUsername(String username) {
		return customerDAO.getCustomerByUsername(username);
	}

}
