package array;

import java.util.*;

public class DeletinngEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// user inputs
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// printing an array
		System.out.println("After inserting elements to the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter the index");
		int in = sc.nextInt();

		int narr[] = delete(arr, in);
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(narr[i]);
		}
		sc.close();
	}

	static int[] delete(int arr[], int in) {
		if (in > arr.length || in < 0) {
			System.out.println("Invalid input");
			return arr;
		}
		int narr[] = new int[arr.length - 1];
		for (int i = 0; i < in; i++) {
			narr[i] = arr[i];
		}
		for (int i = in; i < arr.length-1; i++) {
			narr[i] = arr[i + 1];
		}

		return narr;
	}

}
