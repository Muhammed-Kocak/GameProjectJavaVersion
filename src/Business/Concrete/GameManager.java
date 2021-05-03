package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements GameService {

	@Override
	public void get() {
		System.out.println("Oyunlar Getirildi");
	}

	@Override
	public void getId(Game game) {
		System.out.println(game.getId() + "'idli oyun getirildi.");
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyun eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyun güncellendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyun silindi.");
	}

}
