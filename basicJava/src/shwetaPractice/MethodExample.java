package shwetaPractice;

public class MethodExample {
	public void welcome() {
		System.out.println("Welcome");

	}

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		MethodExample m = new MethodExample();
		m.welcome();

		System.out.println(m.add(20, 45));
	}

}
