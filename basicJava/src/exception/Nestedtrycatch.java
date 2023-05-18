package exception;

import java.util.*;

public class Nestedtrycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 100;
		int arr[] = { 19, 29, 39, 49 };
		String s = "Bhuvi";
		try { // outer try
			try {
				
				try { // inner try
					System.out.println("Character  " + s.charAt(3));
				}
				catch (StringIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
				
				System.out.println("Enter b");
				int b = sc.nextInt();
				System.out.println("Division is " + a / b);	
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
			System.out.println(" Element in an array " + arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter denominatror");
		int d = sc.nextInt();
		System.out.println("Second division : " + a / d);

		System.out.println(" Element in an array " + arr[0]);

	}
}
