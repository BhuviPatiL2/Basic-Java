package objects_Methods;
import java.util.*;
public class Calculation {
Scanner sc=new Scanner (System.in);
void add(int a,int b) {
	int z=a+b;
	System.out.println(z);
	
}
void sub(int a,int b) {
	System.out.println("Enter two numbers");
	int p=sc.nextInt();
	int q=sc.nextInt();
	int z=a-b;
	System.out.println(z);
	
}
void mul(int a,int b) {
	System.out.println("Enter two numbers");
	int p=sc.nextInt();
	int q=sc.nextInt();
	int z=a*b;
	System.out.println(z);
	
}
void div(int a,int b) {
System.out.println("Enter two numbers");
int p=sc.nextInt();
int q=sc.nextInt();
	while(b==0 || b<=0) {
		System.out.println("Enter positive nonzero number for divison");
	}
	int d=sc.nextInt();
	int z=a/b;
	System.out.println(z);
	
}
}
