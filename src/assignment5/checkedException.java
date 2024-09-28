package assignment5;

import java.io.IOException;

public class checkedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  checkedException example = new checkedException();
	        
	        try {
	            // Call a method that throws an IOException
	            example.readFile();
	        } catch (IOException e) {
	            // Handle the exception in the main method
	            System.out.println("IOException Caught: " + e.getMessage());
	        }
	    }

	    // Method that throws the IOException using 'throws'
	    public void readFile() throws IOException {
	        // Simulate an error by throwing an IOException
	        throw new IOException("File not found");
	    }

}
