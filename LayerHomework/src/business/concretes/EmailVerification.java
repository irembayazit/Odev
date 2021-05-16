package business.concretes;

import entities.concretes.Customer;

public class EmailVerification {
	
	static void Send(Customer customer) {
		System.out.println("dogrulama kodu gonderildi!");
		Verification(customer);
	}
	static void Verification(Customer customer) {
		System.out.println("üyelik tamamlandý!");
	}
}
