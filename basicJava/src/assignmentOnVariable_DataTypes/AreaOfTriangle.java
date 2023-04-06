package assignmentOnVariable_DataTypes;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the height of triangle");
		int h=sc.nextInt();
		System.out.println("Enter base of triangle ");
		int b=sc.nextInt();
		float area=0.5f*b*h;
		System.out.println("Area of triangle is : "+area);

	}

}
