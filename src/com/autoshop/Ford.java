package com.autoshop;

//Ford class, subclass of Car
public class Ford extends Car {
	
	//Variables
	int year;
	int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;

	}
	
	// Method to get sale price
	public double getSalePrice() {
		
		double salePrice = super.getSalePrice();
		salePrice = salePrice - manufacturerDiscount;
		return salePrice;
	}
	


}
