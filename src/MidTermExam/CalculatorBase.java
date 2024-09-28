package MidTermExam;

public class CalculatorBase {
	
	//Accept two numbers as input from the user. 
	
	public float add(float a, float b) {
		return a + b;
	}
	public float subtract(float a, float b) {
		return a - b;
	}
	public float multiply(float a, float b) {
		return a * b;
	}
	
	//Your program should handle division 
	//by zero by displaying an appropriate error message
	public float divide(float a, float b) {
		if (b==0) {
			System.out.println("Oops. Not divisible by Zero.");
			return 0;
		}
		return a / b;
	}
}
