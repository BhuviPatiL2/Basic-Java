package constructor;

import java.util.*;

public class Car2Main {
//private int id, price, launchyear;
	// private String name, company;
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter id,name,company ,price ,launchyear of a car");
		int id=sc.nextInt();
		String name=sc.next();
		String company=sc.next();
		int price=sc.nextInt();
		int launchyear=sc.nextInt();
		Car2 c=new Car2();
		c.setId(id);
		
		
		
	}

}
