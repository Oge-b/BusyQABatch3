package assignment3;

public class Student { //create class name
		
	    // Declare variables
	    int SID;            // Student ID
	    String Sname;       // Student Name
	    int Sub1, Sub2, Sub3; // Student Marks

	    // Method to set student details (ID and name)
	    public void getStuData(int id, String name) {
	        SID = id;
	        Sname = name;
	    }

	    // Method to set student marks to Sub1, Sub2, Sub3
	    public void getStuMarks(int mark1, int mark2, int mark3) {
	        Sub1 = mark1;
	        Sub2 = mark2;
	        Sub3 = mark3;
	    }

	    // Method to calculate and print the total marks
	    public void totalMarks() {
	        int total = Sub1 + Sub2 + Sub3;
	        
	        
	        System.out.println("Student ID: " + SID);
	        System.out.println("Student Name: " + Sname);
	        System.out.println("Total Marks: " + total);
	    }

	    public static void main(String[] args) {
	        // Create objects from Student class
	        Student stu1 = new Student();
	        Student stu2 = new Student();

	        // Call methods for stu1
	        stu1.getStuData(101, "Oge Asiegbu");
	        stu1.getStuMarks(42, 55, 80);
	        stu1.totalMarks();

	        System.out.println(); // For spacing

	        // Call methods for stu2
	        stu2.getStuData(102, "Favour Mark");
	        stu2.getStuMarks(50, 45, 70);
	        stu2.totalMarks();
	    }
	}
