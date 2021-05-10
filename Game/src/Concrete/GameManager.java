package Concrete;

import Abstract.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void Sell(Game game, Customer customer) {
		if(game.getPrice() > customer.getMoney()) {
			System.out.println("Sayýn " + customer.getFirstName() +" bakiyeniz yetersiz");
		}
		
		System.out.println("Sayýn " + customer.getFirstName() +" oyunu kiraladýnýz");
		double kalanBakiye = customer.getMoney() - game.getPrice();
		customer.setMoney(kalanBakiye);
		System.out.println("Sayýn " + customer.getFirstName() +" kalan bakiyeniz : " + kalanBakiye );
		
	}

	@Override
	public void SellDiscount(Game game, Customer customer, int discount) {
		double newPrice = game.getPrice() - (((double)discount / 100) * game.getPrice());
		game.setPrice(newPrice);		
		
		if(game.getPrice() > customer.getMoney()) {
			System.out.println("Sayýn " + customer.getFirstName() +" bakiyeniz yetersiz");
		}
		
		System.out.println("Sayýn " + customer.getFirstName() +" oyunu kiraladýnýz");
		double kalanBakiye = customer.getMoney() - game.getPrice();
		customer.setMoney(kalanBakiye);
		System.out.println("Sayýn " + customer.getFirstName() +" kalan bakiyeniz : " + kalanBakiye);
		
		
	}

	
	
}
