package Business.Concrete;

import Business.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.Sales;

public class SalesManager implements SalesService{

	@Override
	public void get() {
		System.out.println("Satýþlar Getirildi");
	}

	@Override
	public void getId(Sales sales) {
		System.out.println(sales.getGameName()+" adlý oyunu"+sales.getGamerName() +" adlý kiþi satýn almýþtýr.");
		System.out.println("Satýþ tarihi: "+sales.getSalesDateTime());
	}
	
	@Override
	public void sales(Gamer gamer, Game game) {
		this.favoriteGameControl(gamer, game);
		
		//Burada gelen verileri veritabanýna ekliyoruz kayýt ederken satýþ tarihini ana bilgisayarýn 
		//o anki saatini ekliyoruz..
		//blabla.. = LocalDate.now();
	}

	@Override
	public void salesCampaign(Gamer gamer, Game game, Campaign campaign) {
		this.favoriteGameControl(gamer, game);
	}
	
	@Override
	public void update(Gamer gamer, Game game) {
		System.out.println("Satýþ düzenlendi");
	}

	@Override
	public void delete(Gamer gamer, Game game) {
		System.out.println("Satýþ silindi");
	}
	
	private void favoriteGameControl(Gamer gamer,Game game) {
		if(gamer.getLoveGames() == game.getGameName()) {
			FavoriteManager.favoriteGame(game, gamer);
		}else {
			FavoriteManager.nonFavoriteGame(game, gamer);
		}
	}
}
