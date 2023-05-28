package constructoorChaining;

public class Employee extends Human2 {

	int id;
	long sal;

	Employee(String name, int age, double ht, String dob, int id, long sal) {
		super(name, age, ht, dob);
		this.id = id;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Bhuvi", 22, 5.6, "22May", 110, 37000);
		System.out.println(e1.name + " " + e1.age + " " + e1.ht + " " + e1.dob + " " + e1.id + " " + e1.sal);
	}

}
