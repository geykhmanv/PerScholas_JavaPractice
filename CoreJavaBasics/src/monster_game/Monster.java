package monster_game;

abstract public class Monster {

	protected String name;
	
	public Monster(String name) {
		this.name = name;
	}//constructor
	
	abstract public String attack();
	
}//public class Monster
