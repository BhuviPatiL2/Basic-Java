package constructor;
import java.util.*;
public class Faculty2Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter id ,name,contact,subject,salary of faculty");
		int id=sc.nextInt();
		String name=sc.next();
		String contact=sc.next();
		String subject=sc.next();
		int salary=sc.nextInt();
		Faculty2 f1=new Faculty2();
		f1.setId(id);
		f1.setName(name);
		f1.setContact(contact);
		f1.setSubject(subject);
		f1.setSalary(salary);
		System.out.println(f1.getId()+ " "+f1.getName()+" "+f1.getContact()+" "+f1.getSubject()+" "+f1.getContact());
		
		
		Faculty2 f2=new Faculty2();
	
		f1.setId(7);
		f1.setName("Nilam");
		f1.setContact("9999900020");
		f1.setSubject("English");
		f1.setSalary(32000);
		System.out.println(f1.getId()+ " "+f1.getName()+" "+f1.getContact()+" "+f1.getSubject()+" "+f1.getContact());
		
	}

}
