package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void get() {
		System.out.println("Kampanyalar getirildi");
	}

	@Override
	public void getId(Campaign campaign) {
		System.out.println(campaign.getId() + "'idli kampanya getirildi.");
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" kampanya eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" kampanya düzenlendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" kampanya silindi.");
	}

}
