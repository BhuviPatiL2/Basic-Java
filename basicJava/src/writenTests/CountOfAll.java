package writenTests;

import java.util.Scanner;

public class CountOfAll {

	public static void main(String args[]) {

		String s;
		int alpha = 0, num = 0, spc = 0, Spe = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String  ");
		s = scan.nextLine();

		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				alpha++;
			}

			else if (ch >= '0' && ch <= '9') {
				num++;
			} else if (ch == ' ') {
				spc++;
			} else {
				Spe++;
			}
			i++;
		}
		System.out.println("Alphabet Count: " + alpha);
		System.out.println("Number: " + num);
		System.out.println("Space: " + spc);
		System.out.println("Special characters: " + Spe);
	}
}
