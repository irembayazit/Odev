package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager{

	ICustomerCheckService customerCheckService;	
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(this.customerCheckService.ChechkIfPeron(customer)) {
			super.Save(customer); 
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void Update(Customer customer) {
		if(this.customerCheckService.ChechkIfPeron(customer)) {
			super.Update(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void Delete(Customer customer) {
		if(this.customerCheckService.ChechkIfPeron(customer)) {
			super.Delete(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

}
