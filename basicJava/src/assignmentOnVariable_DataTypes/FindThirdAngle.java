package assignmentOnVariable_DataTypes;
import java.util.*;
public class FindThirdAngle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two angle of trangle to find 3rd angle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int third=180-sum;
		System.out.println("The Third angle is : "+third);
		

	}

}
