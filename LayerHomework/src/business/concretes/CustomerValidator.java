package business.concretes;

import entities.concretes.Customer;

public class CustomerValidator {
	
	public static boolean ChekCustomer(Customer customer){
		
		if(customer.getEmail().length() < 6) {
			System.out.println("��fre en az 6 karakter olmal�d�r");
			return false;
		}
		
		if(customer.getEmail().matches("[a-zA-Z0-9]+@hotmail.com.*") == false && customer.getEmail().matches("[a-zA-Z0-9]+@gmail.com.*") == false) {
			System.out.println("L�tfen gecerli bir email adresi giriniz!");
			return false;
		}
		
		if(customer.getName().length() < 2){
			System.out.println("isim en az 2 karakter almal�!");
			return false;
		}
		
		return true;
	}
}
