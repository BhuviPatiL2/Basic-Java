package inheritance_MethodOveriding;

public class TestHuman {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="Student";
		s.age=18;
		s.contact=8857982;
		s.eat();
		s.sleep();
		s.study();
		System.out.println("-------------------------");
		
		Teacher t=new Teacher();
		t.name="Teacher";
		t.age=45;
		t.contact=789867;
		t.sleep();
		t.eat();
		t.teaching();
		System.out.println("-------------------------");
		
		Employee e=new Employee();
		e.name="Employee";
		e.age=27;
		e.contact=99999;
		e.sleep();
		e.eat();
		e.work();
	}

}
