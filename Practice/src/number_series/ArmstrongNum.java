package number_series;

import java.util.*;

public class ArmstrongNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		int num2 = num;
		int sum = 0;
		int temp=num;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		while (num2 > 0) {
			int rem = num2 % 10;
			sum = sum + (int) Math.pow(rem, count);
			num2=num2/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an Armstrong number");
		}
	}
}
