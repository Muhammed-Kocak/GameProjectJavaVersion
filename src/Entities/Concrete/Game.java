package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity {
	int id;
	String gameName;
	double discountedPrice;
	double discountRate;
	
	public Game(int id, String gameName, double discountedPrice, double discountRate) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.discountedPrice = discountedPrice;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public double getNonDiscountedPrice() {
		return discountRate;
	}

	//public double getNonDiscountedPrice(Campaign campaign) {
	//	return nonDiscountedPrice = (nonDiscountedPrice - campaign.discount);
	//}
	
	public void setNonDiscountedPrice(double discountRate) {
		this.discountRate = discountRate;
	}
}
