package shwetaPractice;

public class Tap {
	public void water() {
		System.out.print("Shweta");
		display();

	}

	public void display() {
		System.out.println(" is a good girl");
		display1();
	}
	public void display1() {
		System.out.println("Enter your name to know ");
	}
	

	public static void main(String[] args) {
		System.out.println("hiiii");
		Tap t1 = new Tap();
		t1.water();
	}

}
