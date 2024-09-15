package com.learning.basicofJava;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a = 15;
		int b = 10;
		
		if (a>b) {  // 5 > 10 F
			System.out.println("A is greater than B");
		}
		else {
			System.out.println("B is greater than A");
			System.out.println("Busy QA");
		}
		
		System.out.println("Continuation of the code");
*/
		
		int a = 15;
		int b = 10;
		int c = 20;
		
		if (a>b) {  // 5 > 10 F  //15 > 10 T
			System.out.println("A is greater than B");
			
			if (b>c) {  // 10>20 F
				System.out.println("B is greater than C");
				
			}
			else {
				System.out.println("C is greater than B");
				System.out.println("Busy QA");
			}
		}
		else {
			System.out.println("B is greater than A");
			System.out.println("Busy QA");
		}
		
		System.out.println("Continuation of the code");
		
	
	
		}
	}

