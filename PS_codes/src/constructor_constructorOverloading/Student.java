package constructor_constructorOverloading;

public class Student // extends Object
{
	String name;
	int rollNo;
	double per;
	boolean result;

	Student() {
		super();// The default constructor is used to initialize instance variable to the
				// default values based on their data type
}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.per);
		System.out.println(s.result);
	}

}
