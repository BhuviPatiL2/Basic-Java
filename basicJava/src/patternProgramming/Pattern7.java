package patternProgramming;

import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int a = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			for (int j = i - 1; j >= 1; j--) {

				System.out.print(j);
			}

			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			for (int j = i - 1; j >= 1; j--) {

				System.out.print(j);
			}

			System.out.println();

		}
	}
}
