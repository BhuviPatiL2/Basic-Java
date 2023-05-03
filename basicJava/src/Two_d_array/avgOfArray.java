package Two_d_array;

import java.util.*;

public class avgOfArray {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value" + "[ " + i + " ]" + "[ " + j + " ]");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			avg = sum / arr[i].length;
			System.out.println(avg);
		}

		sc.close();
	}
}
