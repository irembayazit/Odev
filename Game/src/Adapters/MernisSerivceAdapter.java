package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSerivceAdapter implements ICustomerCheckService {

	@Override
	public boolean ChechkIfPeron(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			return client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalId()),
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		} 
		System.out.println(result);
		return result;
	}
	
}
