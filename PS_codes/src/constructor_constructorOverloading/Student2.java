package constructor_constructorOverloading;

public class Student2 {
	Student2() {
		System.out.println("0 param");
	}

	Student2(String name) {
		System.out.println("String param");
	}

	Student2(int age) {
		System.out.println("int param");
	}

	public static void main(String[] args) {
		Student2 s2 = new Student2(420);
		Student2 s = new Student2();
		Student2 s1 = new Student2("Sundra");
		//Student2 s1 = new Student2("Sundri",410); //error

	}

}
