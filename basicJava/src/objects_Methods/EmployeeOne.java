package objects_Methods;
import java.util.*;
public class EmployeeOne {

		//Scanner sc=new Scanner (System.in);
		//System.out.println("Enter the id name contact and department name of an employee");
		/*int i=sc.nextInt();
		String n=sc.next();
		long c=sc.nextLong();
		String d=sc.next();
		long s=sc.nextLong();
*/
		int id;
		String name,contact,dept;
		double salary;
		void setdata(int i,String n,String c,String d,double s) {
			id=i;
			name=n;
			contact=c;
			dept=d;
			salary=s;	
		
	}
		void display()
		{
			System.out.println(id+" "+name+" "+dept+" "+contact+" "+salary);
		}

}
