//4. Write a Java program to enter length and breadth of a rectangle and find its area.
package assignmentOnVariable_DataTypes;
import java.util.*;
public class AreaOfRect {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter length and bridth of rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle is :"+area);
		

	}

}
