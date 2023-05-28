package upcasting_downcasting;

public class Demo {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle v1 = new Car(); // upcast
		Vehicle v2 = new Bike(); // upcast
		Car c = (Car) v1;// downcast
		System.out.println("casted perfectly");
		Car c1=(Car)v2;

	}
}