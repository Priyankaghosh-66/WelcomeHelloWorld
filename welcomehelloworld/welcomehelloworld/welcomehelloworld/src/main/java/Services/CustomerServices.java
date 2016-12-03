package Services;

import java.util.List;

import Models.Customer;

public interface CustomerServices {

	public void addCustomer(Customer customer);
	public List<Customer>getAllCustomers();
	Customer getCustomerByUsername(String username);
}
