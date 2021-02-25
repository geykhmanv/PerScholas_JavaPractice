package monster_game;

public class StoneMonster extends Monster {
	
	public StoneMonster(String name) {
		super(name);
	}//constructor
	
	public String attack() {
		return name + " Attack with stones!";
	}//attack()

}//StoneMonster
