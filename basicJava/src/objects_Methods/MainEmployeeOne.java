package objects_Methods;
import java.util.*;
public class MainEmployeeOne {

	public static void main(String[] args) {
		EmployeeOne e1=new EmployeeOne();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name,contact,dept and salary of an employee");
		
		int i=sc.nextInt();
		String n=sc.next();
		String c=sc.next();
		String d=sc.next();
		double s=sc.nextLong();
		
		e1.setdata(i, n, c, d, s);
		e1.display();
		EmployeeOne e2=new EmployeeOne();
System.out.println("Enter the id,name,contact,dept and salary of an employee");
		
	 i=sc.nextInt();
		 n=sc.next();
		 c=sc.next();
		 d=sc.next();
		 s=sc.nextLong();
		 e2.setdata(i, n, c, d, s);
			e2.display();
		}

	}


