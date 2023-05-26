package constructoorChaining;

public class Car {
	Car(String s) {
		this(120);
		System.out.println("I am string constructor");
	}

	Car(int model) {
		this("KA10ASQRT", 1122897858);
		System.out.println("I am int param constuctor");
	}

	Car(String regNo, long vehicleID) {
		System.out.println("I am string and long constructor");
	}
}
