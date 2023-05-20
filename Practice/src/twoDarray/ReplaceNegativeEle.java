package twoDarray;

import java.util.*;

public class ReplaceNegativeEle {
	static public void replaceN(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				arr[i] = (arr[i - 1]) * (arr[i - 1]);
				
			}		
		}
	System.out.println(Arrays.toString(arr));
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		
		
		replaceN(arr);
	}

}
