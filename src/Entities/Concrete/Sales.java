package Entities.Concrete;

import java.time.LocalDate;

public class Sales {
	int id;
	String gameName;
	String gamerName;
	LocalDate salesDateTime;
	
	public Sales(int id, String gameName, String gamerName, LocalDate salesDateTime) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamerName = gamerName;
		this.salesDateTime = salesDateTime;
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

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public LocalDate getSalesDateTime() {
		return salesDateTime;
	}

	public void setSalesDateTime(LocalDate salesDateTime) {
		this.salesDateTime = salesDateTime;
	}
}
