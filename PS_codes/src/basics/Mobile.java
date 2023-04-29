package basics;

public class Mobile {

	String name;
	long mobileNo;
	double price;

	public void SendingSMS() {
		System.out.println("U can send SMS ");
	}

	public void calling() {
		System.out.println("U can call");

	}

	Mobile() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.SendingSMS();
		m.calling();
	}

}
