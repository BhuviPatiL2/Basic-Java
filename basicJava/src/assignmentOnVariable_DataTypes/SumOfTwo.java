//Write a Java program to enter two numbers and find their sum.
package assignmentOnVariable_DataTypes;
import java.util.*;
public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers for addition");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum of Given Numbers is :"+sum);

	}

}
