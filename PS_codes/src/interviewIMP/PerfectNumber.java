package interviewIMP;

import java.util.*;

public class PerfectNumber {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;

			}
		}
			if (sum == num) {
				System.out.println("The number is perfect");
			} else {
				System.out.println("The number is NOtperfect");
			}

		}
	}

