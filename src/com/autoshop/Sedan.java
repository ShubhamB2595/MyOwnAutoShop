package com.autoshop;

// Sedan class, subclass of Car

public class Sedan extends Car {
	
	//Variables
	int length; // in feet

	// Constructor
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	
	}

	// Method to get sale price
	public double getSalePrice() {
		
		if(length > 20) {
			//5% discount = 5/100 = 0.05
			double salePrice = super.getSalePrice();
			salePrice = salePrice - (0.05 * salePrice);
			return salePrice;
			
		}
		else {
			//10% discount = 10/100 = 0.1
			double salePrice = super.getSalePrice();
			salePrice = salePrice - (0.1 * salePrice);
			return salePrice;
		}
	}
}
