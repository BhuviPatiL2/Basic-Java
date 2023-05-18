package array;

import java.util.Scanner;

public class TestCar {
	Car c[] = new Car[4];
	Scanner sc = new Scanner(System.in);

	void addData() {
		/*
		 * for (int i = 0; i < 3; i++) { System.out.println("Enter id,name,and price  "
		 * + (i + 1) + " of the car"); int id = sc.nextInt(); String name = sc.next();
		 * int price = sc.nextInt();
		 */
		//
		// Car c1 = new Car(id, name, price);
		// c[i]=c1;

		c[0] = new Car(1, "ABC", 720000);
		c[1] = new Car(2, "PQR", 850000);
		c[2] = new Car(3, "XYZ", 620000);
		c[3] = new Car(4, "EFG", 520000);

	}

	void displayArray() {
		for (int i = 0; i < c.length; i++) {
			if (c[i].price > 700000) {
				System.out.println(c[i]);
			}
		}

	}

	public static void main(String[] args) {

		TestCar t = new TestCar();
		t.addData();
		t.displayArray();

	}
}
