package potlemon.core.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contain every pokemons the user will use to fight
 * @author asvevi
 *
 */

public class Team {
	
	public final int MAX_SIZE = 6;
	private List<Pokemon> team;
	
	public Team() {
		team = new ArrayList<Pokemon>();
	}
	
	/**
	 * Return the first pokemon from the team
	 * @return
	 */
	public Pokemon getFirstPokemon(){
		return team.get(0);
	}
	
	
	public Pokemon getFirstPokemonInLife(){
		if(this.everyoneIsDead()){
			return null;
		}
		else{
			for(Pokemon p : team){
				if(!p.checkDead() || p.checkDead() && !p.isEjected()){
					return p;
				}
			}
			return null;
		}
	}
	
	
	
	
	/**
	 * swap pokemon place in the team
	 * return false if an error occurred
	 * @param first
	 * @param second
	 * @return success
	 */
	public boolean swapPokemon(int first, int second){
		if(second >= team.size() || first >= team.size()){
			return false;
		}
		Pokemon temp = team.get(first);
		team.set(first, team.get(second));
		team.set(second, temp);
		return true;
	}
	
	public boolean everyoneIsDead(){
		for(Pokemon p :team){
			if(!p.checkDead()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Add a pokemon at the end of the team
	 * @param p
	 * @return
	 */
	public boolean add(Pokemon p){
		if(team.size()>=MAX_SIZE){
			return false;
		}
		team.add(p);
		return true;
	}
	
	/**
	 * Return number of Pokemon in the team
	 * @return
	 */
	public int size(){
		return team.size();
	}
	
	public Pokemon get(int i){
		return team.get(i);
	}

	public int getIdx(Pokemon pokemon){
		for (int i = 0, s = team.size(); i < s; i++) {
			if(team.get(i)==pokemon){
				return i;
			}
		}
		return -1;
	}
	
	public Pokemon remove(int i){
		return team.remove(i);
	}

	public List<Pokemon> getTeam() {
		return team;
	}
}
