package Concrete;

import Abstract.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void Sell(Game game, Customer customer) {
		if(game.getPrice() > customer.getMoney()) {
			System.out.println("Say�n " + customer.getFirstName() +" bakiyeniz yetersiz");
		}
		
		System.out.println("Say�n " + customer.getFirstName() +" oyunu kiralad�n�z");
		double kalanBakiye = customer.getMoney() - game.getPrice();
		customer.setMoney(kalanBakiye);
		System.out.println("Say�n " + customer.getFirstName() +" kalan bakiyeniz : " + kalanBakiye );
		
	}

	@Override
	public void SellDiscount(Game game, Customer customer, int discount) {
		double newPrice = game.getPrice() - (((double)discount / 100) * game.getPrice());
		game.setPrice(newPrice);		
		
		if(game.getPrice() > customer.getMoney()) {
			System.out.println("Say�n " + customer.getFirstName() +" bakiyeniz yetersiz");
		}
		
		System.out.println("Say�n " + customer.getFirstName() +" oyunu kiralad�n�z");
		double kalanBakiye = customer.getMoney() - game.getPrice();
		customer.setMoney(kalanBakiye);
		System.out.println("Say�n " + customer.getFirstName() +" kalan bakiyeniz : " + kalanBakiye);
		
		
	}

	
	
}
