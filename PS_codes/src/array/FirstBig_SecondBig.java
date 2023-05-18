package array;

import java.util.*;

public class FirstBig_SecondBig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
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
		int fbig = arr[0];
		int sbig = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if (fbig < arr[i]) {
				fbig = arr[i];
				sbig = fbig;
			} else if (sbig >arr[i]) {
				sbig = arr[i];
			}

		}
		System.out.println(fbig);
		System.out.println(sbig);

	}

}
