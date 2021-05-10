package abstract_interface;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Adapters.MernisSerivceAdapter;
import Concrete.CustomerCheckManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(2);
		customer.setDateOfBirth(2001);
		customer.setFirstName("irem");
		customer.setLastName("bayazýt");
		customer.setLastName("12345679");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisSerivceAdapter());
		customerManager.Save(customer);
		

	}
}
