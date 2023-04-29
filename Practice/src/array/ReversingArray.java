package array;

import java.util.*;

public class ReversingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int c=sc.nextInt();
		char a[]=new char[c];
		System.out.println("Enter "+c+" Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		for(int i=0;i<a.length/2;i++) {
			char temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]= temp;
			
		}
		System.out.println("after reversing");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
