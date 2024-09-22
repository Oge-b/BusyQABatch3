package assignment4;

public class InterfaceSum implements InterfaceDemo {
	

	public void sum() {
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}
	
	//main method to test implementation
	public static void main(String[] args) {
		
		InterfaceSum obj = new InterfaceSum();
		
		obj.sum();
	}

}
