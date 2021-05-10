package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db " + customer.getFirstName());
		
	}

	@Override
	public void Update(Customer customer) {
		System.out.println("Updated to db " + customer.getFirstName());
		
	}

	@Override
	public void Delete(Customer customer) {
		System.out.println("Deleted to db " + customer.getFirstName());
		
	}

}
