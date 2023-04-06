package objects_Methods;

public class MethodWithReturn {

	double product(int p, double r, float t) {
		return p * r * t;
	}

	void simpleIn(double product) {
		System.out.println("simple intrest is : " + (product / 100));
	}

	public static void main(String[] args) {

		MethodWithReturn m1 = new MethodWithReturn();
		double d = m1.product(3000, 7.5, 10);
		m1.simpleIn(d);
	}

}

