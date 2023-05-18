package array;
// doubt ----;(     method output can not display 
import java.util.*;

public class SecondLargest {
static int size;


	//display array
	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void minmax(int arr[]) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				arr[i]=min;	
			}if(arr[i]>max) {
				arr[i]=max;
			}
		}
		System.out.println("maximum :"+max);
		System.out.println("minimum :"+min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+ i+" element");
			arr[i] = sc.nextInt();
		}
		
		display(arr);
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("after sorting ");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		System.out.println();
			System.out.println("Second largest element "+ arr[size-2]);
		//secondLarge(arr,size);
		
		
			
			
			minmax(arr);
			
			
			sc.close();
	}

}
