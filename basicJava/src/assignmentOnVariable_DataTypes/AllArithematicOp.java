//2. Write a Java program to enter two numbers and perform all arithmetic operations.
package assignmentOnVariable_DataTypes;

import java.util.*;

public class AllArithematicOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("Sumation :" + sum);
		System.out.println("Subtraction :" + sub);
		System.out.println("Multiplication :" + mul);
		System.out.println("Division :" + div);
		System.out.println("Modulus :" + mod);

	}

}
