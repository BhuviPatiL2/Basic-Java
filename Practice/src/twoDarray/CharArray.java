package twoDarray;

import java.util.*;

public class CharArray {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("First add some characters...");
		char[] a = s.next().toCharArray();
		System.out.println("Elements = ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Min character :" +a[0]);
	}

}
