package Business.Abstract;

import Entities.Concrete.Campaign;

public interface CampaignService {
	
	void get();
	void getId(Campaign campaign);
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
