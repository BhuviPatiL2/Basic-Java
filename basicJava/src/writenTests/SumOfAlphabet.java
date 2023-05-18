package writenTests;

import java.util.*;

public class SumOfAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = sc.nextLine();
		int sum=0;
	
		// String upper=s.toUpperCase();
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (arr[i] - 64);
			System.out.print((int) arr[i]+" ");
			sum=arr[i]+sum;
			System.out.println();
		}
		System.out.println("Sum "+sum);
	}
}



