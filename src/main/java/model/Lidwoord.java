package model;

public class Lidwoord {
	
	private String nederlands;
	private String engels;
	
	public Lidwoord(String nederlands, String engels) {
		this.nederlands = nederlands;
		this.engels = engels;
	}
	
	
	public String getNederlands() {
		return nederlands;
	}
	
	public void setNederlands(String nederlands) {
		this.nederlands = nederlands;
	}
	
	public String getEngels() {
		return engels;
	}
	
	public void setEngels(String engels) {
		this.engels = engels;
	}

}
