package com.learning.basicofJava;

public class CalculationInput {
	
	int sum(int x, int y) {
		return x + y;
	}
	
	int sum(int x, int y, int z) {
		return x = y = z;
	}
	double sum(double x, double y) {
		return x + y;
	}
	double sum(double x, double y, double z) {
		return x + y + z;
	}
	
	 public static void main(String[] args) {
	        // Create an object of the Calculation class
	        CalculationInput cal = new CalculationInput();

	        // Call the different sum methods
	        System.out.println("Sum of two integers: " + cal.sum(40, 50));
	        System.out.println("Sum of three integers: " + cal.sum(40, 50, 60));
	        System.out.println("Sum of two doubles: " + cal.sum(40.5, 60.5));
	        System.out.println("Sum of three doubles: " + cal.sum(40.5, 50.5, 60.5));
	    }

}
