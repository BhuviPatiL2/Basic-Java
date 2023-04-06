package assignmentOnVariable_DataTypes;

import java.util.*;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter base value");
		int b=sc.nextInt();
		System.out.println("Enter power value");
		int p=sc.nextInt();
		int e=1,r=1;
		while(e<=p) {
		
		r*=b;
		e++;
		}
		System.out.println(r);
	}

}
