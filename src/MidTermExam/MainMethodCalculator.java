package MidTermExam;

import java.util.Scanner;

public class MainMethodCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept two numbers as input from the user. 
		Scanner scanner = new Scanner(System.in);
		
		//Create object of ScientifiCalculator for Square and Cube
		ScientificCalculator scienceCalc = new ScientificCalculator();
		System.out.println(" Scientific Calculation: ");
		System.out.print("Enter any value: ");
			float value = scanner.nextFloat();
					
			//confirm operation
		System.out.print("Enter operation (square/ cube/ addition/ subtraction/ multiplication/ division): ");
					String operation = scanner.next();
					
					switch (operation) {
					//square
					case "square":
						System.out.println(" Output: " + scienceCalc.square(value));
						break;
					//cube	
					case "cube":
						System.out.println("Output: " + scienceCalc.cube(value));
						break;
					//addition
					case "addition": 
						System.out.print("Enter second value: "); //second value for addition
						float number1 = scanner.nextFloat();
						System.out.println("Output: " + scienceCalc.add(value, number1));
						break;
					//subtraction
					case "subtractrion":
						System.out.print("Enter second value: "); //second value for subtraction
						float number2 = scanner.nextFloat();
						System.out.println("Output: " + scienceCalc.subtract(value, number2));
						break;
					//multiplication
					case "multiply":
						System.out.print("Enter second value: "); //second value for multiplication
						float number3 = scanner.nextFloat();
						System.out.println("Output: " + scienceCalc.multiply(value, number3));
						break;
					//division
					case "divide":
						System.out.print("Enter second value: "); //second value for division
						float number4 = scanner.nextFloat();
						System.out.println("Output: " + scienceCalc.divide(value, number4));
						break;
						
					default:
						System.out.println("Error: Operation cannot be processed");
						break;
					}
					
		//Create object for BasicCalculator
			BasicCalculator basicCalc = new BasicCalculator();
			System.out.println(" Basic Calculations for 3 Values: " );
			//accept 3 integers from user
			System.out.print("Enter first value: ");
			int intvalue1 = scanner.nextInt();
			System.out.print("Enter second value: ");
			int intvalue2 = scanner.nextInt();
			System.out.print("Enter third value: ");
			int intvalue3 = scanner.nextInt();
			
			//Print out addition
			System.out.println("Addition of 3 Values: " + basicCalc.add(intvalue1,intvalue2,intvalue3));
			
		//Perform the selected operation on the two numbers using the appropriate calculator
			System.out.print(" Enter the first of two values: ");
			float value1 = scanner.nextFloat();
			System.out.print("Enter the second of two values: ");
			float value2 = scanner.nextFloat();
			
			//Print out addition
			System.out.println("Addition of 2 Values: " + basicCalc.add(value1, value2));
			
					scanner.close();
	}
}
				
	
