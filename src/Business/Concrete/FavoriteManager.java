package Business.Concrete;

import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class FavoriteManager {
	public static void favoriteGame(Game game,Gamer gamer) {
		System.out.println("Harika sevdi�in oyuna kavu�tun!");
		System.out.println(
				gamer.getFirstName()+" "+gamer.getLastName() +" adl� oyuncu " +
				game.getGameName()+ " adl� oyunu ba�ar�yla sat�n ald�."
				);
	}
	public static void nonFavoriteGame(Game game,Gamer gamer) {
		System.out.println(
				gamer.getFirstName()+" "+gamer.getLastName() +" adl� oyuncu " +
				game.getGameName()+ " adl� oyunu ba�ar�yla sat�n ald�."
				);
	}
}
