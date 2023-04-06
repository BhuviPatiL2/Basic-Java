//4. create student class assign marks and calculate the percentage and print the result 1st class,2nd class etc.

package writenTests;

import java.util.*;

public class Studentss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five Subjects Marks");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int total = a + b + c + d + e;
		// System.out.println(total);
		float per = (total * 100) / 500;
		System.out.println(per);
		if (per < 35) {
			System.out.println("SORRY!!! You are Fail");
		} else if (per > 35 || per < 65) {
			System.out.println("Good Job!!! You are in SECOND Class");
		} else if (per > 65 && per < 75) {
			System.out.println("Congratulations You are in FIRST Class");
		} else if (per > 75 && per < 100) {
			System.out.println("Congratulations You Got First Class With Distingstion ");
		}
	}

}
