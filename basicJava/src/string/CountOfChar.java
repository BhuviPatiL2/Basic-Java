package string;

import java.util.*;

public class CountOfChar {

	static void meth(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		int cnt = 0;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (ch == c[i]) {
				cnt++;
			}
		}
		System.out.println(ch + " :" + cnt);
	}

	static void uppercase(String s) {
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].toUpperCase() + " ");
			// System.out.print(str[i].toLowerCase());
		}

	}

	static void lowerCase(String s) {
		String str[] = s.split("good");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	static void eqlMeth(String s, String s1) {

		System.out.println(s.equals(s1));
		System.out.println(s == s1);

	}

	static void changeCase(String s) {
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

	public static void main(String[] args) {
		String s = "Java is a very good programming language";
		// String s1 = "Java Is A Very good programming Language";
		// String s2 = "Java is a very good programming language";
		// meth(s);
		// uppercase(s);
		// lowerCase(s);
		// eqlMeth(s,s1);
		// System.out.println(s.equals(s2));
		// System.out.println(s==s1);
		// System.out.println(s1==s2);
		changeCase(s);

	}

}
