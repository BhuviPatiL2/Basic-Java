package constructoorChaining;

class Student {
	String name;
	int mockrating;
	double per;
	int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Student(String name, int id, double per) {
		this(name, id);
		this.per = per;
	}

	Student(String name, int id, double per, int mockrating) {
		this(name, id, per);
		this.mockrating = mockrating;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Dinga", 110);
		Student s2 = new Student("Sundra", 110, 87.20);
		Student s3 = new Student("Dingi", 110, 67.12, 4);
		System.out.println(s1.name + " " + s1.id + " " + s1.per + " " + s1.mockrating);
		System.out.println(s2.name + " " + s2.id + " " + s2.per + " " + s2.mockrating);

		System.out.println(s3.name + " " + s3.id + " " + s3.per + " " + s3.mockrating);

	}
}
