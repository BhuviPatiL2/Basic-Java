package objects_Methods;
import java.util.Scanner;
public class EmployeeDetails {
	int id;
	String name;
	String contact;
	double salary;
	String dept;
	
	void setDatat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name,contact,dept,salary");
		int i=sc.nextInt();
		String n=sc.next();
		String c=sc.next();
		String d=sc.next();
		double s=sc.nextDouble();
		id=i;
		name=n;
		contact=c;
		dept=d;
		salary=s;
	}
	void display() {
		System.out.println("id :"+id+" name :"+name+" contact :"+contact+" dept :"+dept+" salary :"+salary);
	}

	

	}


