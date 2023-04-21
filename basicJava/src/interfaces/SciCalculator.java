package interfaces;
import java.util.*;
public class SciCalculator implements Calculator {
	int res,sum;
	@Override
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	@Override
	public int sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
		return c;
	}
	@Override
	public int mul(int a,int b) {
		int c=a*b;
		System.out.println(c);
		return c;
	}
	@Override
	public int div(int a,int b) {
		int c=a/b;
		System.out.println(c);
		return c;
	}
	
	public void power() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculat the power");
		int a=sc.nextInt();
		System.out.println("Enter power");
		int b=sc.nextInt();
		while(a>0) {
			for(int i=1;i<=b;i++) {
				res=a*i;
				 sum=a*i+res;
				
			}
			System.out.println(sum);
		  
		}
		
	}
	
	

}
