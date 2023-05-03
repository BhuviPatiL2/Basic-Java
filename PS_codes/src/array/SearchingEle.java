package array;

import java.util.*;

public class SearchingEle {

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static int search(int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter " + a + " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);
		System.out.println("Enter the element");
		int ele = sc.nextInt();
		int res = search(arr, ele);
		System.out.println("Index of that element "+res);
     sc.close();
	}

}
