package assignment5;

public class UserDefinedExample {
	    public static void main(String[] args) {
	        try {
	            int result = performCalculation(0);
	            System.out.println("Result: " + result);
	        } catch (UserDefinedException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }

	    public static int performCalculation(int number) throws UserDefinedException {
	        if (number < 0) {
	            throw new UserDefinedException("Input must be non-negative.");
	        }
	        return number * 2; // Example calculation
	    }
	}

