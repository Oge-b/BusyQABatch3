package assignment3;

public class Calculation { //class name 
		
		int num1, num2, num3; //Declare 3 integer variables
		
		//Constructor to assign values to the variables
		public Calculation(int a, int b, int c) { 
			num1 = a;
			num2 = b;
			num3 = c;
		}
		
		//Method sum to calculate the sum of the 3 numbers
	    public void sum() {
	    	int total = num1 +num2 +num3;
	    	System.out.println("Sum of the numbers:" + total);
	    }
	    
	    public static void main(String[] args) {
	    	//Object of the Calculation class passing 3 integer values 
	    	Calculation calc = new Calculation(10, 20, 30);
	    	
	    	//Call sum method to calculate and print the sum
	    	calc.sum();
	    }
	}

