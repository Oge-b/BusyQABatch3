package com.learning.basicofJava;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeClass emp1 = new EmployeeClass();
		EmployeeClass emp2 = new EmployeeClass();
		EmployeeClass emp3 = new EmployeeClass();
		
		emp1.eid = 1;
		emp1.ename = "Srikant";
		emp1.job = "Instructor";
		emp1.sal = 100000;
		
		emp2.eid = 2;
		emp2.ename = "James";
		emp2.job = "Student";
		emp2.sal = 200000;
		
		emp3.eid = 3;
		emp3.ename = "Oge";
		emp3.job = "Student";
		emp3.sal = 600000;
		
		emp1.display();
		emp1.bonus();
		
		emp2.display();
		emp2.bonus();
		
		emp3.display();
		emp3.bonus();
		
	
	}

}
