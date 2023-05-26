package constructor_constructorOverloading;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Sundra");
		Employee e2 = new Employee("Sundra", 25000);
		Employee e3 = new Employee("Sundra", 40000, 10000);
		System.out.println(e1.name + " " + e1.sal + " " + e1.in);
		System.out.println(e2.name + " " + e2.sal + " " + e2.in);
		System.out.println(e3.name + " " + e3.sal + " " + e3.in);

	}

}
