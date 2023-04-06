package allPatterns;
import java.util.*;

public class AllPatterns {

Scanner sc=new Scanner(System.in);
	void rightAngleStar() {
		System.out.println("Enter row number");
		int a = sc.nextInt();
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void leftAngleStar() {
		System.out.println("Enter row number");
		int a = sc.nextInt();
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a-1;j--) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		
	}
}
