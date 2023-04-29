package array;

import java.util.*;

public class insert_EleToSpecified_Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // creating array 
		System.out.println("Enter the size of an array"); 
		int size = sc.nextInt(); 
		int arr[] = new int[size]; 
		System.out.println("Enter " + size + " elements "); 
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = sc.nextInt(); 
		} // printing array
		 System.out.println("After inserting the elements"); 
		 for (int i = 0; i <arr.length; i++) { 
			 System.out.print(arr[i] + " "); 
			 }
		 
		// taking index and elements
		//int arr[] = { 10, 20, 30, 40, 50 };
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("\n Enter the index");
		int in = sc.nextInt();

		System.out.println("Enter the element which you want to add in above array");
		int ele = sc.nextInt();

		int[] narr = insert(arr, in, ele);
		for (int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + " ");
			sc.close();
		}
	}

	static int[] insert(int arr[], int in, int ele) {

		if (in > arr.length || in < 0) {
			System.out.println("Invalid");
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
}
