package monster_game;

public class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}//constructor
	
	public String attack() {
		return name + " Attack with fire!";
	}//attack()
	
}//public class FireMonster
