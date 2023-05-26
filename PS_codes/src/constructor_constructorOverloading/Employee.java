package constructor_constructorOverloading;

public class Employee {

	String name;
	long sal;
	int in;

	Employee(String name, long sal) {
		this.name = name;
		this.sal = sal;
	}

	Employee(String name, long sal, int in) {
		this.name = name;
		this.sal = sal;
		this.in = in;
	}

	Employee(String name) {
		this.name = name;
	}

}
