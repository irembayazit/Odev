package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisSerivceAdapter implements ICustomerCheckService {

	@Override
	public boolean ChechkIfPeron(Customer customer) {
		
		return false;
	}
	
}
