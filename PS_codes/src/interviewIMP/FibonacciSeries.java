package interviewIMP;
import java.util.*;
public class FibonacciSeries {
//0,1,1,2,3,5,8,13
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}

}
