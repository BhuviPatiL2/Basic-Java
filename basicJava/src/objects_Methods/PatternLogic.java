package objects_Methods;

import java.util.Scanner;

public class PatternLogic {
	Scanner sc = new Scanner(System.in);

	void numPiramid() {
		System.out.println("Enter the row number");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			for (int j = n - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

		}
	}

	void alphaPattern() {
		System.out.println("Enter the row number");
		int m = sc.nextInt();
		for (int i = m; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();

		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();

		}

	}

	void starPattern() {
		System.out.println("Enter the row number");
		int l = sc.nextInt();
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}
		for (int i = l; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

	}
}
