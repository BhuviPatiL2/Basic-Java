package twoDarray;

import java.util.*;

public class SubtractionOfmatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1st array
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the values " + i + j);
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}

		// 2nd array
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of cols");
		int c = sc.nextInt();

		int ar[][] = new int[r][c];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the values " + i + j);
				ar[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

		// subtraction
		int sub[][] = new int[rows][cols];

		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				sub[i][j] = arr[i][j] - ar[i][j];
			}
		}

		// print subtraction
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length; j++) {
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
