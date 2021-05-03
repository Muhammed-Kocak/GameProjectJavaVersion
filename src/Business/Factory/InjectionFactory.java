package Business.Factory;

import Business.Abstract.CampaignService;
import Business.Abstract.GameService;
import Business.Abstract.GamerService;
import Business.Abstract.GamerValidationService;
import Business.Abstract.SalesService;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Business.Concrete.SalesManager;
import Business.Concrete.eStateManager;

//Jenerik olarak yapýlabilir mi? // biraz düþünürsem olur gibi, þimdilik böyle :)
public class InjectionFactory {

	private static CampaignService campaignService;
	private static GameService gameService;
	private static GamerService gamerService;
	private static SalesService salesService;
	private static GamerValidationService gamerValidationService;

	public static CampaignService createCampaignManager() {
		campaignService = new CampaignManager();
		return campaignService;
	}

	public static GameService createGameManager() {
		gameService = new GameManager();
		return gameService;
	}

	public static GamerService createGamerManager() {
		gamerService = new GamerManager();
		return gamerService;
	}

	public static SalesService createSalesManager() {
		salesService = new SalesManager();
		return salesService;
	}

	public static GamerValidationService createEStateManager() {
		gamerValidationService = new eStateManager();
		return gamerValidationService;
	}
}
