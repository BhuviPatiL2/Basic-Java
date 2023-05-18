package interviewIMP;
import java.util.*;
public class ArmstrongNum {
//152= 1+125+27=153
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=sc.nextInt();
	int count=0;
	int num2=num;
	int sum=0;
	int temp=num;
	//count the number of digits in num
	while(num>0) {
		num=num/10;
		count++;
	}
	//calulate the sum
	while(num2>0) {
		int rem=num2%10;
		sum=sum+(int)Math.pow(rem, count);
		num2=num2/10;
	}
	if(sum==temp) {
		System.out.println("The num is armstrong");
	}else {
		System.out.println("The num is not an armstrong");

	}
	sc.close();
	}
	

}








