package constructor_constructorOverloading;

public class Student3 {
	String name;
	int id;
	double perc;
	int mockrating;

	Student3(String name, int id) {
		this.name = name;
		this.id = id;

	}

	Student3(String name, int id, double perc) {
		this.name = name;
		this.id = id;
		this.perc = perc;
	}

	Student3(String name, int id, double perc, int mockrating) {
		this.name = name;
		this.id = id;
		this.perc = perc;
		this.mockrating = mockrating;
	}
}
