package dao;

import java.util.List;

import Models.Customer;

public interface CustomerDAO {
	
	void addCustomer(Customer customer);
	void getCustomerById(int customerId);
	List<Customer>getAllCustomers();
	Customer getCustomerByUsername(String username);

}
