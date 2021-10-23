package com.autoshop;

// Car class

public class Car {
	
	//Variables
	public int speed;
	public double regularPrice;
	public String color;
	
	// Constructor
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	// Method to get sale price
	public double getSalePrice() {
	
		return regularPrice;
	}
	

}
