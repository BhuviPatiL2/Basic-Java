//2.	Write a Java program to convert days into years, weeks and days.
package writenTests;

import java.util.*;

public class DaysToYear {

	public static void main(String args[]) {
		int num, y, w,  m;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of days:");
		num = s.nextInt();
		y = num / 365;
		num = num % 365;
		System.out.println("Number of years: " +y);
		w = num / 7;
		num = num % 7;
		System.out.println("Number of weeks: " + w);
		System.out.println("Number of days: " + num);
	}
}
