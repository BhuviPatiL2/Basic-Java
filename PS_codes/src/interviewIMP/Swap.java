package interviewIMP;

import java.util.*;

public class Swap {

	static int a, b;

	public void withThirdVariable() {

		int c;
		c = b;
		b = a;
		a = c;
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

	public void without3rdVariable() {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a ");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();

		Swap obj = new Swap();
		obj.withThirdVariable();
		obj.without3rdVariable();
	}

}
