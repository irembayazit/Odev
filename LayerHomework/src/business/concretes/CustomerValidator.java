package business.concretes;

import entities.concretes.Customer;

public class CustomerValidator {
	
	public static boolean ChekCustomer(Customer customer){
		
		if(customer.getEmail().length() < 6) {
			System.out.println("ÞÝfre en az 6 karakter olmalýdýr");
			return false;
		}
		
		if(customer.getEmail().matches("[a-zA-Z0-9]+@hotmail.com.*") == false && customer.getEmail().matches("[a-zA-Z0-9]+@gmail.com.*") == false) {
			System.out.println("Lütfen gecerli bir email adresi giriniz!");
			return false;
		}
		
		if(customer.getName().length() < 2){
			System.out.println("isim en az 2 karakter almalý!");
			return false;
		}
		
		return true;
	}
}
