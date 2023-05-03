package array;

import java.util.*;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void display(int arr[]) {
		System.out.println("After inserting the elements to an array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void reverse(int arr[]) {

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}
		System.out.println("After reversing ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	static int[] delete(int arr[], int in) {
		if (in > arr.length || in < 0) {
			System.out.println("invalid input");
			return arr;
		}

		int narr[] = new int[arr.length - 1];
		for (int i = 0; i < in; i++) {
			narr[i] = arr[i];
		}
		for (int i = in; i < arr.length - 1; i++) {
			narr[i] = arr[i + 1];
		}

		return narr;
	}

	static int[] add(int arr[], int index, int ele) {
		if (index > arr.length || index < 0) {
			System.out.println("invalid input");
			return arr;
		}
		
		int narr[]=new int [arr.length+1];
		for(int i=0;i<index;i++) {
			narr[i]=arr[i];
		}
		narr[index]=ele;
		for(int i=0;i<arr.length+1;i++) {
			narr[i]=arr[i+1];
		}
	
		return narr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayPractice a = new ArrayPractice();
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		// calling a method
		a.display(arr);
		//a.reverse(arr);

		/* taking user input for deleting an array
		System.out.println("Enter the index of an elemnet ehich u want to delete from the above array");
		int in = sc.nextInt();
		int narr[] = delete(arr, in);
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(narr[i]);
		}
*/
		// adding element to an array
		System.out.println("Enter the index where you want to add an element ");
		int index = sc.nextInt();
		System.out.println("Enter the element ");
		int ele = sc.nextInt();

		int na[] = add(arr, index, ele);
		for (int i = 0; i < arr.length + 1; i++) {
			System.out.println(na[i]);
		}

		
	}

}
