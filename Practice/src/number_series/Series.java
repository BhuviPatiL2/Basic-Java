package number_series;

import java.util.*;

public class Series {
	Scanner sc = new Scanner(System.in);

	public void one() {
		// 10,20,30,40,50,60;
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int a = 10;
		System.out.print(a + " ");
		for (int i = 2; i <= num; i++) {
			int b = a + 10;
			System.out.print(b + " ");
			a = b;
		}
	}

	public void two() {
		// 1,4,9,16,25
		System.out.println("Enter the num");
		int num = sc.nextInt();
		System.out.println("Enter the number");
		int u = sc.nextInt();
		for (int i = u; i <= num; i++) {
			int sq = i * i;
			System.out.println(sq);

		}
	}

	public void three() {
		// a + a2 / 2 + a3 / 3 + …… + a10 / 10
		System.out.println("Enter the num");
		int num = sc.nextInt();
		System.out.println("Enter the number");
		double a=sc.nextDouble();
		for (int i = 1; i <= num; i++) {
			//for (int j = 1; j <= i; j++) {
				a = a * a;
				
			}
			System.out.println(a);
		}

	

	public static void main(String[] args) {
		Series s = new Series();
		// s.one();
		// s.two();
		s.three();
	}

}
