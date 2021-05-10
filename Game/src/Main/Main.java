package Main;


import Abstract.BaseCustomerManager;
import Adapters.MernisSerivceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Customer;
import Entities.Game;
 
public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"12345679","irem","bayazýt",123,100);
		Game game = new Game(1,"war",30);
		
		BaseCustomerManager customerManager = new CustomerManager(new MernisSerivceAdapter());
		customerManager.Save(customer);
		
		GameManager gameManager = new GameManager();
		gameManager.Sell(game, customer);
		System.out.println(customer.getMoney());
		
		GameManager gameManager2 = new GameManager();
		gameManager2.SellDiscount(game, customer, 10);
		System.out.println(customer.getMoney());
		
		
		
		
		
	}

}
