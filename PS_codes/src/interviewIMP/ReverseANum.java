package interviewIMP;
import java.util.*;
public class ReverseANum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}

//palindrome num, count the digits of a given number