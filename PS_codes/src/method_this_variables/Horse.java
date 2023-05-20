package method_this_variables;

public class Horse {
	String name;

	public void run() {
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(this.name+" running");
		jump();
	}
	public void jump() {
		System.out.println(this.name+" jumping");
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.name = "Breego";
		Horse h2 = new Horse();
		h2.name = "Chetak";

		h1.run();
		h2.run();
	}

}
