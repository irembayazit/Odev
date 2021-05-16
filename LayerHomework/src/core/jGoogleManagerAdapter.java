package core;

import entities.concretes.Customer;
import jGoogle.jGoogleManager;

public class jGoogleManagerAdapter implements GoogleService {

	@Override
	public void Login(Customer customer) {
		jGoogleManager manager = new jGoogleManager();
		manager.Register(customer);
		
	}

	@Override
	public void Register(Customer customer) {
		jGoogleManager manager = new jGoogleManager();
		manager.Login(customer);
		
	}

}
