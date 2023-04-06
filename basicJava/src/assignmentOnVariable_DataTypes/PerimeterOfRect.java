//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter.
package assignmentOnVariable_DataTypes;

import java.util.Scanner;

public class PerimeterOfRect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and bridth of rectangle to find its perimeter");
		int l = scan.nextInt();
		int b = scan.nextInt();
		int peri = 2 * (l + b);
		System.out.println("Perimter of recatngle is :" + peri);

	}

}
