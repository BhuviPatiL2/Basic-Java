package array;

import java.util.*;

public class SecondOccurance {
	static int occurance(int arr[], int ele, int occ) {
		int count = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
			if (count == occ) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the " + size + " Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Enter the element ");
		int ele = sc.nextInt();
		System.out.println("Enter the occurance which u want ");
		int occ = sc.nextInt();
		int index = occurance(arr, ele, occ);
		if(index>=0) {
			System.out.println("The element occured for "+occ+" times in index "+ index);
		}else {
			System.out.println("The  element is not ocuured "+occ +" times");
		}

	}
}
