package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void dalete(Customer customer);
	boolean get(String email, String password);
	List<Customer> getAll();
	
}
