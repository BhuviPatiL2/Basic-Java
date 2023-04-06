//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
package assignmentOnVariable_DataTypes;

import java.util.*;

public class CentimeterToM_KM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Centimeter ");
		int a = sc.nextInt();
		int mod = 0, m;
		if (a > 999) {
			int k = a / 1000;
			mod = a % 1000;
			System.out.print(k + " KiloMeter");
			m = mod;
			System.out.print(" "+m + " Meter");
		} else {
			m = a / 100;
			System.out.print(m + " Meter");
		}
	}
}
