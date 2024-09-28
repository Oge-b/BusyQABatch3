package assignment5;

public class ExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a) Any number divided by zero
        try {
            int num = 10;
            int result = num / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Error message is " + e);
        } finally {
            System.out.println("Division by zero attempt completed.");
            System.out.println();
        }

        // b) int a[]=null; a.length
        try {
            int[] a = null;  // Null array
            System.out.println("Array length: " + a.length);  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Oops! Error message is " + e);
        } finally {
            System.out.println("Null array length check completed.");
            System.out.println();
        }

        // c) ArrayIndexOutOfBounds example
        try {
            int[] arr = new int[5];  // Array with 5 elements (indexes 0 to 4)
            arr[10] = 50;  // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Error message is " + e);
        } finally {
            System.out.println("Array index access attempt completed.");
        }

	}

}
