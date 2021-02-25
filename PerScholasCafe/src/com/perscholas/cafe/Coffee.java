package com.perscholas.cafe;

public class Coffee extends Product {

	boolean sugar;
	boolean milk;
	
	public Coffee() {
		super();
		this.milk = false;
		this.sugar = false;
	}
	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.milk = milk;
		this.sugar = sugar;
	}
	public boolean getMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public boolean getSugar() {
		return sugar;
	}
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	
	
	@Override
	double calculateProductTotal() {
		// TODO Auto-generated method stub
		return quantity * price;
	}//double calculateProductTotal() 

	
	
}//public class Coffee extends Product
