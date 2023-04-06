package assignmentOnVariable_DataTypes;
import java.util.*;
public class AvgOfFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks obtained in five subjects"+" ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int avg=(a+b+c+d+e)/5;
		System.out.println("Average :"+avg);
	}

}
