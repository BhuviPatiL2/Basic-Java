package constructoorChaining;

public class Trainer1 extends Human1 {
	Trainer1() {
		// super ......compiler generated
		System.out.println("I am subclass constructor");
	}

	public static void main(String[] args) {
		Trainer1 t = new Trainer1();
	}
}
