package libary_interface_practice;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KidUsers kid1 = new KidUsers(10, "Kids");
		KidUsers kid2 = new KidUsers(18, "Fiction");
		kid1.registerAccount();
		kid2.registerAccount();
		
		AdultUser adult1 = new AdultUser(5, "Kids");
		AdultUser adult2 = new AdultUser(23, "Fiction");
		adult1.registerAccount();
		adult2.registerAccount();
		
	}//public static void main(String[] args)

}//public class LibraryInterfaceDemo
