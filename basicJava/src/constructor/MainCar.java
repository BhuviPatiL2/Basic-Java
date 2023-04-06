package constructor;

import java.util.*;

public class MainCar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Car c=new Car();
		Car c1 = new Car();
		System.out.println("Enter id,name,company,price of the car");
		int id = sc.nextInt();
		String name = sc.next();
		String company = sc.next();
		int price = sc.nextInt();
		Car c2 = new Car(id, name, company, price);
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("Enter id,name,company,price of the car");
		id = sc.nextInt();
		name = sc.next();
		company = sc.next();
		price = sc.nextInt();
		Car c3 = new Car(id, name, company, price);
		System.out.println(c1);
		System.out.println(c2);
	}

}
