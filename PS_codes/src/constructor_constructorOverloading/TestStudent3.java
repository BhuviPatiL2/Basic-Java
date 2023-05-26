package constructor_constructorOverloading;

public class TestStudent3 {

	public static void main(String[] args) {
		Student3 s1 = new Student3("Sundra", 112);
		Student3 s11 = new Student3("Gunda", 115, 35.5);
		Student3 s111 = new Student3("Dinga", 114, 40.2, 4);
		System.out.println(s1.name + " " + s1.id + " " + s1.perc + " " + s1.mockrating);
		System.out.println(s11.name + " " + s11.id + " " + s11.perc + " " + s11.mockrating);

		System.out.println(s111.name + " " + s111.id + " " + s111.perc + " " + s111.mockrating);

	}

}
