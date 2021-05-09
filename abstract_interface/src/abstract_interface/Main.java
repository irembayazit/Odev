package abstract_interface;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Adapters.MernisSerivceAdapter;
import Concrete.CustomerCheckManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager() );
		customerManager.Save(new Customer(1,"irem","bayazýt",new Date(2002),"213456789" ));
		

	}
}
