package assignment4;

public class MultipleInterfaceClass implements AddInterface, MulInterface {

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return x * y;

	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return a + b;

	}
public static void main(String[] args) {
	MultipleInterfaceClass calc = new MultipleInterfaceClass();
	
	System.out.println("The sum of " + a + " and " + b + " is: " + calc.add());
	System.out.println("The product of " + x + " and " + y + " is: " + calc.mul());
}
}
