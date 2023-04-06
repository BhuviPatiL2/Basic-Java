package writenTests;

import java.util.*;

public class Comparison {
	public void compare(int a, int b) {

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

	public void compare(char a, char b) {
		int x = a;
		int y = b;

		if (x > y) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comparison c = new Comparison();

		System.out.print("Enter first integer: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = sc.nextInt();
		c.compare(n1, n2);

		System.out.print("Enter first character: ");
		char c1 = sc.next().charAt(0);
		System.out.print("Enter second character: ");
		char c2 = sc.next().charAt(0);
		c.compare(c1, c2);

	}

}
