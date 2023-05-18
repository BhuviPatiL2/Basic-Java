package twoDarray;

import java.util.*;

public class Upper_Lower_TriangularMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		// taking user input and print the 2D array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the " + i + j + " Element");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		if (rows != cols) {
			System.out.println("Matrix shoulde be a square matrix to print lower triangular and upper triangular");
		} else {
			int sum = 0;
			// upper triangular matrix
			System.out.println("Upper Triangular Matrix");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (i > j) {
						System.out.print("0" + " ");
					} else {
						System.out.print(arr[i][j] + " ");
						sum += arr[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("Sum of upper triangular matrix :" + sum);
			// Lower triangular matrix
			sum = 0;
			System.out.println("Lower triangular matrix");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (i < j) {
						System.out.print("0" + " ");
					} else {
						System.out.print(arr[i][j] + " ");
						sum += arr[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("Sum of lower trianh=gular matrix :" + sum);

		}
		sc.close();
	}
}

//