package constructoorChaining;

public class Trainer extends Human {

	Trainer() {
		this(23);
		System.out.println("I am sub class constructor");

	}

	Trainer(int i) {
		System.out.println("I am sub-class int constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t = new Trainer();
	}

}
