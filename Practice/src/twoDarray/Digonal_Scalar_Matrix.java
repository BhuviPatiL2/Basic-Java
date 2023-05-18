package twoDarray;

import java.util.*;

public class Digonal_Scalar_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row and cols");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the " + i + j + " elements");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// to check matrix is Diagonal or NOT

		boolean isDigonal = true;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i != j && (arr[i][j] != 0)) {
					isDigonal = false;
				}
			}
		}
		if (isDigonal == true) {
			System.out.println("It is digonal matrix");
		} else {
			System.out.println("It is not a digonal matrix");
		}

		// to check matrix is Scalar NOT
		System.out.println("Enter the row and cols");
		int m = sc.nextInt();
		int ar[][] = new int[m][m];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the " + i + j + " elements");
				ar[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		boolean isSclar = true;
		boolean isDia = true;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i != j && (ar[i][j] != 0)) {
					isDia = false;
				}
			}
		}
		//System.out.println(isDia);
		if (isDia == false) {
			System.out.println("it is not scalar matrix");
		} else {
			for (int i = 0; i < ar.length-1; i++) {
				if (ar[i][i] != ar[i + 1][i + 1]) {
					isSclar = false;
				}
			}
			if (isSclar == true) {
				System.out.println("It is scalar matrix");
			} else {
				System.out.println("it is not scalar matrix");

			}
		
		}
		sc.close();
	}
}