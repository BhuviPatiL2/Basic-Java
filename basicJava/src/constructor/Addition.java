package constructor;
import java.util.*;
public class Addition {
	void add(int a, int b) {
		System.out.println("Addition :" + (a + b));
	}

	void add(int a, float b) {
		System.out.println("Addition :" + (a + b));
	}

	void add(int a, long b) {
		System.out.println("Addition :" + (a + b));
	}

	void add(int a, double b) {
		System.out.println("Addition :" + (a + b));
	}

	void add(float a, int b) {
		System.out.println("Addition :" + (a + b));
	}

	void add(int a, int b, String c) {
		System.out.println("Addition :" + (a + b) +" "+ c);
	}

	void add(String a, int b, int c) {
		System.out.println("Addition :" + a + (b + c));
	}

	void add(String e, int a, int b, String c) {
		System.out.println("Addition :" + e + (a + b) + c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Addition a1=new Addition();
		a1.add("Welcome", 2, 5);
		System.out.println("enter values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		a1.add(a, b, c);
	}
}
