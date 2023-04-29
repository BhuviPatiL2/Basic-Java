package array;

import java.util.*;

public class Adding_EleToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// original array
		int arr[] = { 11, 22, 33, 44, 55, 66 };
		System.out.println(Arrays.toString(arr));

		// input for index and elements
		System.out.println("Enter the index");
		int in = sc.nextInt();
		System.out.println("Enter the element");
		int ele = sc.nextInt();

		// new array
		int narr[] = insert(arr, in, ele);
		for (int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + " ");
		}
		System.out.println("\nEnter the index");
		int index = sc.nextInt();
		System.out.println("Enter the element");
		int element = sc.nextInt();

		int na[] = replace(arr, index, element);
		for (int j = 0; j < na.length; j++) {
			System.out.print(na[j]+" ");
		}

	}

	static int[] insert(int arr[], int in, int ele) {
		if (in > arr.length || in < 0) {
			System.out.println("Invalid input");
			return arr;
		}

		int narr[] = new int[arr.length + 1];
		for (int i = 0; i < in; i++) {
			narr[i] = arr[i];
		}
		narr[in] = ele;
		for (int i = in; i < arr.length; i++) {
			narr[i + 1] = arr[i];
		}

		return narr;

	}

	static int[] replace(int arr[], int index, int element) {
		if (index > arr.length || index < 0) {
			System.out.println("Invalid input");
			return arr;
		}
		int na[] = new int[arr.length];
		for (int i = 0; i < index; i++) {
			na[i] = arr[i];
		}
		na[index] = element;
		for (int i = index; i < arr.length-1; i++) {
			na[i + 1] = arr[i + 1];
		}
		return na;

	}
}
