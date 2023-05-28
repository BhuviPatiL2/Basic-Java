package casting;

public class Demo {

	public static void main(String[] args) {
		int i = 200;
		byte b = (byte) i; // explicit
		System.out.println(b);

		double d = 45.67;
		int k = (int) d;
		System.out.println(k); // explicit

		long l = i;
		System.out.println(l); // implicit
	}

}
