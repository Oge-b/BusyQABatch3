package com.learning.basicofJava;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		int primary = 1;
		int secondary = 1;
		
		System.out.println("Fibonacci Series in the range of 1 to 50: ");
		
		if (primary <= 50) {
			System.out.print(primary + " ");  //first number
		} 
		
		if (secondary <= 50) {
			System.out.print(secondary + " ");
		}
		
		//for the rest of the series
		
		while (true) {
			int next = primary + secondary; 
			
			if (next > 50) { //discontinue when the next number >50
				break;
			}
			System.out.print(next + " ");
			
			primary = secondary;
			secondary = next;
			
		}
		
		System.out.println();
	}
}
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		long factorial = 1;
		int counter = number;
		
		while (counter >0) {
			factorial *= counter; //factorial multiplied by current counter
			counter--;  //Decrease the counter
		}
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		scanner.close();
		
	}
}
*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a number: ");
		
		int number = scanner.nextInt();
		
		
		int initialnumber = number;  //store the initial number for comparison
		int reversed = 0; //variable to hold reversed number
				
		while (number != 0) {
			int lastdigit = number % 10; //to get the last digit as a remainder
			reversed = reversed *10 + lastdigit; //shifts the reversed number
			number = number / 10; //divide the number to remove the last digit
		}
		
		if (initialnumber == reversed) {
			System.out.println(initialnumber + " is a palindrome.");
		} else { 
			System.out.println(initialnumber + " is not a palindrome");
		}
		
		scanner.close();
	}
}
		*/
		
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		int reversednumber = 0;
		
		//hold the reversed number
		while (number != 0) {
			int figure = number % 10; //to get the last digit as a remainder
			reversednumber = reversednumber * 10 + figure; // shifts the reversed number
			number /=10; // divide the reversed number by 10 to remove last digit
		}
			//Display the output
			System.out.println("Reversed number: " + reversednumber);
			
			scanner.close();
		}
	}
*/
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		int count = 0;
		
		if (number == 0) {
			count = 1;
		} else {
			while (number != 0) {
				number = number /10;
				count++;
			}
		}
		System.out.println("Number of digits: " + count);
		
		scanner.close();
		}
		
		
	}
		*/
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int number = scanner.nextInt();
		
		System.out.println("Multiplication table for " + number + ":");
		
		for (int i = 1; i <=10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
			
		}
		scanner.close();
	}
}
*/		
		/*
		 *Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter a year: ");
		
		int year = scanner.nextInt();
		boolean isaLeapyear;
		
		if ((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0)) {
			isaLeapyear = true; //A leap year
		} else {
			isaLeapyear = false; //Not a leap year
		}
		
		if (isaLeapyear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		
		scanner.close();
	}

}	
		
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a month number (1 - 12):");
		int month = scanner.nextInt();
		
		int days;
		
		
		switch (month) {
		case 1: //January
		case 3: //March
		case 5: //May
		case 7: //July
		case 8: //August
		case 10: // October
		case 12: //December
			days = 31;
		break; 
		case 4: //April
		case 6: //June 
		case 9: //September
		case 11: //November
			days = 30;
			break;
		case 2: //February 
			
			/*This is how the Gregorian calendar calculates leap years: 
			If the year is divisible by four, it's a leap year. 
			But if the year can be divided by 100 as well as four, it's not a leap year. 
			However, if the year is divisible by 400, it is a leap year*/
			
		/*	System.out.println("Enter the year:");
			int year = scanner.nextInt();
			
			if ((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0)) {
				days = 29; //Leap year
		} else {
			days = 28; //Not a leap year
		}
			break;
			default:
			days = -1; // Invalid month
            System.out.println("Invalid month number.");
	
            break;	
		}
		if (days != -1) {
		
	System.out.println("Number of days:" + days);

		scanner.close();
		}
	}
}
*/	
		

		
		
		/* Scanner scanner = new Scanner(System.in);
		//User to Enter First number
		System.out.println("Enter the first number:");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter the second number:");
		int number2 = scanner.nextInt();
		
		System.out.println("Enter the third number:");
		int number3 = scanner.nextInt();
		
		
		//To find the greatest
		int greatest;
		
		if (number1 >= number2 & number1 >=number3) {greatest = number1;
		}
		else if (number2 >= number1 & number2 >= number3) {greatest = number2;
		}
		else { greatest = number3;
		}
		
		System.out.println("The greatest number is:" + greatest);
		
		scanner.close();
		}
		
		*/
		
		
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number = scanner.nextInt();
		
		if (number > 0) {
			System.out.println("Number is positive");
		}
			else if (number < 0) {
				System.out.println("Number is negative");}
		
			else {
				System.out.println("Number is Zero");}
		
		scanner.close();*/
		
		
		
		//Before swapping;
		
			/*	int a = 10;
				int b = 20;
				//System.out.println("a =" + a);
				//System.out.println("b =" + b);
				
				
				//After Swapping
				int temp = a;
				a = b;
				b = temp;
				
				System.out.println("a =" + a);
				System.out.println("b =" + b);
				*/
		
		
		/* int a = 4;
		int b = 36;
		int sum = a+b;
		
		System.out.println(sum);*/
		
		/*String Firstname = "Oge";
		
		System.out.println("Hello");
	    System.out.println (Firstname); */

		
		
		
		
		
		
		
		/*
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number = scanner.nextInt();
		
		if (number > 0) {
			System.out.println("Number is positive");
		}
			else if (number < 0) {
				System.out.println("Number is negative");}
		
			else {
				System.out.println("Number is Zero");}
		
		scanner.close();
		*/
		

	

