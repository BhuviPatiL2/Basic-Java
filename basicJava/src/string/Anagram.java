package string;

import java.util.Arrays;

public class Anagram {

	static void anagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			int count = 0;
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] == c2[i]) {
					count++;
				}
			}
			if (count == c1.length) {
				System.out.println("Given String is Anagram");
			} else {
				System.out.println("Given String is NOT an Anagram");
			}
		} else {
			System.out.println("Length is differnt so that why its not an anagram");
		}

	}

	public static void main(String[] args) {

		String s1 = "tea";
		String s2 = "eat";
		anagram(s1, s2);

	}

}
