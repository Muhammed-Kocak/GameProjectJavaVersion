package Entities.Concrete;

import Entities.Abstract.Entity;

public class Gamer  implements Entity {
	int id;
	String firstName;
	String lastName;
	int BirthYear;
    String NationalityNumber;
	String loveGames;
	
	public Gamer(int id, String firstName, String lastName, String loveGames) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loveGames = loveGames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoveGames() {
		return loveGames;
	}

	public void setLoveGames(String loveGames) {
		this.loveGames = loveGames;
	}

	public int getBirthYear() {
		return BirthYear;
	}

	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

	public String getNationalityNumber() {
		return NationalityNumber;
	}

	public void setNationalityNumber(String nationalityNumber) {
		NationalityNumber = nationalityNumber;
	}
}
