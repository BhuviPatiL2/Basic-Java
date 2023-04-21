package array;

import java.util.*;
import java.util.Arrays;

public class ReversingArray {
	
	int a;

	void reverseArray(int arr[]) {
		int l = arr.length;
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[l - i - 1];
			arr[l - i - 1] = temp;
		}
		System.out.println("Reverse Array :" + Arrays.toString(arr));
	}

	void reverse1(int arr1[]) {
		int l = arr1.length; // {5,6,7,8,1,2,3,4}
		int mid = arr1.length / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr1[i];
			arr1[i] = arr1[(i + 4)];
			arr1[(i + 4)] = temp;
		}

		System.out.println(Arrays.toString(arr1));
	}

	void count(int arr2[],int a) {
		System.out.println("Enter any no from given array to see the no.of ocuurancces ");
		//int a=2;
		int count=0;
		for(int i=1;i<=arr2.length-1;i++) {
			if(arr2[i]==a) {
				count++;	
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 1, 2, 1, 2, 3, 4, 5, 6, 1, 1, 1, 2, 3};
		
		System.out.println(arr.length);
		System.out.println("Original array :" + Arrays.toString(arr));
		ReversingArray r = new ReversingArray();
		r.reverseArray(arr);
		r.reverse1(arr1);
		
		System.out.println("Original array :" + Arrays.toString(arr2));
		System.out.println("Enter any no from given array to see the no.of ocuurancces ");
		int a=scan.nextInt();
		
		r.count(arr2,a);
		
	}

}
