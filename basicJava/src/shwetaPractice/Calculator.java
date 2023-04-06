package shwetaPractice;

public class Calculator {
	String name = "casio";
	double price = 500.60;

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("sum after add is " + c);
		return c;
	}

	public int sub(int x, int y) {
		int z = x - y;
		System.out.println("RESULT after SUB is " + z);
		return z;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Name of calculator :" + c.name);
		c.add(20, 30);
		c.sub(50, 10);

	}

}
