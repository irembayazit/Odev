package business.concretes;

import business.abstracts.CustomerService;
import core.GoogleService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

 
public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private GoogleService googleService;
	
	public CustomerManager(CustomerDao customerDao, GoogleService googleService) {
		super();
		this.customerDao = customerDao;
		this.googleService = googleService;
	}

	@Override
	public void register(Customer customer) {
		
		boolean result = CustomerValidator.ChekCustomer(customer);
		if(result==true)
		{
			EmailVerification.Send(customer);
			this.customerDao.add(customer);
			this.googleService.Register(customer);
			System.out.println("Sisteme kayýt yapýldý : " + customer.getName());
		}			
	}

	@Override
	public void login(Customer customer) {
		boolean result = this.customerDao.get(customer.getEmail(),customer.getPassword());
		if(result == true) {
			System.out.println("Giriþ yapýldý");
		}
		this.googleService.Login(customer);
	}
}
