package array;

import java.util.*;

public class ReversArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// taking user input and creating an array

		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("After reversing the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
