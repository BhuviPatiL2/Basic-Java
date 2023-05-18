package twoDarray;

import java.util.*;

public class Transpose {

	public static void main(String[] args) {
		// taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the values " + i + j);
				arr[i][j] = sc.nextInt();
			}
		}

		// printing 2d array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j] + " "));
			}
			System.out.println();
		}

		// transpose of matrix
		int transpose[][] = new int[rows][cols];
		// transpose [rows][cols]=arr[cols][rows];

		// transpose matrix
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 0; i < arr.length; i++) {
				transpose[i][j] = arr[j][i];
			}
		}
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j <arr.length; j++) {
				System.out.print(transpose[i] [j]);
			}
			System.out.println();
		}

	}

}
