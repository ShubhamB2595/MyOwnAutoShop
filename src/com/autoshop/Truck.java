package com.autoshop;

//Truck class, subclass of Car
public class Truck extends Car {
	
	//Variables
	int weight;

	// Constructor
	public Truck(int speed, double regularPrice, String color, int Weight, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
		
	}

	// Method to get sale price
	public double getSalePrice() {
		
		if(weight > 2000) {
			//10% discount = 10/100 = 0.1
			double salePrice = super.getSalePrice();
			salePrice = salePrice - (0.1 * salePrice);
			return salePrice;
		}
		else {
			//20% discount = 20/100 = 0.2
			double salePrice = super.getSalePrice();
			salePrice = salePrice - (0.2 * salePrice);
			return salePrice;
		}

	}

}
