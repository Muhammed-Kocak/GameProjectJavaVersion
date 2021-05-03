package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity{
	int id;
	String campaignName;
	double discountAmount;
	
	public Campaign(int id, String campaignName, double discountAmount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountAmount = discountAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
}
