package array;
import java.util.*;
public class Reservation {
	static String name;
	static int age;
	static double price;
	
	public double price(double price) {
		if(age>=60) {
			double d=price/30;
			price=price-d;			
		}
		return price;
	}
	
	public void display() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the name");
		 name = sc.next();
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the price");
		price = sc.nextInt();
		Reservation r=new Reservation();
		r.price(price);
	}
	
}
