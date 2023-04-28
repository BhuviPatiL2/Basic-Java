package array;

import java.util.*;

public class TestReservation {
	Scanner sc = new Scanner(System.in);
	//Reservation t[] = new Reservation[3];

	public void personInfo() {
		for (int i = 0; i < t.length; i++) {
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			System.out.println("Enter the price");
			int price = sc.nextInt();
			
		}
	}

	public void display() {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
  public double discount_price() {
	  int price=1;
	  for (int i = 0; i < t.length; i++) {		  
	  if (t[i].age>=60) {
		  price=t[i].price;
		 int d = price / 20;
			price = price - d;	
	  }else  {
		  System.out.println(price);
	  }
	  }
	  return price;
  }
	public static void main(String[] args) {
		TestReservation obj=new TestReservation ();
		obj.personInfo();
		obj.display();
		obj.discount_price();
	}

	class Ticket {

	}

}
