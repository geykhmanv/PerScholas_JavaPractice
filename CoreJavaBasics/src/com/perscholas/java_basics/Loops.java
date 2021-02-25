package com.perscholas.java_basics;

public class Loops {

	public static void prompt1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}//for
	}//prompt1
	
	public static void prompt2() {
		int i = 0;
		while(i <= 100) {
			System.out.println(i);
			i += 10;
		}//while
	}//prompt2
	
	public static void prompt3() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
	}//prompt3
	
	public static void prompt4() {
		for(int i = 1; i <= 100; i++) {
			if (i > 25 && i < 75) {
				continue;
			}
			else if(i%5 == 0) {
				System.out.println(i);
			}
		}//for
	}//prompt4
	
	public static void prompt5() {
		for(int i = 1; i <= 100; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
			else if(i > 50) {
				break;
			}
		}//for
	}//prompt5
	
	public static void prompt6() {
		int days = 5;
		int weeks = 2;
		
		for(int i = 1; i <= weeks; i++) {
			System.out.println("Week: " + i);
			for(int j = 1; j <= days; j++) {
				System.out.println("Day " + j);
			}//for j
		}//for i
	}//prompt6
	
	public static void prompt7() {
		String finalOutput = "";
		int remainder;
		for(int i = 10; i < 200; i++) {
			int reversed = 0;
			for(int num = i; num != 0; num /= 10) {
				remainder = num % 10;
				reversed = reversed * 10 + remainder;
			}//for( ;num != 0; num /= 10) 
			if(reversed == i) {
				finalOutput += i + ", ";
			}//if
		}//for(int i = 10; i < 200; i++)
		System.out.println(finalOutput);
	}//prompt7
	
	public static void prompt8() {
		int n = 10;
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		
		while(counter < n) {
			System.out.println(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter += 1;
		}//while
	}//prompt8
	
	public static void prompt9() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Inner loop: i: " + i + " j: " + j);
			}//for j
		}//for i
	}//prompt9
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prompt1();
		//prompt2();
		//prompt3();
		//prompt4();
		//prompt5();
		//prompt6();
		//prompt7();
		//prompt8();
		//prompt9();
		
	}//public static void main(String[] args)

}//public class Loops 
