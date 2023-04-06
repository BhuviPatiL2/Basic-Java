package constructor;

public class Demo {
	public static void main(String[] args) {
		int num = 78901;
		int max = num % 10; // 1
		num = num / 10; // 7890
		while (num > 0) {
			int n = num % 10; // 0
			if (n > max) {
				max = n;
			}
			num = num / 10;
		}
		System.out.println(max);

	}

}
