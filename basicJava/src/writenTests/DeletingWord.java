package writenTests;

import java.util.*;

public class DeletingWord {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String s = sc.nextLine();
		System.out.println("Enter the word which u want to remove from above string");
		String w = sc.next();
		int l = s.length();
		for (int i = 0; i < l; i++) {
			if (s.contains(w)) {
				String temp = "abc ";
				w = temp;
				
			}
		}

	}
}