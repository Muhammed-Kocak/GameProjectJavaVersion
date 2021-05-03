package Business.Concrete;

import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class FavoriteManager {
	public static void favoriteGame(Game game,Gamer gamer) {
		System.out.println("Harika sevdiðin oyuna kavuþtun!");
		System.out.println(
				gamer.getFirstName()+" "+gamer.getLastName() +" adlý oyuncu " +
				game.getGameName()+ " adlý oyunu baþarýyla satýn aldý."
				);
	}
	public static void nonFavoriteGame(Game game,Gamer gamer) {
		System.out.println(
				gamer.getFirstName()+" "+gamer.getLastName() +" adlý oyuncu " +
				game.getGameName()+ " adlý oyunu baþarýyla satýn aldý."
				);
	}
}
