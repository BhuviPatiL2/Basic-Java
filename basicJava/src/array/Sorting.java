package array;

import java.util.*;

public class Sorting {

	public void ascendingSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		System.out.println("Second Highest: " + arr[arr.length - 2]);
		System.out.println("Minimum:" + arr[0]);
		System.out.println("Second minimum: " + arr[1]);
	}

	public void DescendingSort(int arr1[]) {
		for (int i = 0; i > arr1.length; i++) {
			for (int j = 0; j < arr1.length - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}

			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr1));
		System.out.println("Second Highest: " + arr1[1]);
		System.out.println("Minimum:" + arr1[arr1.length-1]);
		System.out.println("Second minimum: " + arr1[arr1.length-2]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 20, 34, 5, 56, 13, 2 };
		System.out.println("Original Array:" + Arrays.toString(arr));
		Sorting s = new Sorting();
		s.ascendingSort(arr);

		int size;
		System.out.println("ENTER THE SIZE OF ARRAY");
		size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter array element ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		s.DescendingSort(arr1);

	}

}
