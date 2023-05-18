package array;

public class Car {
	int id;
	String name;
	int price;

	Car(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

}
