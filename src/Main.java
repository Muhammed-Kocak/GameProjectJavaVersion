import java.time.LocalDate;

import Business.Factory.InjectionFactory;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.Sales;

public class Main {

	public static void main(String[] args) {

		System.out.println("KAMPANYA");

		System.out.println("----Kampanyalar� Getirme----");
		InjectionFactory.createCampaignManager().get();

		System.out.println("----Kampanya id'sine G�re Getirme----");
		InjectionFactory.createCampaignManager().getId(new Campaign(1, "Best Kampanya", 10));

		System.out.println("----Kampanya Ekleme----");
		InjectionFactory.createCampaignManager().add(new Campaign(1, "Best Kampanya", 10));

		System.out.println("----Kampanya G�ncelleme----");
		InjectionFactory.createCampaignManager().update(new Campaign(1, "Best Kampanya", 10));

		System.out.println("----Kampanya Silme----");
		InjectionFactory.createCampaignManager().delete(new Campaign(1, "Best Kampanya", 10));

		System.out.println("------------------------------------------------------------------");

		System.out.println("OYUN");

		System.out.println("----Oyunlar� Getirme----");
		InjectionFactory.createGameManager().get();

		System.out.println("----Oyunu id'sine G�re Getirme----");
		InjectionFactory.createGameManager().getId(new Game(1, "BattleField 1", 280, 0));
		// Origin'de Bf1 �u an indirimde oynamak isteyen arkada�lar beni eklesin
		// oynayal�m birlikte :)

		System.out.println("----Oyun Ekleme----");
		InjectionFactory.createGameManager().add(new Game(1, "BattleField 1", 280, 0));

		System.out.println("----Oyun G�ncelleme----");
		InjectionFactory.createGameManager().update(new Game(1, "BattleField 1", 280, 0));

		System.out.println("----Oyun Silme----");
		InjectionFactory.createGameManager().delete(new Game(1, "BattleField 1", 280, 0));

		System.out.println("------------------------------------------------------------------");

		System.out.println("OYUNCU");

		System.out.println("----Oyuncular� Getirme----");
		InjectionFactory.createGamerManager().get();

		System.out.println("----Oyuncu id'sine G�re Getirme----");
		InjectionFactory.createGamerManager().getId(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"));
		// Origin'de Bf1 �u an indirimde oynamak isteyen arkada�lar beni eklesin
		// oynayal�m birlikte :)

		System.out.println("----Oyuncu Ekleme----");
		InjectionFactory.createGamerManager().add(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"));

		System.out.println("----Oyuncu G�ncelleme----");
		InjectionFactory.createGamerManager().update(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"));

		System.out.println("----Oyuncu Silme----");
		InjectionFactory.createGamerManager().delete(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"));
		
		System.out.println("------------------------------------------------------------------");

		System.out.println("SATI�");

		System.out.println("----Sat��lar� Getirme----");
		InjectionFactory.createSalesManager().get();

		System.out.println("----Sat�� id'sine G�re Getirme----");
		LocalDate date = LocalDate.now();
		InjectionFactory.createSalesManager().getId(new Sales(1,"BattleField 1","Muhammed",date));
		// Origin'de Bf1 �u an indirimde oynamak isteyen arkada�lar beni eklesin
		// oynayal�m birlikte :)

		System.out.println("----Sat�� Ekleme----");
		InjectionFactory.createSalesManager().sales(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"),new Game(1, "BattleField 1", 280, 0));
		
		System.out.println("----Sat�� Ekleme Kampanyal�----");
		InjectionFactory.createSalesManager().salesCampaign(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"),new Game(1, "BattleField 1", 280, 0),new Campaign(1, "Best Kampanya", 10));

		System.out.println("----Sat�� G�ncelleme----");
		InjectionFactory.createSalesManager().update(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"),new Game(1, "BattleField 1", 280, 0));

		System.out.println("----Sat�� Silme----");
		InjectionFactory.createSalesManager().delete(new Gamer(1,"Muhammed","Ko�ak","BattleField 1"),new Game(1, "BattleField 1", 280, 0));
	}

}
