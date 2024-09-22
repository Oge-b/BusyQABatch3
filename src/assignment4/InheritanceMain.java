package assignment4;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher teacher = new Teacher();
		System.out.println(teacher.designation + " at " + teacher.collegeName + " is currently " +teacher.does());
		
		ComputerTeacher computerteacher = new ComputerTeacher();
		System.out.println(computerteacher.designation +" at " + computerteacher.collegeName + " is currently " + computerteacher.does());
	
	}

}
