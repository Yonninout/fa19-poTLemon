package model;

/**
 * This class represents a character.
 */
public class Character {
	
	private String name;
	private Team team;
	
	public Character(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
}