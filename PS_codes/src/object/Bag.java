package object;

public class Bag {
	String color;
	double price = 1200.99;

	public static void main(String[] args) {
		Bag b1 = new Bag();
		b1.color = "Red";
		System.out.println(b1.color);
		Bag b2 = new Bag();
		b2.color = "Black";
		System.out.println("Color of bag :" + b2.color);
		System.out.println("Price of bag " + b2.price);
	}
}
