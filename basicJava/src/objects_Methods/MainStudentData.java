package objects_Methods;

import java.util.Scanner;

public class MainStudentData {

	public static void main(String[] args) {
		StudentData s1 = new StudentData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id,name,email and contact of a student1");

		int i = sc.nextInt();
		String n = sc.next();
		String e = sc.next();
		String c = sc.next();

		// int i,String n,String e,String c
		s1.data(i, n, e, c);
		s1.display();
		StudentData s2 = new StudentData();
		System.out.println("Enter the id,name,email and contact of a student2");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		c = sc.next();
		s2.data(i, n, e, c);
		s2.display();
		StudentData s3 = new StudentData();
		System.out.println("Enter the id,name,email and contact of a student3");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		c = sc.next();
		s3.data(i, n, e, c);
		s3.display();

	}
}
