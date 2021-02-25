package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class JavaBasicsClass {

	//to format decimals to 2 places
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sum of 2 integers
		int x = 5;
		int y = 2;
		int sum = x + y;
		//System.out.println(sum);
		
		//sum of 2 doubles
		double a = 4.56;
		double b = 8.09685;
		double doubleSum = a + b;
		//System.out.println(doubleSum);
		
		//sum of int and double
		int c = 6;
		double d = 45.97;
		double intDoubleSum = c + d;
		//System.out.println(intDoubleSum);
		
		//divide larger int by smaller int
		int e = 10;
		int f = 2;
		int quotient = e/f;
		//System.out.println(quotient);
		//if f/e the result is 0. 
		
		//divide doubles and cast result to an integer
		double g = 4.56;
		double h = 9.786;
		double quotient2 = h/g;
		//System.out.println((int)quotient2);
		
		
		int i = 5;
		int j = 6;
		double q = j/i;
		//System.out.println(q);
		q = (double)j;
		//System.out.println(q);
		
		//declare a named constant and use in a calculation
		final int M = 50;
		//System.out.println(m + 40);
		
		
		cafeTotal();
		
		
		
	}//public static void main(String[] args)


	private static void cafeTotal() {
		// TODO Auto-generated method stub
		//cafe total
				final double COFFEE = 2.99;
				final double TEA = 3.49;
				final double JUICE = 1.98;
				
				double subtotal = 0;
				double totalSale = 0;
				final double SALES_TAX = 0.072;
			
				
				//order for 3 coffees, 4 teas, 2 juices
				subtotal = (3*COFFEE + 4*TEA + 2*JUICE);
				System.out.println("Your subtotal is: $" + subtotal);
				totalSale = subtotal + (subtotal*SALES_TAX);
				System.out.println("Your total is: $" + df2.format(totalSale));
	}

}//public class JavaBasicsClass
