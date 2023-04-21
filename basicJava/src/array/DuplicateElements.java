package array;

import java.util.Arrays;

public class DuplicateElements {
	void removeDuplicate(int arr[]) {
		int j=0;
		int a[]=new int [arr.length];
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				a[j]=arr[i];
				j++;
				
			}
		}
		a[j]=arr[arr.length-1];
		for(int i:a) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,4,5,7,8,1,2};
		DuplicateElements d=new DuplicateElements();
		d.removeDuplicate(arr);
	}

}
