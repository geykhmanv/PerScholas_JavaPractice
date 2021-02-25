package com.perscholas.java_basics;
import java.util.*;
public class FirstPractice {

	public void myCar() {
		System.out.println("I have a Mini Countryman");
	}
	
	public void getSpeed() {
		System.out.println("I can go up to 150 mph!");
	}
	
	public static void printName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname = scan.nextLine();
		
		if(fname.equals("Victoria")) {
			System.out.println("I know you already");
		}else {
			System.out.println("Hello " + fname);
		}
		scan.close();
	}
	
	public static int getSum() {
		int x = 6;
		int y = 5;
		int sum = x + y;
		return sum;
	}
	
	public static int getSumOfArray(int array[]) {
		int sum = 0;
		for(int i=0; i < array.length; i++) {
			sum += array[i];
		}//for
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FirstPractice car1 = new FirstPractice();
//		car1.myCar();
//		car1.getSpeed();
//		
//		printName();
		
//		System.out.println(getSum());
		
//		int[] myArray = {1, 2, 3, 4, 5};
//		System.out.println(getSumOfArray(myArray));
		
	}//public static void main(String[] args)

}//public class FirstPractice
