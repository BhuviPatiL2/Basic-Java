package twoDarray;

import java.util.*;

public class CharArray {
	

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		String s[] = new String[size];
		System.out.println("ENter the " + size + " elements");

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}

}
