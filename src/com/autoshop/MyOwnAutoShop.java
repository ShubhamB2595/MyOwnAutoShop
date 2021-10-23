package com.autoshop;

public class MyOwnAutoShop {
	

	public static void main(String[] args) {

		System.out.println("Welcome to My own auto shop program");
		
		// calling with input
		Sedan mySedan = new Sedan(200, 20000.0, "Red", 5);
		Ford myFord1 = new Ford(180, 3000.0, "Black", 2010, 10);
		Ford myFord2 = new Ford(220, 6000.0, "Green", 2020, 5);
		Car myCar = new Car(180, 40000.0, "Gray");
		
		// printing sale price for all 
		System.out.println("My Sedan price: " + mySedan.getSalePrice());
		System.out.println("My Ford1 price: " + myFord1.getSalePrice());
		System.out.println("My Ford2 price: " + myFord2.getSalePrice());
		System.out.println("My Car price: " + myCar.getSalePrice());

	}

}
