package writenTests;

public class Series {
	double series(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			double term = 1.0 / i;
			sum += term;
		}
		return sum;
	}

	double series(double a, double n) {
		double sum = 0;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			int e = x + 1;
			double term = x / Math.pow(a, e);
			sum += term;
			x += 3;
		}
		return sum;
	}

	public static void main(String args[]) {
		Series s1 = new Series();
		System.out.println("1st series sum = " + s1.series(5));
		System.out.println("2nd series sum = " + s1.series(3, 8));
	}

}
