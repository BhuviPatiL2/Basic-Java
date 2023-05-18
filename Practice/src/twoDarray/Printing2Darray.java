package twoDarray;

//sum of rows ,
//sum of columns,
//printing 2d array taking user i/p
//spares matrix
import java.util.*;

public class Printing2Darray {
	static int size;

	// sum of rows
	static void sumOfRow(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("sum of row " + sum);
		}
	}

	// sum of columns
	static void sumOfcol(int arr[][]) {
		int sum = 0;
		for (int j = 0; j < arr[0].length; j++) {
			sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			System.out.println("sum of col" + sum);
		}
	}

	// spares matrix
	static void sparesMatrix(int arr[][]) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					count++;
				}
			}
		}
		// System.out.println(count);
		if (count > size / 2) {
			System.out.println(" It is Spares Matrix");
		} else {
			System.out.println(" It is not a Spares Matrix");
		}
	}

	static void subtraction(int arr[][], int ar[][]) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// taking user input
		System.out.println("enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc.nextInt();
		size = rows * cols;
		int[][] arr = new int[rows][cols];

		
	//taking user input 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the values " + i + j);
				arr[i][j] = sc.nextInt();
			}
		}

		// printing 2d array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j] + " "));
			}

			System.out.println();

		}
		
		sumOfRow(arr);

		System.out.println("-------------------------");

		sumOfcol(arr);

		System.out.println("-------------------------");

		sparesMatrix(arr);

		System.out.println("-------------------------");

	}

}
