package shwetaPractice;

// method creation ,method calling ,object,local variable ,global variable,if else ,for loop
import java.util.Scanner;

public class Students {
	String name;
	String department;
	Scanner sc = new Scanner(System.in);

	public void obtained_marks() {

		int marks = 50;
		System.out.println("Name of the student:  " + name + "  department of the student: " + department);
		System.out.println("Marks of the Student:  " + marks);
		studentData();
		lic();
		per();

	}

	public void studentData() {
		System.out.println("Enter the name of the student");
		String name = sc.next();
		System.out.println("Enter the age of the student");
		int age = sc.nextInt();
		System.out.println("Enter the rollno of the student");
		long rollno = sc.nextLong();

		System.out.println("Name: " + name + " Age: " + age + " Roll No: " + rollno);
	}

	public void lic() {
		System.out.println("Enter the age of the candidate");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible");
		} else {
			System.out.println("Sorry...! You are not eligible");
		}
	}

	public void per() {
		System.out.println("Enter the percentage of student");
		int per = sc.nextInt();
		if (per >= 50 && per < 75) {
			System.out.println("You are pass");
		} else if (per >= 75) {
			System.out.println("Congratulations you have passed the test with distigntion");
		} else if (per < 35) {
			System.out.println("Sorry!!! You are fail");
		}
	}
	
	
	public void forloop() {
		for(int i=0;i<=5;i++) { 
			// initilization condtion increment 
			for(int j=1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.name = "bhuvi";
		s.department = "electrical";
		 //s.obtained_marks();
		// s.studentData();
		// s.per();
		//s.lic();
		s.forloop();
	}

}
