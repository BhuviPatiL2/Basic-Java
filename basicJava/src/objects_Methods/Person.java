package objects_Methods;
import java.util.*;
public class Person {
	Scanner sc=new Scanner (System.in);
static int balance;
static Payment p1= new Payment();	
	
	public static void main(String[] args) {
		
		p1.setP_Id(2);
		p1.setP_mode("Gpay");
		p1.setBalance(10000);
		p1.setBalance(10000-balance);
	}
		Payment send() {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("Payment mode");
			String mode=sc.next();
			System.out.println("enter balance");
		 balance=sc.nextInt();
			
			System.out.println(id+" "+mode+" "+balance+" ");
			
			
			
			return p1;	
		}
	
		
		// Public Person p(Person ){

		// public Person balance() {
		// Person p1=new Person();
		// return balance;

	}

	
