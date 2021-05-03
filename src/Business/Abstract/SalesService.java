package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.Sales;

public interface SalesService {

	void get();
	void getId(Sales sales);
	void sales(Gamer gamer,Game game);
	void salesCampaign(Gamer gamer,Game game,Campaign campaign);
	void update(Gamer gamer, Game game);
	void delete(Gamer gamer, Game game);
}
