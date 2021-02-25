package com.perscholas.cafe;

public class Cappuccino extends Product {

	boolean peppermint;
	boolean whippedCream;
	
	public Cappuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}
	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	public boolean getPeppermint() {
		return peppermint;
	}
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	public boolean getWhippedCream() {
		return whippedCream;
	}
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	@Override
	double calculateProductTotal() {
		// TODO Auto-generated method stub
		double total = 0.00;
		if(peppermint == true) {
			total = quantity*(price + 2.00);
		}
		else if(whippedCream == true) {
			total = quantity*(price + 1.00);
		}
		return total;
	}//double calculateProductTotal() 

}//public class Cappuccino extends Product
