package constructor;
import java.util.*;
public class MainFaculty {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Faculty f1=new Faculty();
		System.out.println("Enter id,name,subject,college name and salary of faculty");
		int i=sc.nextInt();
		String n=sc.next();
		String s=sc.next();
		String cn=sc.next();
		int sal=sc.nextInt();
		Faculty f2=new Faculty(i,n,s,cn,sal);
		System.out.println("Enter id,name,subject,college name and salary of faculty");
		 i=sc.nextInt();
		n=sc.next();
		 s=sc.next();
		cn=sc.next();
		sal=sc.nextInt();
		Faculty f3=new Faculty(i,n,s,cn,sal);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		
		
		

	}

}
