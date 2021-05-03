package Business.Concrete;

import Business.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.Sales;

public class SalesManager implements SalesService{

	@Override
	public void get() {
		System.out.println("Sat��lar Getirildi");
	}

	@Override
	public void getId(Sales sales) {
		System.out.println(sales.getGameName()+" adl� oyunu"+sales.getGamerName() +" adl� ki�i sat�n alm��t�r.");
		System.out.println("Sat�� tarihi: "+sales.getSalesDateTime());
	}
	
	@Override
	public void sales(Gamer gamer, Game game) {
		this.favoriteGameControl(gamer, game);
		
		//Burada gelen verileri veritaban�na ekliyoruz kay�t ederken sat�� tarihini ana bilgisayar�n 
		//o anki saatini ekliyoruz..
		//blabla.. = LocalDate.now();
	}

	@Override
	public void salesCampaign(Gamer gamer, Game game, Campaign campaign) {
		this.favoriteGameControl(gamer, game);
	}
	
	@Override
	public void update(Gamer gamer, Game game) {
		System.out.println("Sat�� d�zenlendi");
	}

	@Override
	public void delete(Gamer gamer, Game game) {
		System.out.println("Sat�� silindi");
	}
	
	private void favoriteGameControl(Gamer gamer,Game game) {
		if(gamer.getLoveGames() == game.getGameName()) {
			FavoriteManager.favoriteGame(game, gamer);
		}else {
			FavoriteManager.nonFavoriteGame(game, gamer);
		}
	}
}
