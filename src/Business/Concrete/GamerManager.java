package Business.Concrete;

import Business.Abstract.GamerService;
import Business.Factory.InjectionFactory;
import Entities.Concrete.Gamer;

public class GamerManager implements GamerService{
	
	@Override
	public void get() {
		System.out.println("Oyuncular Getirildi");
	}

	@Override
	public void getId(Gamer gamer) {
		System.out.println(gamer.getId() + "'idli oyuncu getirildi.");
	}

	@Override
	public void add(Gamer gamer) {
		if (InjectionFactory.createEStateManager().validate(gamer)) {
			System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " oyuncu eklendi.");
		}else {
			System.out.println("�zg�n�z.. Hatal� giri� yapt�n�z!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if (InjectionFactory.createEStateManager().validate(gamer)) {
			//Normalde veritaban�nda ki veri ile kar��la�t�r�l�r (id) var ise g�ncelleme i�lemleri yap�l�r..
			Gamer upToDateGamer = gamer;
			upToDateGamer.setFirstName("Muhammed");
			System.out.println(upToDateGamer.getFirstName()+ " "+ upToDateGamer.getLastName() + " oyuncu d�zenlendi.");
		}else {
			System.out.println("�zg�n�z.. Hatal� giri� yapt�n�z!");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " oyuncu silindi.");
	}
	
}
