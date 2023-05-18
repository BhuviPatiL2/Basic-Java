package array;

import java.util.*;

public class AvgOfArray {
	static int size;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// taking user input for arr[]
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		// System.out.println("Enter the " + size + " elements");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the " + i + " element");
			arr[i] = sc.nextInt();
		}
		display(arr);
		
		// calling occurrence method 
		System.out.println("Enter the element which u want ");
		int ele1=sc.nextInt();
		
		System.out.println("Enter the no. of ocuurance ");
		int occ=sc.nextInt();
	
		int index=occurance(arr,ele1,occ);
		
		if(index>=0) {
			System.out.println("The element occued for "+occ+" times on index "+index);
		}else {
			System.out.println("The element is not ocuured for "+occ+" times");
		}
		
		// integer average method 
		int a2=average(arr);
		System.out.println(a2);
	     //System.out.println(average (arr));	
		
		//Ascending order
		int []a=ascendingOrder(arr);  //here in this method we return array, thats why a is of type array 
		System.out.print("ascending order  ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		//second small element
		int s=secondSmall(arr,size);                   //here in this method we return integer :. s is of type integer 
		System.out.println("Second Smallest element "+s);
		
		// min max
		maxMin(arr);

		// calling unique method
		unique(arr);

		// duplicate
		duplicate(arr);

		// calling count Even Odd method
		countEvenOdd(arr);

		// calling negative element method
		negativeEle(arr);

		// calling average method with void return type
		avg(arr);

		// calling search method
		System.out.println("Enter the element which u want to scearch in above array");
		int ele= sc.nextInt();
		int res = search(arr, ele);
		System.out.println("The index of that element " + res);

		// calling copied method
		int arr1[] = new int[arr.length];
		copyEle(arr, arr1);
		copiedArray(arr);

		// calling reverse method
		reverse(arr);

		// taking input arr2
		System.out.println("-------------------");
		System.out.println("Enter the size of an array");
		int size1 = sc.nextInt();
		int arr2[] = new int[size1];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("enter the " + i + " element");
			arr2[i] = sc.nextInt();
		}

		// calling common Element method
		System.out.println("1st array");
		display(arr);
		System.out.println("2nd array");
		display1(arr2);

		System.out.println("Common elements in both arrays");
		commonEle(arr, arr2);

		
		sc.close();

	}

	// display integer type of array
	static void display(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	// display1
	static void display1(int arr2[]) {
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	// display 2D array
	static void displya2D(int td[][]) {
		for (int i = 0; i < td.length; i++) {
			for (int j = 0; j < td[i].length; i++) {
				System.out.print(td[i][j] + " ");
			}
			System.out.println();
		}
	}

	// second smallest
	static int secondSmall(int arr[], int size) {
		
		for (int i = 0; i < arr.length; i++) {         //1
			for (int j = i + 1; j < arr.length; j++) {    //3     
				if (arr[i] <arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[size - 2];
	}
	
	
	// for index of no.of occurrences 
	static int occurance(int arr[],int ele,int occ) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				cnt++;
			}
			if(cnt==occ) {
				return i;
			}
			
		}
	return -1;
	}
	
	
	
	
	
	
	
	
	
	
	//ascending order
static int [] ascendingOrder (int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {         //1
			for (int j = i + 1; j < arr.length; j++) {    //3     
				if (arr[i] >arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	

	// find maximum and minimum
	static void maxMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		int indexMin = 0;
		int indexMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}

		System.out.println("Maximum " + max + " " + " Index  of maximum element :" + indexMax);
		System.out.println("Minimum " + min + " " + " Index of minimum element :" + indexMin);
	}

	// duplicate elements
	static void duplicate(int arr[]) {
		int count = 0;
		System.out.print("Duplicate Elements \n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println(+arr[j]);
				}
			}
		}
		System.out.println("Count of duplicate element " + count);
	}

	// unique elements                                    *not completed *
	static void unique(int arr[]) {
		System.out.print("Unique Elements \n");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < i; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		if (count >= 1) {
			for (int i = 0; i < arr.length - count; i++) {
				arr[i] = arr.length - count;

			}
		}
	}

	// find common element
	static void commonEle(int arr[], int arr2[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	// find negative element in a array
	static void negativeEle(int arr[]) {
		int count = 0;
		System.out.println("Negative elements in an array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {

				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println("\nCount of negative element " + count);
	}

	// number of even and odd elements in an array
	static void countEvenOdd(int arr[]) {

		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;

			} else {
				countOdd++;
			}
		}
		System.out.println("Count of even Elements " + countEven);
		System.out.println("Count of odd Elements " + countOdd);
		int even[] = new int[countEven];
		int odd[] = new int[countOdd];

		int o = 0, e = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[e++] = arr[i];
			} else {
				odd[o++] = arr[i];
			}
		}
		System.out.print("Even Array " + "");
		for (int i = 0; i < countEven; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.print("\nOdd Array " + "");
		for (int i = 0; i < countOdd; i++) {
			System.out.print(odd[i] + " ");
		}
		System.out.println();
	}

	// average of elements
	static void avg(int arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		double avg = sum / arr.length;
		System.out.println("\nAverage of elements :" + avg);
	}

	// searching an element
	static int search(int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				return i;
		}
		return -1;
	}

	// copying array to new array
	static void copyEle(int arr[], int arr1[]) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
	}

	static void copiedArray(int arr1[]) {
		System.out.println("Copied Array ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	// reversing an array
	static void reverse(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("Reversing Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// average return integer value method
	static int average(int arr[]) {
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		return avg;
	}

	// average return double value method
	static double average1(double arr2[]) {
		// double avg = 0;
		double sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];
		}
		// avg = sum / arr2.length;
		return sum;
	}
}
