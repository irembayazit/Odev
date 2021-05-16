package core;

import entities.concretes.Customer;

public interface GoogleService {
	void Login(Customer customer);
	void Register(Customer customer);
}
