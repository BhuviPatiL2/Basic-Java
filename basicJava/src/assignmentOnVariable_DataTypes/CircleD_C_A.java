//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.

package assignmentOnVariable_DataTypes;

import java.util.*;

public class CircleD_C_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of a circle");
		float r = sc.nextFloat();
		float d = r / 2f;
		float c = 3.14f * 2f * r;
		float a = 3.14f * r * r;
		System.out.println("Diameter of circle: " + d);
		System.out.println("Circumferance of circle: " + c);
		System.out.println("Area of circle: " + a);

	}

}
