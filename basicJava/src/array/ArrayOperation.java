package array;

public class ArrayOperation {
	void arrLength(int arr[]) {
		System.out.println("Length of an array : " + arr.length);
	}

	void displayElements(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				
			}
		}
		System.out.println();
	}

	void printEven(int arr[]) {
		for (int i = 0; i <= arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	void multiple(int ar[]) {
		for (int i = 0; i <= ar.length-1; i++) {
			if(ar[i]%3==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 22, 31, 67, 89, 90, 52 };
		int ar[]= {1,2,3,4,5,6,9,12,14,15};
		ArrayOperation a=new ArrayOperation();
		a.arrLength(arr);
		a.displayElements(arr);
		a.printEven(arr);
		a.multiple(ar);
	}

}
