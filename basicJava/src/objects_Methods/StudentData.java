package objects_Methods;

public class StudentData {
	int id;
	String name;
	String email;
	String contact;

	double salary;

	void data(int i, String n, String e, String c) {
		id = i;
		name = n;
		email = e;
		contact = c;
	}

	void display() {
		System.out.println(id + " " + name + " " + email + " " + contact + " ");
	}

}
