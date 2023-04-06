package userInput;
import java.util.Scanner;
public class AreaOfSqu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side length of square");
		int a=sc.nextInt();
		int suq=a*a;
		System.out.println("Area of Square: "+suq);

	}

}
