package Business.Abstract;

import Entities.Concrete.Gamer;

public interface GamerService {
	
	void get();
	void getId(Gamer gamer);
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
