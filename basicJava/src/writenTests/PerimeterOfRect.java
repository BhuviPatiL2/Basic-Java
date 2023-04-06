//1.Write a Java program to enter length and breadth of a rectangle and find its perimeter.
package writenTests;

import java.util.*;

public class PerimeterOfRect {

	public static void main(String[] args) {
		System.out.println("Enter length and breadth of a rectangle");
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int b = scan.nextInt();
		int peri = 2 * (l + b);
		System.out.println("The perimeter of rectangle is: " + peri);

	}

}
