package exception;
import java.util.*;
public class Calculator {

	
	void  add(int a,int b) {
		System.out.println("Sum :"+ a+b);
	}

	void  div(int a,int b) {
		System.out.println("Division :"+ a/b);
	}

	void  mul(int a,int b) {
		System.out.println("Multiplication :"+ a*b);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b =sc.nextInt();
	Calculator c=new Calculator();
	c.add(a, b);
	try {
	c.div(a, b);
	}catch(ArithmeticException e) {
		//System.out.println(e);
		e.printStackTrace();
	}
	c.mul(a, b);
	System.out.println("Done");
	sc.close();
	}
	
	
	
	
	

}
