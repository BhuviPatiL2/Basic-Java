package exception;

import java.util.Scanner;
public class ThrowsKeyword {
	
	
	void add(int a,int b) {
		System.out.println("Sum :"+a+b);
	}
	void  div(int a,int b) {
		System.out.println("Division :"+ a/b);
	}

	void  mul(int a,int b) {
		System.out.println("Multiplication :"+ a*b);
	}

	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in)	;
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b =sc.nextInt();
		ThrowsKeyword t=new ThrowsKeyword();
		t.add(a, b);
		try {
		t.div(a, b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		t.mul(a, b);
		
		System.out.println("Done");
	}

}
