package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer) {
		
		customers.add(customer); 		
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dalete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean get(String email , String password) {

		for(Customer _customer : customers){
			if(_customer.getEmail()==email && _customer.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
