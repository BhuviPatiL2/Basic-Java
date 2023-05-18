package string;

import java.util.*;

//find out no.of vowels in the string 
public class Demo1 {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		// String s = "bhuvaneshwari";
		
		String s1="I like java programming";
		int count = 0;
		int count1 = 0;
		int res;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			} else if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {

				count1++;
			}
		}
		System.out.println("Number of vowels " + count);
		System.out.println("number of consonanat " + count1);
	}

	
	void changeCase(String s) {
		char[] s2 = s.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] >= 'a' && s2[i] <= 'z') {
				s2[i] = (char) (s2[i] - 32);
			} else if (s2[i] >= 'A' && s2[i] <= 'Z') {
				s2[i] = (char) (s2[i] + 32);
			}
		}
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]);
			
		}
	}
	
	void changeVowelCase(String s1) {
		for (int i = 0; i < s1.length(); i++) {
		char c1=s1.charAt(i);
		char [] arr=s1.toCharArray();
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ||c1 == 'A' || c1 == 'E' || c1 == 'I' ||c1 == 'O' || c1 == 'U'  ) {
			
				
			
			
		}
	}
}
