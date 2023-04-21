package array;

import java.util.*;

public class ArrayOperation2 {
	// advance for loop /foe each loop
	void sumOfElements(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println("Addition is: " + sum);

	}

	void sqrOfElements(int arr[]) {
		int sq;
		for (int i : arr) {
			sq = i * i;
			System.out.println(sq);

		}
	}
	
	void sumOfEven(int arr[]) {
		int sum=0;
		for(int i:arr) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		
	}
	void reversArray(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("ENTER THE SIZE OF ARRAY");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array element ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayOperation2 op = new ArrayOperation2();
		//op.sumOfElements(arr);
		//op.sqrOfElements(arr);
		op.sumOfEven(arr);
         op.reversArray(arr);
	}

}
