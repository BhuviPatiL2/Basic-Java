package constructor_constructorOverloading;

public class Student1 {
	String name; // instance variable
	int marks;

	Student1(String name, int marks) // local variable
	{
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Student1 s = new Student1("Sundra", 420);
		System.out.println(s.name + " " + s.marks);
		
		Student1 s1 = new Student1("Shivani", 444);
		System.out.println(s1.name + " " + s1.marks);
		
		Student1 s2 = new Student1("Sundri", 440);
		System.out.println(s2.name + " " + s2.marks);
		
		Student1 s3 = new Student1("Shweta", 420);
		System.out.println(s3.name + " " + s3.marks);
		
		Student1 s4 = new Student1("Nilam", 400);
		System.out.println(s4.name + " " + s4.marks);

	}

}
