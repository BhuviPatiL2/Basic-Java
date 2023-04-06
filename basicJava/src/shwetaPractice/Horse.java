package shwetaPractice;

public class Horse {
	String name;

	void run() {
		System.out.println(this);
		System.out.println(this.name + " is running");
		jump();
	}

	void jump() {
		System.out.println(this.name + " is jumpping");
	}
}
