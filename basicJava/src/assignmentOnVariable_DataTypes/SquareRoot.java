package assignmentOnVariable_DataTypes;

import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find its square root");
		double n = in.nextDouble();
		double r;
		r = Math.sqrt(n);
		System.out.println("square root of " + n + " is :" + r);

	}

}
