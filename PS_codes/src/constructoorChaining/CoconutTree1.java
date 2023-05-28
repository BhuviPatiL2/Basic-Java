package constructoorChaining;

public class CoconutTree1 extends Tree1 {

	double price;

	CoconutTree1() {
		this(50);
		System.out.println("gama");
	}

	CoconutTree1(double d) {
		System.out.println("double parameter");
	}

	CoconutTree1(int i) {
		System.out.println("Alpha");
	}

	public static void main(String[] args) {
		CoconutTree1 c1 = new CoconutTree1();
	}
}
