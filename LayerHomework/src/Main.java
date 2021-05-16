import java.util.ArrayList;
import java.util.List;

import business.abstracts.CustomerService;
import business.concretes.CustomerManager;
import core.jGoogleManagerAdapter;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager
				(new HibernateCustomerDao(),new jGoogleManagerAdapter());
		
		Customer customer = new Customer(1,"ab","bayazýt","1234","10@gmail.com");
		Customer customer2 = new Customer(2,"anýl","bayazýt","1234","123@gmail.com");
		Customer customer3 = new Customer(3,"pýnar","bayazýt","1234","456@gmail.com");
		customerService.register(customer);
		customerService.register(customer2);
		customerService.register(customer3);
		
		
	}

}
