package monster_game;

public class TestMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monster m1 = new FireMonster("Blaze");
		Monster m2 = new WaterMonster("Splash");
		Monster m3 = new StoneMonster("Shake");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		m1 = new WaterMonster("Whirl");
		System.out.println(m1.attack());
	}//public static void main(String[] args)

}//public class TestMonster 
