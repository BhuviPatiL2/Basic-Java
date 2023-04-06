package objects_Methods;

import java.util.Scanner;

public class MainCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car c1=new Car ();
		System.out.println("Enter the id,launchyear,name,comapny,price");
		
		int id=sc.nextInt();
		int launchyear=sc.nextInt();
		
		String name=sc.next();
		String company=sc.next();
		
		float price=sc.nextFloat();
		
		c1.setStudentData(id, launchyear, name, company, price);
		}

	/*Car c2 = new Car();
	System.out.println("Enter the id,launchyear,name,comapny,price");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	int launchyear=sc.nextInt();
	
	String name=sc.next();
	String company=sc.next();
	
	float price=sc.nextFloat();
	
	c2.setStudentData(id, launchyear, name, company, price);
}
	Car c3 = new Car();
*/
}


