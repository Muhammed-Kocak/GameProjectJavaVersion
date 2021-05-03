package Business.Abstract;

import Entities.Concrete.Game;

public interface GameService {
	
	void get();
	void getId(Game game);
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
