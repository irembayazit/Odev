package Abstract;

import Entities.Customer;
import Entities.Game;

public interface IGameService {
	void Sell(Game game,Customer customer);
	void SellDiscount(Game game,Customer customer,int discount);
}
