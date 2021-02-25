package com.perscholas.cafe;
public class CafeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Espresso e1 = new Espresso();
		e1.setPrice(7.00);
		e1.setMacchiato(true);
		e1.setQuantity(1);
		System.out.println(e1.calculateProductTotal());
		
		Coffee c1 = new Coffee();
		c1.setPrice(2.89);
		c1.setMilk(true);
		c1.setQuantity(2);
		System.out.println(c1.calculateProductTotal());
		
		Cappuccino cap1 = new Cappuccino();
		cap1.setPrice(3.50);
		cap1.setWhippedCream(true);
		cap1.setPeppermint(true);
		cap1.setQuantity(3);
		System.out.println(cap1.calculateProductTotal());
		
		
	}//public static void main(String[] args)

	
}//public class CafeApp 
