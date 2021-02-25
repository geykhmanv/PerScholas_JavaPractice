package com.perscholas.cafe;

abstract class Product {

	private String name;
	protected double price;
	private String description;
	protected int quantity;
	
	
	public Product() {
		
	}//no arg constructor
	
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}//constructor
	
	abstract double calculateProductTotal();
	
	public String getName() {
		return name;
	}
	public void setName(String productName) {
		this.name = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double productPrice) {
		this.price = productPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String productDesc) {
		this.description = productDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int productQuantity) {
		this.quantity = productQuantity;
	}
	
	
	
}//public class Product
