package array;

import java.util.*;

public class Biggest_SmallestEle {

	static void display(int[] arr) {
		System.out.println("After inserting the elements to array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);
		arr = sort(arr);
		System.out.println(arr[0] + " smallest");
		System.out.println(arr[arr.length - 1] + " Biggest");
		sc.close();
	}
	
	// sort method

	static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}
}
