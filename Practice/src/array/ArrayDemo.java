package array;

import java.util.*;

public class ArrayDemo {

	public static void display2D(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	static void rsum(int arr[][]) {
		Sy);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of cols");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			System.out.println("Enter "+i+j+" element ");
				arr[i][j] = sc.nextInt();
			}
		}
		display2D(arr);

	}
}