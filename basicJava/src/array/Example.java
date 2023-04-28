package array;

import java.util.Arrays;

public class Example {
static	  int arr[]= {3,7,9,24,};
int min;
	
public void find(int arr[]) {
	 min=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]<min) {
			min=arr[i];
			//System.out.println(arr[i]);
		}
		
	}
	System.out.println(min);
	
	
}



public void display() {
	System.out.println(Arrays.toString(arr));
}
 
	public static void main(String[] args) {
	  //  int arr[]= {1,3,7,9,24,};
	  //  int num=5;
	
		Example e=new Example();
		e.find(arr);
		
		
}
}
 /*class Person {
	void show() {     
		
	}
 }


 class Student extends Person{
	 protected  void show() {
			
		}
	
}
}*/