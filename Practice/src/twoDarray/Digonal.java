package twoDarray;

import java.util.*;

import javax.annotation.processing.AbstractProcessor;

public class Digonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
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
		//sum of main diagonal
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("sum of main diagonal"+sum + " ");
		
		//sum of minor diagonal
		sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
  
				if ((i + j) == (arr.length - 1)) {
					sum += arr[i][j];
				}
			}
		}
		System.out.print("sum of minor diagonal"+sum + " ");
	}

}
