package monster_game;

public class WaterMonster extends Monster {
	
	public WaterMonster(String name) {
		super(name);
	}//constructor
	
	public String attack() {
		return name + " Attack with water!";
	}//attack()

}//WaterMonster
